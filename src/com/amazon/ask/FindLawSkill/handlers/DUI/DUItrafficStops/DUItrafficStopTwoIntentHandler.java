package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopTwoIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "In general, police have three different methods of figuring out whether or not a driver is under the influence:\n" +
                "\n" +
                "1. Observing erratic driving -In general, police officers will pull you over if they notice that you" +
                " are showing any of the signs of driving under the influence. These signs include swerving, speeding, " +
                "driving too slowly, failing to stop, failing to yield, and any other indications that signal to the " +
                "officer that you are driving drunk. In general, if you actually have a good reason for driving the way " +
                "you were driving, the officer may let you go with only a ticket or a warning. However, officers will be " +
                "looking to see if your eyes are blurred or if they smell alcohol on your breath.\n" +
                "\n" +
                "2. Field Sobriety Tests - If, after stopping you, the police officer has a hunch that you may be " +
                "driving under the influence, he will most likely get you out of the car in order to do some field" +
                " sobriety tests. These tests can include walking in a straight line, standing on one leg, or a speech" +
                " test. The officer will also carefully watch your eyes to look for any pupil dilation. If you fail" +
                " these tests, the officer will likely ask you to take a chemical test.\n" +
                "\n" +
                "3. Chemical Blood Alcohol Level Tests - If you fail a field sobriety test, the police officer will " +
                "likely take you in to perform a more accurate blood alcohol level test. These tests are normally taken" +
                " by testing a blood, urine or breath sample. The blood test is very direct and measures the amount of " +
                "alcohol in your system. The urine and breath tests work off of a mathematical formula to derive your " +
                "blood alcohol level from the sample. If you test above a .08% blood alcohol level, you will be guilty " +
                "of a DUI unless you can convince the judge that you were not impaired or being unsafe. Also, many" +
                " attorneys base their drunk driving defense on challenging the mathematical formula used in the tests.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
