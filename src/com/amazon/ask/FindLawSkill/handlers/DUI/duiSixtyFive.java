package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "A DUI defendant may successfully challenge the results of a breath test if the instrument" +
                " wasn't properly calibrated; the suspect had excess acetone on the breath, which is perceived as" +
                " alcohol (common among diabetics); or if other outlying causes are to blame. But actively influencing" +
                " -- and lowering -- one's estimated BAC level during a breath test is virtually impossible.\n" +
                "\n" +
                "Here are some popular myths:\n" +
                "\n" +
                "Sucking on copper pennies - Believe it or not, this urban legend has been circulating for some time," +
                " but has no merit whatsoever. Besides, pennies are made primarily of zinc.\n" +
                "Covering up the \"smell\" of alcohol - While alcoholic beverages often have a common odor, ethanol " +
                "is actually odorless. So while chewing gum may cover up the smell of beer when talking to an officer" +
                ", it won't trick a Breathalyzer.\n" +
                "Breath mints, breath spray, or mouthwash - As stated above, there is no way to mask a breath sample" +
                " by covering up its odor; however, mouthwash or breath spray containing alcohol could actually" +
                " increase your estimated BAC.\n" +
                "Drinking large amounts of coffee or water - Additional fluids will not adequately dilute the alcohol" +
                " in your bloodstream; it takes time to metabolize alcohol. And coffee, while it may help you be " +
                "more alert, will not lower your BAC.\n" +
                "Eating food - The assumption is that eating food will help absorb alcohol, but this won't have any" +
                " effect on alcohol already in the bloodstream (and measured on the breath).\n" +
                "Hyperventilating or holding your breath prior to blowing - This theory actually has some merit, but" +
                " would have to be done with precision and immediately prior to giving a sample, which would be " +
                "witnessed by the officer.\n" +
                "Burping - It was once believed that this would skew results, but has since been debunked.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
