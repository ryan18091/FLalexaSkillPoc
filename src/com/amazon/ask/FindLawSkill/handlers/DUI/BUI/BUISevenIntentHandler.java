package com.amazon.ask.FindLawSkill.handlers.DUI.BUI;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class BUISevenIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) { return input.matches(intentName("BUISeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "BUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Probably. State authorities may ask you to \"walk and turn,\" recite a particular phrase, " +
                "or other tasks. The general purpose of field sobriety tests is to help determine if you are able to " +
                "perform the basic functions required to safely operate a boat or other watercraft. Some of the field " +
                "sobriety tests used are not necessarily applicable on the water though, because the boat you are on " +
                "may prevent even a sober person from passing the test. In this situation, a Breathalyzer test is more likely.";

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
