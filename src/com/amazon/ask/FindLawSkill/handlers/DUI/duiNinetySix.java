package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Mandatory alcohol education, assessment and treatment laws require attendance at" +
                " DUI prevention programs geared toward alcohol education or therapy. Sometimes, as part " +
                "of a suspended sentencing arrangement or condition of probation, a judge may order DUI/DWI " +
                "offenders to attend such programs to teach them about alcohol dependency and the consequences " +
                "of DUI.\n" +
                "\n" +
                "Known sometimes as \"DUI School,\" \"Drunk-Driving Education\" or \"AEP,\" alcohol education" +
                " programs can often replace, reduce, or eliminate harsher penalties in drunk-driving cases, such" +
                " as court fines, license suspension, and jail time.\n" +
                "\n" +
                "DUI offenders who successfully complete the terms of their alcohol education or therapy program " +
                "sometimes may have their driving privileges restored. Conversely, offenders who fail to comply" +
                " with the terms of their program are not eligible for license reinstatement and may be returned" +
                " to the courts for further action.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
