package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightySix implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightySix"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Some drugs legally purchased at a pharmacy, whether they're prescribed by a doctor or" +
                " bought over-the-counter (OTC), can be just as dangerous for motorists as alcohol and can trigger a" +
                " DUI. Look for warning labels or ask your pharmacist if you are in doubt about a drug's capacity for" +
                " impairment.\n" +
                "\n" +
                "Below are some common prescription and OTC drugs that can impair drivers:\n" +
                "\n" +
                "Antidepressants: Some sedating antidepressants cause impairment similar to drunk driving.\n" +
                "Valium: 10 mg of the popular tranquilizer can cause impairment similar to having a blood-alcohol " +
                "concentration of 0.10 percent.\n" +
                "Antihistamines: Many of them slow reaction time and impair coordination.\n" +
                "Decongestants: Many over-the-counter decongestants can cause drowsiness, anxiety and dizziness.\n" +
                "Sleeping Pills: Even in the morning, the residual effects of these drugs can impair drivers.\n" +
                "Hydrocodone: This common pain reliever, the main component of Vicodin, is similar to opiates and" +
                " causes impairment similar to morphine and codeine (oxycodone has similar effects).";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
