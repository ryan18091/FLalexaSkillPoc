package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Simply being in an accident can meet the lower threshold for \"reasonable suspicion\" that" +
                " a law may have been broken, allowing a police officer to stop and temporarily detain the motorists" +
                " involved for the purpose of investigating further.\n" +
                "\n" +
                "At this point, the officer may ask one or more of the drivers involved if they had been drinking; " +
                "look to see if any beer cans or other tell-tale evidence is in plain view; or look at the drivers' " +
                "eyes for signs of impairment. The officer also may conduct field sobriety tests.\n" +
                "\n" +
                "If the investigation leads the officer to conclude that a motorist most likely is under the influence " +
                "of alcohol or drugs, often based on the results of a BAC test, then the officer has \"probable cause\"" +
                " to make an arrest for drunk driving.\n" +
                "\n" +
                "Therefore, an accident may give an officer reasonable suspicion to investigate the scene, but only" +
                " solid evidence of intoxication gives the officer probable cause for a DUI arrest. However, some" +
                " states allow either mandatory or discretionary BAC testing of motorists involved in accidents" +
                " that cause serious injury or death.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
