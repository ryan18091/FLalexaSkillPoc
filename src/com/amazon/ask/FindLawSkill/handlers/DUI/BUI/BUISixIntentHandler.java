package com.amazon.ask.FindLawSkill.handlers.DUI.BUI;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class BUISixIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) { return input.matches(intentName("BUISix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "BUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Whether you are allowed to refuse a breathalyzer test varies from state to state. If you" +
                " don't know, it might be wise to politely decline. Doing so in some states like Pennsylvania, however, " +
                "could result in an automatic suspension of your boating privileges. In other states like Florida, your" +
                " license cannot be automatically suspended for refusing to submit to a <say-as interpret-as='spell-out'>BAC</say-as> test";

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
