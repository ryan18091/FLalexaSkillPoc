/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.FindLawSkill.handlers;

import com.amazon.ask.FindLawSkill.Lawyer;
import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.List;
import java.util.Optional;

import static com.amazon.ask.FindLawSkill.handlers.WhatsMyZipcodeIntentHandler.ZIPCODE_KEY;
import static com.amazon.ask.request.Predicates.intentName;

public class FindALawyerIntentHandler implements RequestHandler {



    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("FindALawyer"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String speechText;
        Template template = null;
        String zipcode = (String) input.getAttributesManager().getSessionAttributes().get(ZIPCODE_KEY);


        if (zipcode != null && !zipcode.isEmpty()){

            int intZip = Integer.parseInt(zipcode);

            Lawyer lawyer = new Lawyer();

            List<Lawyer> lawyerList = lawyer.csvToLawyerList();
            Lawyer nearestLawyer = new Lawyer();
            int nearestLawyerDistance = 60000;




            for(Lawyer l : lawyerList) {
                int distanceToLawyer = Math.abs(intZip - Integer.parseInt(l.getZip()));
                if(distanceToLawyer <= nearestLawyerDistance) {
                    nearestLawyerDistance = distanceToLawyer;
                    nearestLawyer = l;
                }
            }

            String title = nearestLawyer.getFirst_name() + ' ' + nearestLawyer.getLast_name();
            String primaryText = nearestLawyer.getFirm_name();
            String secondaryText = nearestLawyer.getWeb();
            String imageUrl = nearestLawyer.getPhone2();

            Template3 template3 = new Template3();

            Image image = template3.getImage(imageUrl);

            template = template3.getBodyTemplate3(title, primaryText, secondaryText, image);




//            speechText = String.format("You are all set to find a lawyer in %s.", nearestLawyer.toString());
            speechText = String.format("I recommend %s, with the firm %s. They are located in %s.",
                    nearestLawyer.getFirst_name(), nearestLawyer.getFirm_name(),
                    nearestLawyer.getCity());

            // Device supports display interface
            if(null!=input.getRequestEnvelope().getContext().getDisplay()) {
                return input.getResponseBuilder()
                        .withSpeech(speechText)
                        .withSimpleCard(title, speechText)
                        .addRenderTemplateDirective(template)
                        .withReprompt(speechText)
                        .build();
            } else {
                // Headless device
                return input.getResponseBuilder()
                        .withSpeech(speechText)
                        .withSimpleCard(title, speechText)
                        .withReprompt(speechText)
                        .build();
            }


        } else {
            speechText = "I can sure help you with that. To find the legal help near you, I will need the zipcode" +
                    " where you want to receive legal help. Start by  saying  <break time=\".5s\"/> my zipcode is <break time=\"1s\"/>" +
                    " followed by your zipcode.";

            String title = "Welcome to Find Law";
            String primaryText = "";
            String secondaryText = "";
            String imageUrl = "https://www.findlawimages.com/public/thumbnails_62x62/findlaw_62x62.png";

            Template3 template3 = new Template3();

            Image image = template3.getImage(imageUrl);


            template = template3.getBodyTemplate3(title, primaryText, secondaryText, image);

            // Device supports display interface
            if(null!=input.getRequestEnvelope().getContext().getDisplay()) {
                return input.getResponseBuilder()
                        .withSpeech(speechText)
                        .withSimpleCard(title, speechText)
                        .addRenderTemplateDirective(template)
                        .withReprompt(speechText)
                        .build();
            } else {
                // Headless device
                return input.getResponseBuilder()
                        .withSpeech(speechText)
                        .withSimpleCard(title, speechText)
                        .withReprompt(speechText)
                        .build();
            }



        }

    }



}






