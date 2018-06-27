package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureFourHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most Americans are familiar with defendants \"pleading the 5th\", but may not be as familiar" +
                " with what \"taking the 5th\"really means. The 5th Amendment gives criminal defendants the right to " +
                "decline to testify and requires that jurors be instructed that they can't assume the defendant's guilt" +
                " by the their silence.\n" +
                "This instruction is crucial, because there is a natural tendency to assume that by not testifying," +
                " the defendant has done something wrong. Instead, the defendant may have been instructed by his or her " +
                "lawyer to not testify because:\n" +
                "•\tBy taking the stand and testifying, the defendant opens up his or her past to questioning by the " +
                "prosecution. This means that the prosecution can bring up information to discredit or tarnish the " +
                "defendant's reputation and believability.\n" +
                "•\tIf a defendant testifies, a prosecutor may be able to bring up past crimes.\n" +
                "•\tThe defendant may be a poor public speaker, seem angry, or even worse, nervous, which many jurors " +
                "infer means the defendant is guilty of something.\n" +
                "•\tThe defendant is simply not a \"likeable\" person, and the defense attorney does not want the client" +
                " being convicted for his or her personality.\n";

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
