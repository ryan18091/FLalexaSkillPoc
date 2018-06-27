package com.amazon.ask.FindLawSkill;

import java.util.List;

public class main {

    public static void main(String[] args){

        List<Lawyer> lawyerList = new Lawyer().csvToLawyerList();

        int intZip = 55124;
        Lawyer nearestLawyer = new Lawyer();
        int nearestLawyerDistance = 2000;


        for(Lawyer l : lawyerList) {
            int distanceToLawyer = Math.abs(intZip - Integer.parseInt(l.getZip()));
            if(distanceToLawyer > nearestLawyerDistance) {
                nearestLawyerDistance = distanceToLawyer;
                nearestLawyer = l;
            }
        }

        System.out.println(nearestLawyer.getFirm_name());
    }
}
