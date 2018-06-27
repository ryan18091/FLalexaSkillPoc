package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEighteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEighteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Many states have passed laws that make driving while under the influence with children" +
                " in the vehicle a felony. A recent high-profile example of this is Leandra's Law in New York. The" +
                " law passed after an 11 year-old girl died when her friend's mother crashed her car while driving" +
                " under the influence. Leandra's Law applies when a child of 15 years or younger is present but be" +
                " sure to check your own state's law since the ages that trigger the law can vary.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
