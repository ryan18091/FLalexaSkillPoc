package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFifteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFifteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Every state currently has a .08 percent \"per se\" DUI rule in effect. This rule states" +
                " that, if a driver has a BAC of .08 or above, the state can assume that the driver is intoxicated in" +
                " violation of the statute.In addition, states commonly will elevate a drunk driving charge to a felony" +
                " if chemical tests reveal that the driver's BAC exceeds a certain elevated level set by law - usually" +
                " around .16 percent. Not every state has this law, but at the minimum states generally impose a " +
                "harsher punishment for a high BAC.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
