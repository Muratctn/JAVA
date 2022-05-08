package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Staff extends Person implements Salary {
    int salaryCETIN56943;
    int hoursCETIN56943;
    int workingExperienceCETIN56943;
    int overtimeCETIN56943;
    int overtimeRateCETIN56943;
    String educationCETIN56943;
    String positionCETIN56943;



    void initialize1CETIN56943() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Please enter your education: ");
        educationCETIN56943 = br.readLine();
        System.out.print("Please enter your position: ");
        positionCETIN56943 = br.readLine();
    }



    void print1CETIN56943(){
        System.out.println("Education: "+educationCETIN56943);
        System.out.println("Position: "+positionCETIN56943);
    }
    @Override
    public int salaryToPayCETIN56943(int hours, int rate) {
        int payment= hours*rate;
        return payment;
    }
    @Override
    public int salaryForOvertimeCETIN56943(int overtime, int overtimeRate){
        int overtimePaymentCETIN56943 = overtime * overtimeRate;
        return overtimePaymentCETIN56943;
    }

}
