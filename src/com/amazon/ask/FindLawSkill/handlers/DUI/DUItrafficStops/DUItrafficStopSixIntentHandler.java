package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopSixIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopSix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask to find legal help";

        String speechText = "If the police used some sort of neutral policy for picking out which cars to stop, then " +
                "it was legal. Police are allowed to single out automobiles at roadblocks if they have a good reason " +
                "to do so, such as a suspicion that you are driving under the influence.";

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
