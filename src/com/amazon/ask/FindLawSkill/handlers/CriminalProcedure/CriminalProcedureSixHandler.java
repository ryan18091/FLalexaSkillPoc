package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureSixHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureSix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "If it seems like a defendant is simply not capable of understanding what the state is " +
                "accusing them of and is unable to assist their attorney in their defense, then a judge may order an " +
                "evaluation of the defendant. The evaluation will be performed by a psychological professional who is " +
                "practiced as detecting deception since many defendants may feign mental illness to avoid punishment.\n" +
                "If a defendant is declared incompetent, it does not mean that they can simply go free. Instead, it " +
                "means that the defendant will be placed into a secure mental hospital, rather than a jail, until the " +
                "defendant is deemed competent to stand trial.\n";

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
