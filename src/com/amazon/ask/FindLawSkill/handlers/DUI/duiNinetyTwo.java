package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetyTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetyTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "It might seem crazy how much a private criminal defense attorney can charge, with hourly" +
                " rates sometimes as high as $300-$600. If you're unable to afford a private criminal defense attorney," +
                " you may be able to obtain a court-appointed lawyer to represent you. Generally, the lawyer will work" +
                " at the government's expense. In order to obtain a court-appointed lawyer in your case, you're" +
                " generally required to:\n" +
                "\n" +
                "Ask the court for a court-appointed lawyer; and\n" +
                "Provide details about your financial situation to show that you can't afford a private defense" +
                " attorney.\n" +
                "The first time you're able to request a court-appointed lawyer will be the first time you go in " +
                "front of a judge after your arrest, known as your arraignment. You either arrive to the arraignment" +
                " on your own (if you were able to post bail), or escorted by the sheriff's department of your county" +
                " if you weren't able to post bail.\n" +
                "\n" +
                "When the judge calls your case for the arraignment, the first question will be whether or not" +
                " you're represented by an attorney and, if not, whether you want one appointed to your case. If" +
                " so, the judge could simply appoint an attorney already present in court to assist with the" +
                " remainder of your arraignment. However, this lawyer normally will not be the same lawyer appointed" +
                " to you for the duration of your case, which can happen after your arraignment. Some courts will" +
                " postpone the arraignment itself until an attorney is appointed for the duration of your case and" +
                " others could delay all hearings until your financial situation can be investigated to determine" +
                " whether you qualify for a court-appointed lawyer.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
