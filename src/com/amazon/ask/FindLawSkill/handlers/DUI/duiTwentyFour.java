package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyFour implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The presence of minors in the vehicle at the time of a DUI arrest can also result in" +
                " an aggravated DUI. States have different age ranges for the minor that will trigger enhanced" +
                " DUI penalties, though. For example, some states require that the minor in the vehicle be younger" +
                " than 16, while others set the maximum age for the minor at 12.Some states also increase the" +
                " penalties for a DUI conviction if the offense occurs in a school zone, regardless of whether" +
                " children were present in the car.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
