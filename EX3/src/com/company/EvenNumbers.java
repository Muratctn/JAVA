package com.company;

public class EvenNumbers {
    public static void main(String args[]){
        int number= 102;
        System.out.println("Even number from 1 to "+ number +":");
        for (int i=1;i<number; i ++){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }

    }



}
