package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetyOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Due to recent law enforcement trends that focus on preventing DUI by penalizing offender" +
                "s harshly, most district attorney offices refuse to negotiate plea bargains in DUI cases. This is" +
                " especially true if evidence of the violation is strong. In fact, many states have enacted laws" +
                " that prohibit government attorneys from entering into plea bargains with DUI defendants. However," +
                " in rare cases a DUI charge may be reduced to a lesser offense like reckless driving or" +
                " an \"open beverage\" violation.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
