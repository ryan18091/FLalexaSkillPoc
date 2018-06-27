package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyNine implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyNine"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Officers conduct the HGN test either in a well-lit area or with the use of a flashlight," +
                " but with the suspect facing away from the police cruiser's flashing lights (and the lights from " +
                "passing cars), which could skew results. The officer then tells the suspect he or she is going to" +
                " check their eyes and asks whether they wear contact lenses or have any medical issues that would" +
                " affect the results. The officer then asks the suspect to follow an object (usually the tip of a " +
                "pen or pen light), placed 12 to 15 inches away, with only their eyes.\n" +
                "\n" +
                "The officer is looking for the following three clues in each eye:\n" +
                "\n" +
                "Lack of Smooth Pursuit - Does the eye follow the object smoothly as it moves from the center of the " +
                "face toward the ear, or does it jerk?\n" +
                "Distinct Nystagmus at Maximum Deviation - Does the eye have a distinct jerking motion after being" +
                " held toward the outer edge for four seconds?\n" +
                "Onset of Nystagmus Prior to 45 Degrees - As the officer moves the object towards the edge of the " +
                "suspect's shoulder, does the eye jerk before the object is 45 degrees from the center of the " +
                "suspect's face?\n" +
                " \n" +
                "\n" +
                "It's important to stress that the screening for horizontal gaze nystagmus is not the only tool " +
                "police employ to establish probable cause for a DUI arrest. Officers typically require suspected" +
                " impaired drivers to take the three-part sobriety test and then test the individual's BAC using a " +
                "portable breath alcohol monitor (or \"Breathalyzer\") before making an arrest. A second, " +
                "more-conclusive BAC test is taken with a stationary breath alcohol monitor or blood draw at the" +
                " police station for use at trial.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
