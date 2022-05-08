package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMICalculator {
    public static void main(String[] args) throws IOException{
        float height , weight ,bmi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The program will calculate your BMI");
        System.out.println("Enter your height in cm:");
        height =Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight :");
        weight =Float.parseFloat(br.readLine());

        bmi = (float) (weight/(Math.pow(height,2)));
        System.out.printf("Your BMI is:"+"%2.2f,\n",bmi);
        if (bmi<16){
            System.out.println("You are starving");
        } else if ((bmi>=16)&&(bmi < 16.99)){
            System.out.println("You are emaciated");
        } else if ((bmi>=17)&&(bmi < 18.49)) {
            System.out.println("You are underweight");
        }else if ((bmi>=18.50)&&(bmi < 22.99)){
            System.out.println("You are in the low range of the norm");
        }else if ((bmi>=23)&&(bmi < 24.99)){
            System.out.println("You are in the high range of the norm");
        }else if ((bmi>=25)&&(bmi < 27.49)) {
            System.out.println("You are overweight (pre-obese)");
        }else if ((bmi>=27.50)&&(bmi < 29.99)){
                System.out.println("You are overweight ");
        }else if ((bmi>=30)&&(bmi < 34.99)){
            System.out.println("You have 1st degree obesity");
        }else if ((bmi>=35)&&(bmi < 39.99)) {
            System.out.println("You have 2nd degree obesity");
        }else if((bmi>40)){
            System.out.println("You have 3rd degree obesity");
        }







        }
}
