package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Courts also will hand down elevated sentences if the driver has had multiple DUI " +
                "convictions, sometimes even when one or more of the multiple convictions occurred in another" +
                " state or states. States give harsher punishments to repeat offenders in order to discourage" +
                " people from driving under the influence of drugs or alcohol after their first DUI conviction. " +
                "States have different systems for penalizing repeat offenders, so DUI defendants should check" +
                " their particular state's law or consult with an experienced DUI attorney for more information.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
