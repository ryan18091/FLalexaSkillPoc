package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopElevenIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopEleven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask to find legal help";

        String speechText = "No. Years ago, a drunk driving charge meant someone was \"drunk\" in the way all of us" +
                " commonly understand. But today, intoxication as we know it is not required for one to be guilty of drunk " +
                "driving. During the last ten years laws against drunk driving have changed radically, and today they " +
                "are much more severe.\n" +
                "You may not think you are drunk. Those around you may not think you are drunk. Indeed, for the purpose" +
                " of every other situation except driving, you may not even be considered drunk. But your condition may" +
                " be enough for you to be found guilty of a drunk driving offense under the current definition of the law." +
                " And if you are convicted, you will suffer some very harsh penalties.";

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
