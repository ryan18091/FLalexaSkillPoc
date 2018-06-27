package com.amazon.ask.FindLawSkill.handlers.DUI.BUI;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class BUIEightIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) { return input.matches(intentName("BUIEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "BUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Probably not. Many states require people convicted of BUI offenses to attend mandatory " +
                "boater education classes, as well as alcohol and drug counseling. If you are convicted of a criminal " +
                "offense, you will have a criminal record. Depending on the severity of the conviction (i.e., if it is " +
                "a felony or misdemeanor), you could face severe legal consequences and restrictions.\n" +
                "One option you may have is called a \"wet reckless\" which is similar the same term used in DUI law. " +
                "The prosecutor may give you the option to plead guilty in exchange for a charge with smaller penalties, " +
                "like recklessly operating a watercraft.\n";

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
