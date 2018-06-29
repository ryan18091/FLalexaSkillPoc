package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEleven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEleven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Misdemeanor DUI";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Misdemeanors, in general, are less serious crimes than felonies and do not involve the " +
                "possibility of prison time. Most misdemeanors are typically punishable by some jail time, a fine, and " +
                "probation. In the context of an impaired driving offense, a misdemeanor DUI is typically charged for a" +
                " first-time DUI offense without any aggravating circumstances such as having a minor child in the car, " +
                "injuring or killing another person, or having prior DUI convictions. Most people who are arrested and" +
                " charged face misdemeanor DUI allegations.";

        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/drinkdrive-1170x631.png" ;


        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1("Misdemeanor DUI","The Law Offices of David M. Cantor",secondaryText,
                image);

        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .addVideoAppLaunchDirective("https://s3.amazonaws.com/findlawpocvideo/MisdemeanorDUI.mp4","Misdemeanor DUI",
                            "The Law Offices of David M. Cantor")
                    .addRenderTemplateDirective(template)
                    .withReprompt(secondaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSimpleCard(title, speechText)
                    .withSpeech(speechText)
                    .withReprompt(primaryText)
                    .build();
        }

    }
}
