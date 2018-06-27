package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureFiveHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Generally, a felony is considered a more severe crime and as a result, the defendant is " +
                "given more jail time - typically a year or more. In contrast, misdemeanors are considered lesser " +
                "crimes and are often punished by making the defendant pay a fine and sometimes serve jail time, but " +
                "typically less than a year. Many crimes can be charged as either a felony or misdemeanor, depending on " +
                "the severity of the crime and the prosecutor's inclination. Finally, conduct punished only by a fine is " +
                "typically not a crime at all, but rather an infraction (such as a traffic violation).";

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
