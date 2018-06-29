package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.FindLawSkill.Template1;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiTwelve implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiTwelve"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Misdemeanor DUI vs. Felony DUI";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "In addition to facing possible jail (as opposed to prison) time, a misdemeanor DUI will" +
                " not require a preliminary hearing or the convening of a grand jury, whereas a felony DUI case would." +
                " The trajectory of a misdemeanor DUI is as follows: a person is arrested, charged, arraigned, has a " +
                "pretrial conference, and -- if the case doesn’t plead out at pretrial -- goes to trial. When a felony" +
                " is involved, you’ll be looking at several court proceedings leading up to the trial, a minimum of" +
                " one year in prison (but it can be much more depending on the facts of the case and the state), and" +
                " the collateral consequences of having a felony on your record such as losing your voting rights, not" +
                " being able to serve on a jury, and possibly losing your right to legally own a gun.";

        String imageUrl = "https://s3.amazonaws.com/findlawpocvideo/drinkdrive-1170x631.png" ;


        Template1 template1 = new Template1();

        Image image = template1.getImage(imageUrl);

        Template template = template1.getBodyTemplate1("Misdemeanor DUI vs. Felony DUI","The Kavinoky Law Firm",secondaryText,
                image);

        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {

            return input.getResponseBuilder()
                    .addVideoAppLaunchDirective("https://s3.amazonaws.com/findlawpocvideo/MisdemeanorDUIvsFelonyDUI.mp4",
                            title,
                            "The Kavinoky Law Firm")
//                    .addRenderTemplateDirective(template)
                    .withReprompt(secondaryText)
                    .build();
        } else {

            // Headless device
            return input.getResponseBuilder()
                    .withSimpleCard(title,speechText)
                    .withSpeech(speechText)
                    .withReprompt(primaryText)
                    .build();
        }
    }
}
