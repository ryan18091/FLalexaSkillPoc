package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Under \"implied consent\" laws in Minnesota, when they apply for a driver's license, " +
                "motorists give consent to field sobriety tests and chemical tests to determine impairment. Should a " +
                "driver refuse to submit to testing when an officer has reasonable suspicion that the driver is under " +
                "the influence, the driver risks automatic license suspension along with possible further penalties.";

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
