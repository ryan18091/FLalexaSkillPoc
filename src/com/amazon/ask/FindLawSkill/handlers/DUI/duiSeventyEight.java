package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventyEight implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventyEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "No. The officer is supposed to give a 5th Amendment warning (Miranda) after he " +
                "arrests you. Often, however, they do not. The only consequence is that the prosecution cannot " +
                "use any of your answers to questions asked by the police after the arrest.\n" +
                "\n" +
                "Of more consequence in most cases is the failure to advise you of the state's \"implied consent\"" +
                " law, that is: your legal obligation to take a chemical test and the results if you refuse. This" +
                " can affect the suspension of your license.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
