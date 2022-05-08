package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String surnameCETIN56943;
    String firstnameCETIN56943;
    String streetCETIN56943;
    int zipcodeCETIN56943;
    String cityCETIN56943;



    void initialize2CETIN56943()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter your name: ");
        firstnameCETIN56943 = br.readLine();
        System.out.print("Please enter your lastname: ");
        surnameCETIN56943 = br.readLine();
        System.out.print("Please enter your street: ");
        streetCETIN56943 = br.readLine();
        System.out.print("Please enter your zipCode: ");
        zipcodeCETIN56943 = Integer.parseInt(br.readLine());
        System.out.print("Please enter your city: ");
        cityCETIN56943 = br.readLine();
    }
    void print2CETIN56943(){
        System.out.println("Name: " + firstnameCETIN56943);
        System.out.println("Lastname: " + surnameCETIN56943);
        System.out.println("Street: " + streetCETIN56943);
        System.out.println("Zipcode: " + zipcodeCETIN56943);
        System.out.println("City: " + cityCETIN56943);
    }
}