package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightySeven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightySeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Motorists who live in states that permit the medical use of marijuana with a valid" +
                " doctor's recommendation may still be charged with a DUI. So if the officer and/or drug recognition" +
                " expert has gathered enough evidence of marijuana impairment, an otherwise valid medical exemption" +
                " may not be used as a defense. In this regard, medical marijuana is no different than other" +
                " prescription drugs with the potential for impairment.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
