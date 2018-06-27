/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.FindLawSkill;

import com.amazon.ask.FindLawSkill.handlers.*;
import com.amazon.ask.FindLawSkill.handlers.CriminalProcedure.*;
import com.amazon.ask.FindLawSkill.handlers.DUI.*;
import com.amazon.ask.FindLawSkill.handlers.DUI.BUI.*;
import com.amazon.ask.FindLawSkill.handlers.DUI.DUItrafficStops.*;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class AlexaSkillStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new FindALawyerIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new WhatsMyZipcodeIntentHandler(),
                        new MyZipcodeIsIntentHandler(),
                        new FallBackIntentHandler(),
                        new DUItrafficStopOneIntentHandler(),
                        new DUItrafficStopTwoIntentHandler(),
                        new DUItrafficStopThreeIntentHandler(),
                        new DUItrafficStopFourIntentHandler(),
                        new DUItrafficStopFiveIntentHandler(),
                        new DUItrafficStopSixIntentHandler(),
                        new DUItrafficStopSevenIntentHandler(),
                        new DUItrafficStopEightIntentHandler(),
                        new DUItrafficStopNineIntentHandler(),
                        new DUItrafficStopTenIntentHandler(),
                        new DUItrafficStopElevenIntentHandler(),
                        new DUItrafficStopTwelveIntentHandler(),
                        new BUIOneIntentHandler(),
                        new BUITwoIntentHandler(),
                        new BUIThreeIntentHandler(),
                        new BUIFourIntentHandler(),
                        new BUIFiveIntentHandler(),
                        new BUISixIntentHandler(),
                        new BUISevenIntentHandler(),
                        new BUIEightIntentHandler(),
                        new BUINineIntentHandler(),
                        new CriminalProcedureOneHandler(),
                        new CriminalProcedureTwoHandler(),
                        new CriminalProcedureThreeHandler(),
                        new CriminalProcedureFourHandler(),
                        new CriminalProcedureFiveHandler(),
                        new CriminalProcedureSixHandler(),
                        new CriminalProcedureSevenHandler(),
                        new duiOne(),
                        new duiTwo(),
                        new duiThree(),
                        new duiFour(),
                        new duiFive(),
                        new duiSix(),
                        new duiSeven(),
                        new duiEight(),
                        new duiNine(),
                        new duiTen(),
                        new duiEleven(),
                        new duiTwelve(),
                        new duiThirteen(),
                        new duiFourteen(),
                        new duiFifteen(),
                        new duiSixteen(),
                        new duiSeventeen(),
                        new duiEighteen(),
                        new duiNineteen(),
                        new duiTwenty(),
                        new duiTwentyOne(),
                        new duiTwentyTwo(),
                        new duiTwentyThree(),
                        new duiTwentyFour(),
                        new duiTwentyFive(),
                        new duiTwentySix(),
                        new duiTwentySeven(),
                        new duiTwentyEight(),
                        new duiTwentyNine(),
                        new duiThirty(),
                        new duiThirtyOne(),
                        new duiThirtyTwo(),
                        new duiThirtyThree(),
                        new duiThirtyFour(),
                        new duiThirtyFive(),
                        new duiThirtySix(),
                        new duiThirtySeven(),
                        new duiThirtyEight(),
                        new duiThirtyNine(),
                        new duiForty(),
                        new duiFortyOne(),
                        new duiFortyTwo(),
                        new duiFortyThree(),
                        new duiFortyFour(),
                        new duiFortyFive(),
                        new duiFortySix(),
                        new duiFortySeven(),
                        new duiFortyEight(),
                        new duiFortyNine(),
                        new duiFifty(),
                        new duiFiftyOne(),
                        new duiFiftyTwo(),
                        new duiFiftyTwo(),
                        new duiFiftyThree(),
                        new duiFiftyFour(),
                        new duiFiftyFive(),
                        new duiFiftySix(),
                        new duiFiftySeven(),
                        new duiFiftyEight(),
                        new duiFiftyNine(),
                        new duiSixty(),
                        new duiSixtyOne(),
                        new duiSixtyTwo(),
                        new duiSixtyThree(),
                        new duiSixtyFour(),
                        new duiSixtyFive(),
                        new duiSixtySix(),
                        new duiSixtySeven(),
                        new duiSixtyEight(),
                        new duiSixtyNine(),
                        new duiSeventy(),
                        new duiSeventyOne(),
                        new duiSeventyTwo(),
                        new duiSeventyThree(),
                        new duiSeventyFour(),
                        new duiSeventyFive(),
                        new duiSeventySix(),
                        new duiSeventySeven(),
                        new duiSeventyEight(),
                        new duiSeventyNine(),
                        new duiEighty(),
                        new duiEightOne(),
                        new duiEightyTwo(),
                        new duiEightyThree(),
                        new duiEightyFour(),
                        new duiEightyFive(),
                        new duiEightySix(),
                        new duiEightySeven(),
                        new duiEightyEight(),
                        new duiEightyNine(),
                        new duiNinety(),
                        new duiNinetyOne(),
                        new duiNinetyTwo(),
                        new duiNinetyThree(),
                        new duiNinetyFour(),
                        new duiNinetyFive(),
                        new duiNinetySix())
//                        new WhatsMyZipcodeIntentHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public AlexaSkillStreamHandler() {
        super(getSkill());
    }

}


