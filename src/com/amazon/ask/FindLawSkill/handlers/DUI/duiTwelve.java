package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwelve implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwelve"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "In addition to facing possible jail (as opposed to prison) time, a misdemeanor DUI will" +
                " not require a preliminary hearing or the convening of a grand jury, whereas a felony DUI case would." +
                " The trajectory of a misdemeanor DUI is as follows: a person is arrested, charged, arraigned, has a " +
                "pretrial conference, and -- if the case doesn’t plead out at pretrial -- goes to trial. When a felony" +
                " is involved, you’ll be looking at several court proceedings leading up to the trial, a minimum of" +
                " one year in prison (but it can be much more depending on the facts of the case and the state), and" +
                " the collateral consequences of having a felony on your record such as losing your voting rights, not" +
                " being able to serve on a jury, and possibly losing your right to legally own a gun.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
