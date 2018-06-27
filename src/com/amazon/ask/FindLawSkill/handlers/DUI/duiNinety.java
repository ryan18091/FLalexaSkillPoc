package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinety implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinety"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "If you are involved in an accident caused by a drunk driver, and can prove it, then" +
                " you may claim damages in a civil lawsuit. You may also pursue a wrongful death lawsuit if a" +
                " family member was killed in an accident caused by a drunk driver.\n" +
                "\n" +
                "In order to make your case, you will have to establish the intoxication level of the defendant," +
                " prove that this level was too high for safe operation of a motor vehicle, and show that the" +
                " defendant failed to exercise reasonable care for the public's safety. Evidence used in such a" +
                " case will usually include a police report of the incident, witness reports (if available)," +
                " and expert opinions.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
