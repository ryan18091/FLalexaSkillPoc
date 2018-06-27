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

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.*;
import com.amazon.ask.response.ResponseBuilder;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import static com.amazon.ask.FindLawSkill.handlers.WhatsMyZipcodeIntentHandler.ZIPCODE_KEY;
import static com.amazon.ask.FindLawSkill.handlers.WhatsMyZipcodeIntentHandler.ZIPCODE_SLOT;

public class MyZipcodeIsIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("MyZipcodeIsIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();
        Map<String, Slot> slots = intent.getSlots();

        // Get the color slot from the list of slots.
        Slot zipcodeSlot = slots.get(ZIPCODE_SLOT);



        String speechText, repromptText;

        boolean isAskResponse = false;

        // Check for zipcode and create output to user.
        if (zipcodeSlot != null) {
            // Store the user's zipcode in the Session and create response.
            String zipcode = zipcodeSlot.getValue();
            input.getAttributesManager().setSessionAttributes(Collections.singletonMap(ZIPCODE_KEY, zipcode));

            speechText =
                    String.format("I now know that your zipcode is <say-as interpret-as=\"address\">%s</say-as>." +
                            " You can change your zipcode at any time by saying reset my zipcode " +
                            "<break time=\".5s\"/> followed by your zipcode." +
                            " <break time=\".5s\"/>To find legal help in your area, say, find me legal help", zipcode);
            repromptText =
                    "You can ask me your zipcode is set to by saying, what's my zipcode?";

        } else {
            // Render an error since we don't know what the users favorite color is.
            speechText = "I'm not sure what your zipcode is, please try again";
            repromptText =
                    "I'm not sure what your zipcode is. You can tell me your zipcode "
                            + " by saying, my zipcode is";
            isAskResponse = true;
        }

        ResponseBuilder responseBuilder = input.getResponseBuilder();

        responseBuilder.withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false);

        if (isAskResponse) {
            responseBuilder.withShouldEndSession(false)
                    .withReprompt(repromptText);
        }

        return responseBuilder.build();
    }

}
