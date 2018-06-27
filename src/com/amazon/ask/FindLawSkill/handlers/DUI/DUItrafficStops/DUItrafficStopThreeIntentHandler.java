package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopThreeIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "In general, you are allowed to refuse to take a chemical blood alcohol level test, but" +
                " if you do, you will invoke an \"implied consent\" law. This will likely result in a suspension of" +
                " your driver's license for a period of time, even if you are found not guilty in court. In addition, " +
                "if your case does go to trial, the prosecutor is free to tell the jury that you refused to take a " +
                "chemical test, which may look bad for your drunk driving defense.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
