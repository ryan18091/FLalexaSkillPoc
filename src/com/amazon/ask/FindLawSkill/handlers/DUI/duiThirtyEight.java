package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiThirtyEight implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiThirtyEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The acronyms DUI and DWI are the most commonly used terms for a drunk driving charge" +
                "in the United States, but certainly not the only ones. Also, these terms have specific meanings " +
                "within the penal code of each respective state, so arbitrarily throwing around this terminology" +
                " doesn't help when discussing a particular jurisdiction. In fact, many states have more than one " +
                "type of impaired driving charge, each with its own acronym.\n" +
                "\n" +
                "More than half of the states (including the District of Columbia) use DUI to identify the standard " +
                "charge for driving under the influence, while 10 states use the term DWI (either driving while" +
                " impaired or driving while intoxicated). Other terms used for standard impaired driving charges " +
                "-- typically for a BAC of 0.08 percent or higher -- include the following:";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
