package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Some states raise a DUI/DWI charge to a felony if the driver causes bodily harm to " +
                "another. Sometimes, prosecutors have the discretion to decide whether to prosecute a DUI/DWI case" +
                " involving bodily injury as a misdemeanor or a felony. In some states, like California, prosecutors" +
                " must also demonstrate that the person charged with DUI/DWI caused that injury in question. If" +
                " another driver runs into the intoxicated driver while stopped at a stop sign and suffers injuries," +
                " then the intoxicated driver didn't cause the bodily harm and the DUI/DWI charge will remain a" +
                " misdemeanor.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
