package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetyFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetyFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "But proving fault of the alcohol vendor is a relatively difficult task. For example," +
                " how do bartenders know whether a patron is drinking on an empty stomach, has a low tolerance or" +
                " was intoxicated before entering the establishment? How do they know the patron even drove a car?\n" +
                "\n" +
                "Plaintiffs invoking the Illinois Dramshop Act, to give an example, must be able to prove the" +
                " following at trial:\n" +
                "\n" +
                "Proof of sale of alcohol to the patron\n" +
                "Injuries sustained by the patron\n" +
                "Proximate cause between the alcohol sale and intoxication\n" +
                "Intoxication was at least one cause of the third-party damages\n" +
                "Not all dram shop laws are the same - in fact they can differ quite a bit. States that do impose " +
                "a dram shop laws may definte specific terms in their stautes differently. Words like \"guest or" +
                " patron\" and retailer can carry different meanings.\n" +
                "\n" +
                "One commanality is often the application of the “obvious intoxication test,” where a retailer" +
                " knew or should have known that the patron was so intoxicated that more alcohol would cause " +
                "danger to himself or to others.\n" +
                "\n" +
                "Currently 43 states and the District of Columbia have some sort of dram shop law in effect," +
                " varying in scope. Those states without dram shop laws are Delaware, Kansas, Louisiana," +
                " Maryland, Nebraska, Nevada, South Dakota and Virginia.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
