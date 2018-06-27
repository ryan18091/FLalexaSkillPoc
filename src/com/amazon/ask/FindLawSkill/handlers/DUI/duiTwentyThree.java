package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "States all set a legal limit for blood alcohol concentration (BAC) - usually .08%." +
                " The law presumes that anyone who is caught driving with a BAC over the legal limit has committed" +
                " DUI.When tests reveal that a suspected DUI driver has a BAC that is extremely high (usually two" +
                " or more times the legal limit, depending on the state), the crime moves into the realm of an" +
                " aggravated DUI. Also known in this instance as an \"extreme DUI,\" the offense carries the" +
                " possibility of greater prison terms and higher fines.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
