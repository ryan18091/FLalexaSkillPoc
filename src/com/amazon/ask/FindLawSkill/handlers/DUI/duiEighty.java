package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEighty implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEighty"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "This varies, of course, by the reputation and experience of the lawyer and by the" +
                " geographic location. As with doctors, generally the more skilled the attorney and the larger the" +
                " city, the higher the fee. A related factor is the amount of time a lawyer devotes to his cases:" +
                " the better lawyers take fewer clients, spending more hours on each.\n" +
                "\n" +
                "The range of fees is huge. A general practitioner in a small community may charge only $500; an" +
                " OUIL specialist with a national reputation may charge $7,500. In addition, the fee may vary by" +
                " such other factors as:\n" +
                "\n" +
                "Is the offense a misdemeanor or felony?\n" +
                "If prior convictions are alleged, the procedures for attacking them may add to the cost.\n" +
                "The fee may or may not include trial or appeals.\n" +
                "Administrative license suspension procedures may also be extra.\n" +
                "The lawyer may charge a fixed fee, or he may ask for a retainer in advance-to be applied against" +
                " hourly charges.\n" +
                "Costs such as witness fees, independent blood analysis, service of subpoenas, etc. may be extra.\n" +
                "Whatever the fee quoted, you should ask for a written agreement and make sure you understand all" +
                " the terms.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
