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

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "FindLaw POC";
        String primaryText = "Ask a question or say \"get legal help\"";
        String secondaryText = "";
        String speechText = "Welcome to Find Law, I can help you with your legal questions or I can help you find legal " +
                "help near you. <break time=\".5s\"/> Ask a question or say get legal help.";
        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/diverse-mixed-age-group+(1).png" ;

        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1(title,primaryText,secondaryText,
                image);

        // Device supports display interface
        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .addRenderTemplateDirective(template)
                    .withReprompt(primaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withReprompt(primaryText)
                    .build();
        }
    }

}
