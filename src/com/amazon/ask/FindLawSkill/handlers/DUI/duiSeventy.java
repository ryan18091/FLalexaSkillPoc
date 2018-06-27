package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSeventy implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSeventy"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most states' courts regard the HGN test as scientific and thus reliable. Still, " +
                "DUI defense attorneys often attempt to have the evidence thrown out if it can be shown that the" +
                " test was not conducted according to the Standardized Field Sobriety Test (SFST) guidelines set " +
                "forth by the NHTSA. It's up to the judge to determine whether HGN test was properly conducted and " +
                "thus admissible. Generally, the court may rule that HGN evidence is either a physical observation" +
                " by the officer (in which case the officer would testify to his or her training); a scientific" +
                " test, either valid on its own or requiring expert testimony; or else inadmissible.\n" +
                "\n" +
                "Evidence of nystagmus does not always signify alcohol impairment and can also be caused by the " +
                "movement of inner ear fluid, eye strain, neural activity, brain damage, or just as a natural" +
                " occurrence (all of which are quite rare), according to the NHTSA. Defendants with any such" +
                " conditions may be able to have this evidence thrown out pre-trial.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
