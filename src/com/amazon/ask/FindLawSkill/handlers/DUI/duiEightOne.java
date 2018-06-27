package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "States and courts are split on the subject of drunk biking. Some people automatically" +
                " doubt the amount of harm a bicyclist can cause to others, considering the nature of a bicycle." +
                " However, some states and their laws acknowledge that, even assuming a bicyclist likely only harms" +
                " themselves by drunk biking, an injury to a drunken rider can have a profound effect on others," +
                " especially their family members.\n" +
                "\n" +
                "In general, where a state law on drunk driving specifically prohibits the operation of a \"motor" +
                " vehicle,\" the chances are very high that the law will be interpreted by courts as not applying" +
                " to bicycles or similar man-powered vehicles.\n" +
                "\n" +
                "On the other hand, where statutes apply more generally to all \"vehicles,\" courts sometimes find" +
                " that bicycles fall into this category. A local attorney can be of valuable assistance in finding" +
                " out what, if any laws, apply in these circumstances, and can determine whether or not courts in" +
                " the area have applied state DUI laws to cyclists.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
