package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiThirteen implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiThirteen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "If you are convicted, most states impose a short jail term or community service if it is" +
                " a first offense. Remember, if you spent the night in jail as a result of your arrest, you may be" +
                " able to use that night as credit for time served (CTS) against the jail sentence the judge imposes." +
                " For example, the state of Indiana posts a Credit Time Calculator on its website. Speak to your" +
                " lawyer to learn more.Your sentence may also include probation, a hefty fine, alcohol education " +
                "classes, and a license suspension. In some states, there is a mandatory minimum jail sentence for" +
                " a misdemeanor DUI, but often times you will be able to serve that sentence on an alternative work " +
                "or community service program.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
