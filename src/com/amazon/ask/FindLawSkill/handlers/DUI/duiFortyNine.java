package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFortyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFortyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText =  "Ask another question, or ask for legal help";

        String speechText = "An often overlooked point of discussion, your car insurance rates are likely to go up" +
                " appreciably in the event you are convicted of a first offense DUI. In some situations, an" +
                " insurance carrier can simply cancel your policy if you are deemed “too high a risk.” Moreover," +
                " a person who has multiple DUI convictions creates the biggest risk for an insurance company and " +
                "will see the biggest insurance premium increase.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
