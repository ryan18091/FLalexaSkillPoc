package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFortySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFortySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "It depends. Every state has its own laws and penalties. In most cases, you can face" +
                " up to a year in county jail, but usually serve far less time. Often times, if you don’t have a" +
                " high blood alcohol content (BAC) and an otherwise clean record, you may be able to serve your " +
                "jail sentence on an alternative work or community service program. But that also could mean taking" +
                " time off work or giving up your weekend plans.\n" +
                "\n" +
                "While most first-time offenses are charged as misdemeanors, there are situations where your case" +
                " can be elevated to a felony DUI. For instance, if you drove while intoxicated and caused great" +
                " bodily injury or death to another, even if this is your first DUI. If you are charged with a" +
                " felony DUI, you may be dealing with a possible prison sentence.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
