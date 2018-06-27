package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiFiftySeven implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiFiftySeven"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Most states allow employers to refuse employment to anyone with a conviction record and " +
                "many even allow employers to refuse applicants with an arrest record, mainly due to a lack of" +
                " regulations in this area. At least 14 states have legal standards requiring an employer to prove " +
                "the job relevance of a given conviction, including Colorado, Florida, Kansas, and New York. But only" +
                " Hawaii, Kansas, New York, and Wisconsin apply these regulations to private employers as well.\n" +
                "\n" +
                "California and eight other states offer certificates of rehabilitation for employment purposes to " +
                "those convicted of a DUI or other crimes, lifting some barriers to employment. California Labor " +
                "Code 432.7 states that employers cannot ask about an arrest that did not result in a conviction." +
                " And if you successfully complete a probation for a DUI in California, you can file a motion to" +
                " withdraw your plea or set aside the verdict; this will show in your records that the case was" +
                " dismissed.\n" +
                "\n" +
                "Those running for public office or applying for a professional license in the state must disclose " +
                "a DUI (or any conviction) from the past 10 years; the same is true for direct questions on an" +
                " application regarding criminal convictions.\n" +
                "\n" +
                "Most states require background checks for certain types of jobs, including anyone who works with " +
                "children, the elderly or the disabled. This doesn't necessarily mean a DUI record will preclude " +
                "such an applicant from consideration, but it could factor into an employer's hiring decision as a" +
                " perceived character flaw. Also, many state and federal jobs require a background check; but this " +
                "may depend on the kind of job, such as those requiring a security clearance.\n" +
                "\n" +
                "Commercial drivers who commit a DUI on the job, or even in their personal vehicle, are prohibited " +
                "from driving in a professional capacity for a certain period of time. As of 1999, convictions for" +
                " major violations committed in a commercial vehicle (including a DUI) remain on one's CDL record " +
                "   for 55 years.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
