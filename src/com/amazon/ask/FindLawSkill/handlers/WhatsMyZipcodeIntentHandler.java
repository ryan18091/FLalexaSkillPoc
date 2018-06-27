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
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class WhatsMyZipcodeIntentHandler implements RequestHandler {
    public static final String ZIPCODE_KEY = "ZIPCODE";
    public static final String ZIPCODE_SLOT = "Zipcode";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("WhatsMyZipcodeIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText;
        String zipcode = (String) input.getAttributesManager().getSessionAttributes().get(ZIPCODE_KEY);

        if (zipcode != null && !zipcode.isEmpty()) {
            speechText = String.format("Your zipcode is <say-as interpret-as=\"address\">%s</say-as>.", zipcode);
        } else {
            // Since the user's favorite color is not set render an error message.
            speechText =
                    "I'm not sure what your zipcode is. You can say,<break time=\".5s\"/> my zipcode is,<break time=\".5s\"/>" +
                            "followed by your zipcode";
        }

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withShouldEndSession(false)
//                .withSimpleCard("ZipCode", speechText)
                .build();
    }
}
