package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopOneIntentHandler  implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "In general, it is illegal for you to drive while you are \"impaired\" by drugs or alcohol." +
                " It should be clear at the outset that prescription drugs are not excluded from this list. Being " +
                "impaired means that there must be enough of the alcohol or drug in your system to prevent you from " +
                "thinking clearly and driving safely while on the road. According to many studies, impairment happens" +
                " to many people well before they consider themselves drunk or stoned.\n" +
                "As for the numbers if you have a blood alcohol content of .08% or higher, that is " +
                "considered \"per se\" Driving Under the Influence (DUI), or Driving While Intoxicated (DWI). " +
                "For those under the legal drinking age of 21, in almost all states you will be considered to be driving " +
                "under the influence if you have a blood alcohol content great than .01% or .02%, depending on the state you are in.";

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
