package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtySeven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtySeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The larger, more-accurate instruments used at the police station are subject to very" +
                " strict procedures and calibration standards. Those instruments (or Breathalyzers, as they're " +
                "often called) also have safeguards to prevent false-positives and are generally considered quite" +
                " accurate. While it's difficult for a defense attorney to challenge the results of a Breathalyzer" +
                " test, the results from PAS devices are excluded in many states because they don't meet these" +
                " high standards of reliability and accuracy.\n" +
                "\n" +
                "Therefore, the PAS device is one of several tools for determining whether a motorist should be " +
                "arrested for a DUI, while the stationary breath screening instrument at the police station is " +
                "used to establish a criminal case against the defendant.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
