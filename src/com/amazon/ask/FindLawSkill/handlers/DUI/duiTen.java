package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "If facing jail time isn't enough of a deterrent, the harsh administrative penalties" +
                " associated with a DWI arrest and/or conviction should be enough to make a person think twice about " +
                "driving while under the influence. There are three main penalties that can impact your ability to " +
                "legally drive your car, motorcycle, or other form of transportation. Under certain circumstances, the " +
                "following penalties can be imposed on a driver:License Plate Impoundments: Certain offenders will have " +
                "their license plate physically seized by law enforcement or he or she must surrender the plates. This " +
                "applies to any vehicle the offender owns or operates, whether alone or jointly.\n" +
                "Vehicle Forfeiture: The offender's vehicle may be subject to complete forfeiture if the car or " +
                "motorcycle was used in the commission of a \"designated offense,\" such as a third DWI conviction " +
                "within a ten-year period.\n" +
                "Driver's License Suspension or Revocation: A driver's license will be automatically suspended upon a " +
                "DWI arrest, however in most circumstances a person is given a seven-day temporary license to drive" +
                " before the suspension goes into effect. A driver may be able to successfully appeal the license " +
                "suspension in some situations.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
