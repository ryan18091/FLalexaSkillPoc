package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText ="Ask another question, or ask for legal help" ;

        String speechText = "While a first-time DUI with no injuries may not result in deportation for otherwise " +
                "law-abiding immigrants, a DUI conviction — or even just an arrest — could raise a red flag when " +
                "it comes time to renew an immigrant visa. Offenders hoping to become a naturalized citizen could " +
                "also face difficulties — for example, in meeting the good moral character requirement.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
