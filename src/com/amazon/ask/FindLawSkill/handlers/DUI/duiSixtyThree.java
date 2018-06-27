package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "An open container law restricts where people can drink alcohol in public. Exactly what" +
                " a public place is depends on your state or city's laws, and how courts have interpreted those laws.\n" +
                "\n" +
                "Depending on the particular laws and court rulings, violations of open container laws may occur " +
                "when one drinks or possess an open container of alcohol while:\n" +
                "\n" +
                "On a public sidewalk\n" +
                "Inside your own parked car\n" +
                "On the front steps or in the common hallway of your apartment building.\n" +
                "On school property\n" +
                "In a mobile home\n" +
                "In a residential neighborhood\n" +
                "In a parking lot\n" +
                "Open container laws are designed to protect communities by reducing injuries from drunk driving " +
                "(DUI and DWI) and disorderly conduct.\n" +
                "\n" +
                "Congress passed the Transportation Equity Act for the 21st Century (TEA-21) in 1998 to give states" +
                " a financial incentive for restricting drinking in motor vehicles. State that fail to enact open " +
                "container laws lose a portion of federal highway construction funds.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
