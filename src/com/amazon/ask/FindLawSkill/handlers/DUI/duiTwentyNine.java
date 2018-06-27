package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The terms of a DUI probation will vary from state to state. Generally, they include " +
                "regular check-ins with a probation officer or the court, taking alcohol awareness classes or" +
                " addiction counseling, community service, avoiding being arrested for any reason, and maintaining" +
                " a 0.00% BAC when driving. In some states, and for repeat offenders, there could even be ankle" +
                " bracelet monitoring, or ignition interlock devices required.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
