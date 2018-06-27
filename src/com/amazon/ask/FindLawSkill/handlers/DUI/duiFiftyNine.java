package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "While it's not always an option, often dependent on specific state regulations, a" +
                " DUI offender may choose to expunge his or her record. Expungement is a court-ordered process " +
                "which effectively \"seals\" a record of arrest or a criminal conviction.\n" +
                "\n" +
                "Many states limit expungement to just arrests that do not result in a conviction. The charge " +
                "or conviction is not completely \"erased,\" per se, but is sealed for most purposes, including " +
                "most employment-related background checks.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
