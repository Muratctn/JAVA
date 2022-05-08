package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BasicCalculator {
    public static void main(String[] args) throws IOException {
        float firsNumber , secondNumber, sum, substraction, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("the program calculates sum, difference, product and quotient for two numbers.");
        System.out.println("Enter the first number ( and press Enter)");
        firsNumber= Float.parseFloat(br.readLine());
        System.out.println("Enter the second number ( and press Enter)");
        secondNumber= Float.parseFloat(br.readLine());
        sum=firsNumber+secondNumber;
        substraction=firsNumber-secondNumber;
        product=firsNumber*secondNumber;
        quotient=firsNumber/secondNumber;
        System.out.printf("You entered two numbers , the first is: "+"%2.2f",firsNumber);
        System.out.printf(" and the second is , : "+"%2.2f",secondNumber);
        System.out.println();
        System.out.printf("Sum= "+"%2.2f, \n",+sum);
        System.out.printf("Difference= "+"%2.2f, \n",+substraction);
        System.out.printf("product= "+"%2.2f, \n",+product);
        System.out.printf("quotient= "+"%2.2f, \n",+quotient);

    }

}

