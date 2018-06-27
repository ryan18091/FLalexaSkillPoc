package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureOneHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The presumption of innocence is a cornerstone of the American legal system and a foundational" +
                " principle of criminal law procedures. This presumption shifts the burden of proof onto the prosecution " +
                "to affirmatively prove that you committed the criminal act. This has several ramifications that may not" +
                " be apparent at first glance. First, it means that you won't be constantly harassed by the state filing " +
                "criminal charges against you that required you to prove your innocence. Without the presumption of innocence," +
                " there would be little to prevent the state from charging you with crimes and forcing you to constantly" +
                " prove your innocence. With the presumption in place, the state has an incentive to only bring charges " +
                "against those it actually believes committed a crime. Second, it means you don't have to say a single" +
                " thing, or prove a single thing in your defense. You could be silent the entire trial and put on no " +
                "defense whatsoever, and unless the prosecution can prove that you committed the crime, you should be " +
                "judged not guilty.";

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
