package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyOne implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyOne"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The answer can depend on the immigrant’s legal status. For undocumented immigrants, any" +
                " criminal offense can lead to deportation.\n" +
                "\n" +
                "For immigrants who are lawfully present in the United States, the Immigration and Nationality Act " +
                "spells out which crimes can get them deported. They include:\n" +
                "\n" +
                "Crimes of moral turpitude with at least a one-year prison sentence. These are crimes that violate the" +
                " community’s general moral standards. Basically, it includes anything that demonstrates “knowing or " +
                "intentional malicious conduct of some kind,” such as violent crimes, an immigration lawyer told the " +
                "LA Times.\n" +
                "Aggravated felonies, which are crimes of violence that are punishable by at least a year in prison, " +
                "like murder, drug trafficking, and battery.\n" +
                "Convictions involving controlled substances, though this does not include a “single offense involving " +
                "possession for one’s own use of 30 grams or less of marijuana.”\n" +
                "High-speed flight from an immigration checkpoint.\n" +
                "Certain firearm offenses.\n" +
                "Domestic violence.\n" +
                "Child abuse, neglect, or abandonment.\n" +
                "Human trafficking.\n" +
                "Although DUI is not explicitly listed under the statute, could it potentially fall into one of the " +
                "deportable categories of crime?";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
