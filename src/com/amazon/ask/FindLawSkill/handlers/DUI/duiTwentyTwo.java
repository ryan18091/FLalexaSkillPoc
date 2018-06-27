package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwentyTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwentyTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "A normal driving under the influence (DUI) charge already carries severe penalties, but" +
                " certain situations can result in enhanced penalties for DUI or DWI that go well beyond the" +
                " sentences normally imposed after a DUI conviction. The presence of certain aggravating factors" +
                " in a DUI case can result in enhanced penalties by either increasing the range of potential" +
                " sentences or by raising the actual charge to a higher level, depending on the state where the" +
                " DUI prosecution takes place.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
