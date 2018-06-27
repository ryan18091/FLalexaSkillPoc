package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightyFour implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightyFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The offense of driving under the influence, or DUI, typically relates to alcohol" +
                " intoxication. But alcohol is just one of countless substances that can impair one's ability" +
                " to operate a motor vehicle. Driving under the influence of drugs -- including prescription" +
                " medications as well as illegal drugs -- can also result in DUI charges.\n" +
                "\n" +
                "Mixing drugs and driving, whether it's medicinal marijuana or legally prescribed muscle relaxers," +
                " is just as illegal as driving drunk and can also constitute a DUI offense. Doctor's orders are" +
                " no defense to drugged driving charges. Different drugs affect drivers in different ways. But" +
                " those that impair judgment, alertness, concentration or motor skills are considered just as" +
                " (if not more) dangerous than alcohol.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
