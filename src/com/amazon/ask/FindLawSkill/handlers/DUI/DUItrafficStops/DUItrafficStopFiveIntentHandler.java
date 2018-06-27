package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopFiveIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask to find legal help";

        String speechText = "It all depends on the circumstances and whether or not you are in the \"custody\" of " +
                "the police. During a roadside traffic stop, you are not considered to be in police custody, and " +
                "therefore the police can ask you questions without reading you your Miranda warning. Once you are in " +
                "police custody, however, they must read you your rights before asking you any questions. If they " +
                "don't, any answers you give may be inadmissible against you in court. To be in custody, you must " +
                "feel that you are not free to leave a situation.";

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
