package com.amazon.ask.FindLawSkill.handlers.DUI;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class duiEightyTwo implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("duiEightyTwo"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String title = "DUI information";
        String primaryText = "";
        String secondaryText = "Ask another question, or ask for legal help";

        String speechText = "Bus drivers, truck drivers, and other professionals with a commercial driver's license" +
                " (CDL) are held to a higher standard than non-commercial drivers with respect to impaired driving," +
                " as established by the Federal Motor Carrier Safety Administration (FMCSA). And with good reason. " +
                "Whether their cargo is a steel tank full of gasoline or a school bus packed with elementary school " +
                "children, the stakes are much higher in than for the typical automobile driver. A drunk or drugged" +
                " commercial driver not only poses a serious threat to public safety but also is a serious liability" +
                " to his or her employer.\n" +
                "\n" +
                "Here are some examples of drivers and employers that may be subject to FMCSA regulations regarding" +
                " drugs and alcohol use by commercial drivers:\n" +
                "\n" +
                "Anyone who owns or leases commercial motor vehicles,\n" +
                "Anyone who assigns drivers to operate commercial motor vehicles,\n" +
                "Federal, state and local governments,\n" +
                "For-hire motor carriers,\n" +
                "Private motor carriers,\n" +
                "Civic organizations (i.e. disabled veteran transport, Girl Scouts, etc.), and\n" +
                "Churches";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withReprompt(secondaryText)
                .build();
    }
}
