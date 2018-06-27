package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixty implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixty"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "One of the most important sets of questions to ask your attorney concerns their" +
                " background. For example, is this her first case or is she a DUI veteran? Obviously, the more" +
                " experienced the attorney, the higher the possibility for a better outcome. Here are a few questions" +
                " to ask your DUI lawyer:\n" +
                "\n" +
                "How long have you been representing DUI clients? How many DUI cases do you handle in a year?\n" +
                "Are you a former DUI prosecutor? (Many times former prosecutors open their own criminal defense" +
                " practice).\n" +
                "What percentage of your caseload is devoted to DUIs?\n" +
                "How often to you take cases to trial?\n" +
                "Are you familiar with the prosecutor in my case? Do you normally practice in my county?\n" +
                "How many cases have you been able to successfully plea bargain down to a “wet reckless” or " +
                "outright dismissal?";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
