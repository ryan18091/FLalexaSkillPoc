package com.amazon.ask.FindLawSkill;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Lawyer {

    private String first_name;
    private String last_name;
    private String firm_name;
    private String address;
    private String city;
    private String county;
    private String state;
    private String zip;
    private String phone1;
    private String phone2;
    private String email;
    private String web;


    public Lawyer(String first_name, String last_name, String firm_name, String address, String city, String county, String state, String zip, String phone1, String phone2, String email, String web) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.firm_name = firm_name;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zip = zip;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.email = email;
        this.web = web;
    }

    public Lawyer() {

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirm_name() {
        return firm_name;
    }

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }


    @Override
    public String toString() {
        return "Lawyer{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", firm_name='" + firm_name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone1='" + phone1 + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", email='" + email + '\'' +
                ", web='" + web + '\'' +
                '}';
    }

    //This is not the best place for this method. Without having a main method where should this go?
    public List<Lawyer> csvToLawyerList(){

        //Delimiters used in the CSV file
        String COMMA_DELIMITER = ",";

        BufferedReader br = null;
        //Create List for holding Employee objects
        List<Lawyer> lawyerList = new ArrayList<Lawyer>();
        try {
            //Reading the csv file, V2 removed rows with extra commas in names causing parsing error
            br = new BufferedReader(new FileReader("AttorneysforAlexa.csv"));

//            //Create List for holding Employee objects
//            List<Lawyer> lawyerList = new ArrayList<Lawyer>();

            String line = "";
            //Read to skip the header
            br.readLine();
            //Reading from the second line
            while ((line = br.readLine()) != null) {
                String[] LawyerDetails = line.split(COMMA_DELIMITER);

                if (LawyerDetails.length > 0) {
                    System.out.println("Creating Object");
                    //Save the employee details in Employee object
                    Lawyer emp = new Lawyer(LawyerDetails[0],
                            LawyerDetails[1], LawyerDetails[2],
                            LawyerDetails[3], LawyerDetails[4],
                            LawyerDetails[5], LawyerDetails[6],
                            LawyerDetails[7], LawyerDetails[8],
                            LawyerDetails[9], LawyerDetails[10],
                            LawyerDetails[11]);
                    lawyerList.add(emp);
                }
            }

            System.out.println(lawyerList.size());
            System.out.println(lawyerList.get(0).getFirm_name());


            //Lets print the Employee List
//            for (Lawyer e : lawyerList) {
//                System.out.println(e.getFirm_name() + "   " + e.getFirst_name());
//            }
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ie) {
                System.out.println("Error occured while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
        return lawyerList;

    }
}
