package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "You will probably be asked to take a preliminary breath test (PBT). You should be told" +
                " that the only penalty if you refuse the PBT is a $100 fine. If you fail either test you will be " +
                "told that you are under arrest for driving under the influence. You will be handcuffed, searched" +
                " for weapons, placed in the back of the officer's car and taken to a jail for further tests. At the" +
                " jail you will also be booked and held there until you post bail or until a judge releases you on " +
                "your own recognizance without bail. Once again, as upsetting and as stressful as being arrested" +
                " is, it is essential that you continue to act courteously and cooperatively with the officer. Do " +
                "not argue, threaten or become belligerent in any way. This type of behavior will only make the" +
                " experience even more unpleasant for you.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
