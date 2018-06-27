package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The officer will ask you to get out of the car and will instruct you to perform a series" +
                " of \"field sobriety tests.\" These are standard physical ability measures and they include:\n" +
                "\n" +
                "Reciting the alphabet from A - Z, and counting backwards;\n" +
                "Walking heel to toe along a straight line;\n" +
                "Standing on one foot for a few seconds;\n" +
                "In addition to these tests, some officers typically have certain field sobriety testing devices" +
                " which they use. One such device is a breath meter (PBT) which you blow into, another is a light" +
                " to shine in your eyes in order to test your pupil reaction. It is very important that if you" +
                " suffer from any chronic physical problems, such as difficulty with your balance, problems walking" +
                " or with your legs or feet, or problems with your lungs or eyes that you inform the officer of" +
                " these things before you go through the field sobriety tests.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
