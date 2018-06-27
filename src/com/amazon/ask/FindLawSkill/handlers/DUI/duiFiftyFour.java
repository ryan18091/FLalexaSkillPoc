package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyFour implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyFour"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "But not all DUI offenses are treated the same, as most insurers look at them on a " +
                "case-by-case basis. For example, you might only get a marginal rate increase if you have an otherwise" +
                " excellent driving record and the DUI conviction is your first offense. Successive drunk driving" +
                " offenses, however, usually result in exponentially higher rate increases, while many insurance" +
                " companies refuse to cover repeat offenders. Keep in mind that insurance companies have a few years " +
                "in which to raise your rates for a DUI conviction, even if they don't discover it right away. The " +
                "offense may even affect your life insurance premiums.\n" +
                "\n" +
                "Whether or not your auto insurance company quickly discovers your DUI (if at all) depends on the" +
                " given state's laws and procedures, not to mention the way your case was handled. Roughly 20 " +
                "percent of convictions for traffic violations (including DUI) don't even make it into motor vehicle" +
                " records, according to the Insurance Research Council. Reasons why the offense may fly under the" +
                " radar include poor communication between the courts and the DMV, an erased conviction due to" +
                " defensive driving school, or a reduced charge due to a guilty plea. Your conviction may also" +
                "escape detection by your insurer if you committed the offense in a state that doesn't require an" +
                " SR-22 form.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
