package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtyEight implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtyEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "The term \"nystagmus\" generally refers to any bouncing or jerking of the eye." +
                " Police officers are concerned only with horizontal gaze nystagmus, a completely involuntary motion" +
                " that becomes more pronounced when an individual is impaired by alcohol (in addition to some illicit" +
                " and prescription drugs, primarily depressants). Since alcohol depresses the nervous system, it has" +
                " a noticeable effect on the ability to control sideways eye movements in a smooth and accurate" +
                " manner. In fact, those who exhibit these exaggerated eye jerks aren't even aware of it, since" +
                " HGN has no noticeable effect on one's vision.\n" +
                "\n" +
                "Taken as a whole, the three-part field sobriety test has been shown to accurately determine " +
                "blood-alcohol concentration (BAC) of 0.10 percent or higher 83 percent of the time, according " +
                "to a study cited by the National Highway Traffic Safety Administration (NHTSA). The other two " +
                "components are the one-leg-stand (OLS) and walk-and-turn (WAT) tests.\n" +
                "\n" +
                "Multiple NHTSA-funded studies since 1977 have shown the HGN screening to be an accurate indicator " +
                "of alcohol impairment, and in fact the most accurate portion of the three-part test.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
