package com.amazon.ask.FindLawSkill.handlers.CriminalProcedure;

import com.amazon.ask.FindLawSkill.Template3;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.interfaces.display.Image;
import com.amazon.ask.model.interfaces.display.Template;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CriminalProcedureTwoHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CriminalProcedureTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "Criminal Procedure information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most criminal offenses must be proven \"beyond a reasonable doubt\". Coupled with the " +
                "presumption of innocence, this is a very high standard for the prosecution to prove. These criminal law " +
                "procedures were created intentionally, because the American legal system is founded on the idea that it " +
                "is better to let a guilty man go free than convict an innocent man.\n" +
                "In civil cases, there are much lower standards of proof such as the \"preponderance of evidence\", " +
                "which may be oversimplified as a \"more likely than not\" standard. Beyond a reasonable doubt, however, " +
                "means that the judge and jury are supposed to resolve all possible doubts about the defendant's guilt," +
                " and conclude that there is no other reasonable conclusion but that the defendant must have committed " +
                "the crime. Accordingly, most defendants try to establish plausible alternative theories about the " +
                "prosecution's theory of guilt in order to raise reasonable doubts about the truth of the charges.";

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
