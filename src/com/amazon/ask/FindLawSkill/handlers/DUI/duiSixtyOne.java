package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most states have laws prohibiting the presence of open cans, bottles, or other unsealed" +
                " containers of alcoholic beverages (even if empty) on sidewalks, streets, and inside vehicles." +
                " So by default, a passenger drinking an alcoholic beverage also is in possession of an open " +
                "container. Some states allow unsealed containers of alcohol in secure locations only, such as a" +
                " locked glove compartment or trunk.\n" +
                "\n" +
                "A total of 43 states have open container laws in place, 40 of which conform to federal standards" +
                " outlined in the Transportation Equity Act for the 21st Century (TEA-21), which mandates open" +
                " container laws and other traffic safety measures.\n" +
                "\n" +
                "Drivers may be cited for an open container violation if they have the container on their person " +
                "or within reach. But even if only the passenger is in possession of an open container, both the" +
                " driver and the offending passenger may be cited for a violation. In any case, the blood alcohol" +
                " concentration (BAC) of an offending passenger is irrelevant.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
