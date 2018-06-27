package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightyFive implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightyFive"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Driving with a blood-alcohol concentration (BAC) above a certain level -- typically" +
                " 0.08 percent or higher -- is illegal in all 50 states. Alcohol is flushed from the body rapidly," +
                " so it's relatively easy to measure a motorist's BAC at the time of a traffic stop. And since" +
                " Breathalyzer tests are quite accurate, with readings of 0.08 percent or higher often resulting " +
                "in a guilty plea or conviction on DUI charges if the traffic stop was carried out according to" +
                " proper protocol.\n" +
                "\n" +
                "That's not the case with drugs other than alcohol.\n" +
                "\n" +
                "For example, the psychoactive component of marijuana (THC) is detectable in a person's urine or" +
                " bloodstream for up to four or five weeks after use and there is no way to conclusively detect" +
                " actual impairment at a particular time. Cocaine, on the other hand, typically leaves the body" +
                " after just a day or two. NHTSA admitted in a letter to Congress that current knowledge about drugs" +
                " other than alcohol is \"insufficient to allow the identification of dosage limits that are related" +
                " to elevated crash risk.\"\n" +
                "\n" +
                "Some jurisdictions use what are called \"Drug Recognition Experts\" (DREs) -- specially trained" +
                " police officers who follow specific guidelines to determine drug impairment in motorists. DREs" +
                " closely examine a person's eye movements, behavior and other cues pointing to drug influence." +
                " Forty-four states and the District of Columbia have Drug Evaluation and Classification Programs" +
                " in place to train DREs.\n" +
                "\n" +
                "The presence of drugs typically is measured through urinalysis or a blood sample.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
