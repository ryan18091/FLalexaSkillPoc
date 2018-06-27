package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventySeven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventySeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "This is a physical procedure to determine how much alcohol you have in your system." +
                " There are three ways of doing this test:\n" +
                "\n" +
                "Drawing a sample of blood from your arm;\n" +
                "\n" +
                "Obtaining a urine sample;\n" +
                "\n" +
                "Obtaining a breath sample by having you blow into a machine called a breathalyzer. [This is " +
                "different from the field (road) sobriety breath device (PBT) described above. The breathalyzer " +
                "is much more sophisticated and exact.]\n" +
                "The officer will request one of the three tests. Unless you are physically unable to take that" +
                " test you must do so. If you do not, you can lose your driving privileges. If, and only if, you " +
                "take the requested test, you can then request one type of test of your own and the officer must" +
                " act reasonably to obtain this test for you. If you do refuse the officer's requested test it is" +
                " likely he will seek a search warrant and forcibly take blood from you.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
