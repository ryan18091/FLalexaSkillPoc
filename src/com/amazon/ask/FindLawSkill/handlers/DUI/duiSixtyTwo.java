package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Seven states currently do not have open container laws, including Missouri, Arkansas," +
                " Mississippi, West Virginia, Virginia, Delaware, and Connecticut, even if local ordinances in " +
                "some of those states do in fact prohibit open containers of alcohol. Three states have open" +
                " container laws (Alaska, Louisiana, and Tennessee) that do not fully comply with federal TEA-21" +
                " standards.\n" +
                "\n" +
                "But can a passenger drink alcohol in an automobile in the absence of laws banning open containers?\n" +
                "\n" +
                "The short answer is yes. As long as there are no local ordinances banning open containers in " +
                "vehicles, passengers in states without such laws can in fact drink alcohol in a moving vehicle." +
                " Mississippi is the most permissive, even allowing drivers to drink as long as they remain under " +
                "the legal BAC limit.\n" +
                "\n" +
                "Some municipalities have carved out exceptions to open container laws in an effort to boost tourism, " +
                "such as the French Quarter in New Orleans, but the majority of such ordinances do not allow open" +
                " containers in vehicles (typically limited to streets and sidewalks). The French Quarter, infamous" +
                " for its drive-through frozen cocktail vendors, allows both drivers and passengers to have open" +
                " containers of alcohol in vehicles, as long as the driver is not drinking.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
