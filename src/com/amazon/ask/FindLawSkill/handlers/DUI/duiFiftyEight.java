package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftyEight implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftyEight"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Roughly 20 different types of information may be included in an official background " +
                "check; these may include driving records, vehicle registration, criminal records, court records," +
                " character references, neighbor interviews and incarceration records. Some of this information may" +
                " be gleaned from a pre-employment questionnaire or the job application itself. While most such " +
                "questions are limited to whether or not the applicant has committed a felony, some states allow " +
                "much broader questions about past charges for crimes.\n" +
                "\n" +
                "As a rule of thumb, it's usually best to tell the truth; while employers may overlook the admittance" +
                " of a DUI offense, being caught in a lie usually removes the applicant from consideration for the job.\n" +
                "\n" +
                "But the internet has proven to be a powerful tool for more informal background checks of job " +
                "candidates, including online public records and social networking sites such as Facebook. For " +
                "example, a steadily increasing percentage of employers admit to using Facebook to review job " +
                "candidates, which could turn up information about a DUI arrest that otherwise might not show " +
                "up (maybe you or a friend commented on the arrest). In this respect, an applicant who otherwise " +
                "does not consent to a background check may be subject to one without even knowing.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
