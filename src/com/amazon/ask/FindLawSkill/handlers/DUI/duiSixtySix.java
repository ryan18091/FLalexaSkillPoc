package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiSixtySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiSixtySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Often confused with its larger, more-precise cousin the Breathalyzer (and similar" +
                " instruments used for gathering evidence), the PAS device is just another tool used by police" +
                " to establish probable cause at the scene of the traffic stop. The hand-held device has a tube " +
                "into which the suspect submits a breath sample, providing an instant estimate of the individual's" +
                " BAC. The officer then decides whether to make an arrest based on that and other observations," +
                " but a positive PAS test result is neither necessary for an arrest nor admitted into evidence for" +
                " trial in many states.\n" +
                "\n" +
                "Just how accurate are these devices? It depends on who you ask, but most states have determined " +
                "through case law or statute that they are not reliable enough -- nor subject to the same stringent" +
                " police standards as are evidentiary BAC-testing instruments -- to be admitted as evidence.\n" +
                "\n" +
                "Illinois statute (625 ILCS 5/11-501.5), for example, explicitly states that roadside testing" +
                " with a PAS device is only for determining probable cause and that suspects may refuse the test." +
                " In Alaska, police may not ask a motorist to submit to a preliminary BAC test unless probable" +
                " cause has already been established (Guerre-Chaley v. State, 88 P.3d 539 (Alaska App. 2004)).\n" +
                "\n" +
                "Some states, however, allow the defense to offer evidence from preliminary tests (using a PAS " +
                "device) to show that testing was in some way defective or inaccurate, often in comparison to" +
                " the evidentiary test results.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
