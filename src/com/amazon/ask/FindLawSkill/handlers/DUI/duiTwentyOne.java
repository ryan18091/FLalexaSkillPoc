package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "If you’ve been arrested for or convicted of driving under the influence (DUI) in the" +
                " United States, you may be wondering how to clear you record (often called a RAP sheet, short" +
                " for “Record of Arrests and Prosecution”). It may be possible to remove the offense from your" +
                " criminal history through either an expungement or record sealing.To be clear, expungement removes" +
                "the offense from your RAP sheet as if it never happened. Sealing means the court file is hidden" +
                " from the general public. Many states often use the terms interchangeably, which can become quite" +
                " confusing. Complicating matters is that each state has different laws surrounding expungements" +
                " and record sealing. Laws are constantly changing, so be sure to check the most up-to-date statutes" +
                " in your state";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
