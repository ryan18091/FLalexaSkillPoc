package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText ="Ask another question, or ask for legal help" ;

        String speechText = "Most states require those convicted of a DUI to obtain an SR-22 form from their" +
                " insurers, which proves to the department of motor vehicles (DMV) that you indeed carry liability" +
                " insurance. This is required in order for the DMV to lift your license suspension. The SR-22 form" +
                " serves as an obvious red flag about the conviction and also requires the insurer to contact the " +
                "DMV if it cancels your insurance policy.\n" +
                "\n" +
                "Depending on the state, you may have to show proof of auto insurance to the DMV for up to five " +
                "years in order to maintain a valid license. Not every insurance company offers SR-22 auto insurance" +
                " policies; some insurers either cancel or don't renew your policy after a DUI conviction. Six " +
                "states don't require SR-22 forms: Delaware, Kentucky, Minnesota, New Mexico, Oklahoma and" +
                " Pennsylvania.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
