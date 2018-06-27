package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiNinetyThree implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiNinetyThree"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "When answering this question, remember that in most situations, any legal representation" +
                " in a criminal case is better than none. However, this is not to say that a court-appointed lawyer" +
                " is little better than nothing. In fact, many public defenders and court-appointed lawyers are some" +
                " of the best legal minds in the world. Public defenders often have more courtroom time and experience" +
                " than many private defense lawyers twice their age. Indeed, public defenders have been on the defense" +
                " side of many of the most prestigious cases in our country's history.\n" +
                "\n" +
                "However, the time and effort that court-appointed lawyers can spend on their cases has declined in" +
                " recent years with reduced government funding and higher caseloads. Indeed, in some places it has" +
                " become so bad that public defenders only meet their clients for the first time in the court's " +
                "anteroom before trial starts.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
