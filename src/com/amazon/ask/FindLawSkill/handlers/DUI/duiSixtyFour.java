package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyFour implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "While drinking, some of the alcohol that is absorbed into the bloodstream evaporates into" +
                " the lungs as it moves through the alveoli (the tiny air sacs where gasses are exchanged). Most" +
                " alcohol-detection instruments use a method called infrared spectroscopic analysis, in which the" +
                " frequency of light waves absorbed by a suspect's breath vapor reflects his or her approximate BAC." +
                " The machine then translates this breath data into an estimated percentage in the bloodstream, since" +
                " the two measurements rise and fall in proportion to one another.\n" +
                "\n" +
                "Because motorists cannot voluntarily control this exchange of gases between the bloodstream and the " +
                "lungs, masking agents (such as mints, mouthwash, or even copper pennies) will not change the level" +
                " of detectable alcohol on one's breath. The portable roadside devices, known as alcohol screening " +
                "devices (ASD), are not quite as accurate as the larger, evidentiary breath test instruments used at" +
                " the police station after an arrest is made. Officers are instructed to wait 15 to 20 minutes prior " +
                "to conducting a breath test in order to rule out skewed results from the ingestion of food, chewing" +
                " gum, asthma inhalers, or other substances. Directly testing a suspect's blood is still the most" +
                " accurate way to measure BAC levels.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
