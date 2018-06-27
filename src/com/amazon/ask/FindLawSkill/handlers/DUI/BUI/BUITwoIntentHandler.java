package com.amazon.ask.FindLawSkill.handlers.DUI.BUI;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class BUITwoIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("BUITwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "BUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Yes, state and federal law enforcement officials can pull a boat operator over on suspicion " +
                "that the operator is driving a boat while under the influence, just like they can when you are driving a" +
                " car. Law enforcement officials may also set up checkpoints on the water, just like roadside DUI " +
                "checkpoints, to question and check boat operators for Boating Under the Influence (BUI). Some states do" +
                " not even require \"probable cause\" for law enforcement officials to be able to board your boat. In " +
                "Delaware, they can just do it. Even if they don't charge you with violating federal laws prohibiting" +
                " boating while intoxicated, federal authorities like the U.S. Coast Guard can also hold and transfer" +
                " you to state authorities for additional prosecution.";

        String imageUrl = "https://www.findlawimages.com/latl/findlaw.png";

        Template3 template3 = new Template3();

        Image image = template3.getImage(imageUrl);

        Template template = template3.getBodyTemplate3(title, speechText, secondaryText, image);

        return input.getResponseBuilder()
//                .withSimpleCard("DUI", speechText)
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
