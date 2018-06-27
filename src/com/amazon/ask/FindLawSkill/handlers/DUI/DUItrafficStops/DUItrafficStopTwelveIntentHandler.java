package com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DUItrafficStopTwelveIntentHandler implements RequestHandler{

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DUItrafficStopTwelve"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {



        String videoURL = "https://s3.amazonaws.com/findlawpocvideo/Ohio+OVI%2C+DUI%2C+DWI%2C+Drunk+Driving+Defense+" +
                "Lawyers+Rittgers+%26+Rittgers.mp4";
        String videoTitle = "Sample Video Title";
        String videoSubTitle = "Sample Video SubTitle";

        // Device supports display interface
        if(null!=input.getRequestEnvelope().getContext().getDisplay()) {
            System.out.println("if");
            return input.getResponseBuilder()
//                    .withSpeech(speechText)
                    .addVideoAppLaunchDirective(videoURL,videoTitle,videoSubTitle)
//                    .withReprompt(secondaryText)
                    .build();
        } else {
            String title = "DUI information";
            String primaryText = "";
            String secondaryText = "Ask another question, or ask to find legal help";

            String speechText = "A drunk driving offense, sometimes called operating under the influence of liquor " +
                    "(OUIL) or driving with an unlawful blood alcohol level (UBAL) has several meanings:\n" +
                    "1.\tDriving with any amount of alcohol in your system which causes your physical abilities to be " +
                    "impaired to a certain degree.\n" +
                    "2.\tDriving with a level of alcohol in your system which amounts to a measurement of .10 of blood " +
                    "alcohol content. To be guilty of this offense, absolutely no impairment of any of your physical " +
                    "abilities is necessary. You may well be the world's most talented, careful and safest driver, but" +
                    " if your blood alcohol content registers .10 or above you are guilty of a criminal offense.\n" +
                    "3.\tDriving with drugs in your system or with a combination of drugs and alcohol, no matter what the" +
                    " amounts of those substances may be, where your physical abilities have become impaired to a certain " +
                    "degree. It does not matter if the drugs are legal, over the counter medications like antihistamines, " +
                    "nor does it matter if you have a prescription to take the drugs. If you are impaired as a result of " +
                    "taking them, then you are guilty of a criminal offense.\n";

//            String speechText = "test";

            String imageUrl = "https://www.findlawimages.com/latl/findlaw.png";


            System.out.println("else");
            // Headless device
            return input.getResponseBuilder()
                    .withSpeech(speechText)
                    .withSimpleCard(title, secondaryText)
                    .withReprompt(secondaryText)
                    .build();
        }

//        return input.getResponseBuilder()
////                .withSimpleCard("DUI", speechText)
//                .withSpeech(speechText)
//                .withReprompt(secondaryText)
//                .addVideoAppLaunchDirective(videoURL,videoTitle,videosubTitle)
////                .addVideoDirective(videoURL, videoTitle, videosubTitle)
//                .build();
    }
}
