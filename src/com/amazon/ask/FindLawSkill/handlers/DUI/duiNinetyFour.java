package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetyFour implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetyFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "\"Dram shop\" laws are named after establishments in 18th Century England that sold gin" +
                " by the spoonful (called a \"dram\"). These laws are enforced through civil lawsuits, allowing DUI" +
                " victims or their families to sue alcohol vendors or retailers for monetary damages. Typically, when" +
                " the plaintiff wins a lawsuit against both an alcohol vendor and the intoxicated driver, the" +
                " compensatory damages are divided between the two defendants.\n" +
                "\n" +
                "In one such case, a New Jersey jury awarded $135 million to the family of a girl paralyzed in 1999" +
                " after a drunk driver collided with the car in which she was riding. The drunk driver reportedly" +
                " had a blood-alcohol concentration that was double the legal limit after leaving a New York Giants" +
                " football game. It was determined that the concessionaire at Giants' Stadium shared the liability" +
                " for the victim's serious injury.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
