package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFortySeven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFortySeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Perhaps a penalty that hits harder than community service or even jail is losing your" +
                " driver’s license. We use our cars for many important activities including getting to work," +
                " dropping the kids off at school, going to the doctor’s office, and even for our livelihood in" +
                " the cases of commercial drivers. For most first offense DUIs, you will automatically lose your" +
                " license for just the DUI arrest. In many states, it can be as long as 90 days or more. If you" +
                " refuse a chemical test, the suspension can be even longer.\n" +
                "\n" +
                "In most situations, you will likely be able to apply for a restricted license allowing you to go" +
                " to and from work, school, and any court-mandated alcohol treatment programs. Keep in mind, if you" +
                " are arrested and convicted of a DUI-related charge, your license suspension can be even longer" +
                " For instance, in California a first offense DUI carries a six-month license suspension (with the" +
                " possibility of a restricted license).";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
