package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "A DUI conviction, or even an impaired driving charge that does not end in a conviction," +
                " may negatively impact one's career, particularly if an offender holds a commercial driver's license" +
                " (CDL) or is required to drive as part of his or her job.\n" +
                "\n" +
                "An employer may choose to conduct background checks on current or prospective employees for any" +
                " number of reasons, some more valid (and legal) than others. Depending on how the background check" +
                " is conducted, it may expose a DUI charge or conviction. But the limits of an employer's ability" +
                " to conduct such checks, and whether or not a DUI offense should be considered in a hiring" +
                " (or firing) decision, is governed mostly by state laws.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
