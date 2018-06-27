package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "A state can charge a DUI defendant with excessive speed in addition to DUI. In some" +
                " states, if a person exceeds the speed limit by a certain amount, it may also result in an " +
                "aggravated DUI (or DWI) charge. For example, if police measured a DUI defendant driving 30 miles" +
                " per hour over the posted speed limit, the defendant could face a much higher sentence than they " +
                "would if they had driven 10 miles per hour over the speed limit.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
