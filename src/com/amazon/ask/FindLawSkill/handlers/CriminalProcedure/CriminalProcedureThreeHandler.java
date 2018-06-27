package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureThreeHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Generally, you are guaranteed a right to trial by jury for criminal offenses that carry a" +
                " penalty of more than six months of imprisonment. Crimes that are punishable by less than six months " +
                "are often considered \"petty\" crimes and do not necessarily give you the right to a trial by jury. " +
                "Juries typically range in size from six to twelve members, and the size often reflects the seriousness" +
                " of the crime. Finally, jury convictions must usually be unanimous, meaning that all jury members must" +
                " agree. There are exceptions in a few states where only ten out of twelve jury members can vote to " +
                "convict the defendant.";

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
