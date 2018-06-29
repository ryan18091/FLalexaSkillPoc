package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "You can also be in violation of Minnesota's DWI laws by having any amount of a schedule " +
                "I or schedule II controlled substance in your body at the time of driving. There are also special rules" +
                " for commercial drivers, making the blood alcohol level even lower at 0.04 percent at the time of " +
                "driving. Why? Because an impaired commercial driver, such as a truck driver with a full tank of " +
                "gasoline or a bus driver carrying school children, poses a serious threat to public safety.";

        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/drinkdrive-1170x631.png" ;


        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1(title,primaryText,secondaryText,
                image);

        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .withSpeech(speechText)
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
