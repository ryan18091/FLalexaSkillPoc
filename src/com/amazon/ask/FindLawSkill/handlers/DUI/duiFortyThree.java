package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFortyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFortyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "A driver's license will be automatically suspended upon a DWI arrest, however in most" +
                " circumstances a person is given a seven-day temporary license to drive before the suspension" +
                " goes into effect. A driver may be able to successfully appeal the license suspension in some" +
                " situations.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
