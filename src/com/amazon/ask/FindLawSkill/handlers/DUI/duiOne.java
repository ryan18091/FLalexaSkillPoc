package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Driving while under the influence of alcohol or drugs (DUI) is a crime in all 50 states" +
                " and the District of Columbia. The consequences of an arrest for this crime are twofold: criminal and" +
                " administrative. The severity of each sanction will depend on a number of factors including how " +
                "egregious the current offense is, as well as a person's past criminal history. Minnesota, the actual" +
                " crime is known as \"driving while intoxicated\" (DWI) and applies when a person is operating, or is in " +
                "physical control, of a motor vehicle while: Under the influence of alcohol or drugs, a combination of the two; or\n" +
                "Having a blood alcohol concentration of 0.08 percent or higher within two hours of driving.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
