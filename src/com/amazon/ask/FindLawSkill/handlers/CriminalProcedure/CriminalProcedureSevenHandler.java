package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureSevenHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureSeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most criminal statues have two essential pieces, the physical act and the mental act." +
                " Accordingly, you can break down almost any criminal statute into the physical acts that must be" +
                " proven, and the mental state required (often referred to as the \"intent\"). For example, here is a" +
                " common definition of a criminal assault:\n" +
                "\"An act with the intent to cause fear in another of immediate bodily harm or death.\"\n" +
                "First, there must a physical act that took place. Second, that act must have been undertaken with the " +
                "intention (the mental state) to cause fear or immediate bodily harm or death in another.\n" +
                "At trial, a prosecutor would have to prove that you performed some physical act, with the intent to " +
                "significantly hurt someone. This means that even if you did something that caused the fear listed in " +
                "the statute above, if you never specifically intended to cause that fear, then you have not committed " +
                "an assault under the above definition.\n";

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
