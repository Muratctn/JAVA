package com.company;

public interface Salary {
    int salaryToPayCETIN56943(int hours, int rate);

    default int salaryForOvertimeCETIN56943(int overtime, int overtimeRate){
        int overtimePaymentCETIN56943 = overtime * overtimeRate;
        return overtimePaymentCETIN56943;
    }

    static int bonusCheckerCETIN56943(int yearsOfExperience){
        if (yearsOfExperience>=5){
            return 50;
        }
        else{
            return 0;
        }
    }
}