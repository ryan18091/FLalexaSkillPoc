package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventyOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Each person's blood alcohol content from drinking certain amounts of alcohol will vary," +
                " depending upon a number of factors. The main factor is your weight. To calculate your blood alcohol" +
                " content based upon having normal drinks such as a 12 ounce beer, a 4 ounce glass of wine, or a " +
                "single mixed drink containing a one ounce shot of 100 proof liquor, the following rule of thumb" +
                " is an illustration:\n" +
                "\n" +
                "120 lbs:\n" +
                "one drink in one hour - .032\n" +
                "two drinks in one hour - .064\n" +
                "three drinks in one hour - .096\n" +
                "\n" +
                "180 lbs:\n" +
                "one drink in one hour - .021\n" +
                "two drinks in one hour - .042\n" +
                "three drinks in one hour - .063\n" +
                "four drinks in one hour - .084";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
