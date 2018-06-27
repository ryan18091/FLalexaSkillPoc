package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "All states are subject to the provisions of the federal Fair Credit Reporting Act (FCRA)," +
                " which applies to background checks performed by outside companies but not those conducted in-house." +
                " While the FCRA prohibits the reporting of criminal arrests after a period of seven years, criminal" +
                " convictions (including DUIs) may be reported indefinitely. Also, reporting restrictions imposed by" +
                " the FCRA only apply to jobs with a yearly salary of $75,000 or less.\n" +
                "\n" +
                "However, federal courts have often ruled that Title VII of the Civil Rights Act of 1964 prohibits" +
                " employers from barring employment of individuals with convictions unless they can prove a" +
                " compelling business reason to do so. Still, this interpretation of the Civil Rights Act comes " +
                "into conflict with some state laws. And most applicants have no way of knowing what goes on behind" +
                " the scenes when they apply for a job.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
