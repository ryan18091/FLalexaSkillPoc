package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFortyEight implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFortyEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText =  "Ask another question, or ask for legal help";

        String speechText = "Let's be up front here -- DUIs aren’t cheap. In addition to paying anywhere from" +
                " $500-$2,000, you will also have to pay court fees, including a license reinstatement fee and" +
                " more. You’ll also have to pay higher car insurance rates, ignition interlock device (IID) fee " +
                "(if one is required), and mabye the amount to get your car out of impoundment.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
