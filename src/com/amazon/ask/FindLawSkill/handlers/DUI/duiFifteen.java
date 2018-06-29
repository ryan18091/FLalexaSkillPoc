package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFifteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFifteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Every state currently has a .08 percent \"per se\" DUI rule in effect. This rule states" +
                " that, if a driver has a BAC of .08 or above, the state can assume that the driver is intoxicated in" +
                " violation of the statute.In addition, states commonly will elevate a drunk driving charge to a felony" +
                " if chemical tests reveal that the driver's BAC exceeds a certain elevated level set by law - usually" +
                " around .16 percent. Not every state has this law, but at the minimum states generally impose a " +
                "harsher punishment for a high BAC.";

        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/drinkdrive-1170x631.png";


        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1(title, primaryText, secondaryText,
                image);

        if (null != input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .addVideoAppLaunchDirective("https://s3.amazonaws.com/findlawpocvideo/PerSe.mp4",
                            "Per Se DUI",
                            " Atlanta, Georgia - Attorney Benjamin Von Schuch")
                    .addRenderTemplateDirective(template)
                    .withReprompt(primaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withReprompt(primaryText)
                    .build();
        }

    }
}
