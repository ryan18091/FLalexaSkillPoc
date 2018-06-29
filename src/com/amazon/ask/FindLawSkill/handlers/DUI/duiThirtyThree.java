package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiThirtyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiThirtyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "Driving while ability impaired";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "<say-as interpret-as=\"spell-out\">DWAI</say-as> - Driving while ability impaired";

        // Device supports display interface
        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard(title, primaryText)
                    .withReprompt(secondaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withReprompt(secondaryText)
                    .build();
        }
    }
}
