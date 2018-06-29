package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFourteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFourteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Felony DUI";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most states classify a standard DUI (or DWI) charge as a misdemeanor. Certain " +
                "circumstances can raise the level of the charge to a felony, however. A conviction for a felony " +
                "DUI carries stiffer penalties and more lasting consequences than a misdemeanor charge. Not every" +
                " state has the same rules for what does and does not constitute felony drunk driving, though, so you" +
                " should check the laws and procedures in your state for more information. ";
        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/drinkdrive-1170x631.png" ;


        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1("Felony DUI","Callahan Law, P.S.,",secondaryText,
                image);

        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .addVideoAppLaunchDirective("https://s3.amazonaws.com/findlawpocvideo/FelonyDUI.mp4",
                            title,
                            "Callahan Law, P.S.,")
                    .addRenderTemplateDirective(template)
                    .withReprompt(secondaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSimpleCard(title,speechText)
                    .withSpeech(speechText)
                    .withReprompt(primaryText)
                    .build();
        }
    }
}
