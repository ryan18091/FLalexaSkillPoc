package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The best way to find a good OUIL/UBAL lawyer is by reputation. There are a few attorneys" +
                " who have statewide or national reputations; these, of course, are expensive. Thus, the best approach" +
                " is to ask other attorneys or court workers in the jurisdiction, or acquaintances who have also" +
                " shared this experience.\n" +
                "\n" +
                "When you meet with the attorney, make sure of three things:\n" +
                "\n" +
                "He has extensive experience in OUIL/UBAL litigation;\n" +
                "He has a reputation for going to court hearings in appropriate cases, rather than just \"copping out\" his clients; and\n" +
                "The financial terms of representation are clear.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
