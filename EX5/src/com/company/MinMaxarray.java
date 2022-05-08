package com.company;

import java.util.Random;

public class MinMaxarray {
    public static void main(String[] args){
        int[] a= new int[10];
        for (int i = 0; i < a.length; i++){
            Random rand = new Random();
            a[i] = rand.nextInt(1,100);
            System.out.printf(a[i]+",");
        }
        System.out.println("");
        int max = a[0];
        int min=a[0];
        for (int i = 0; i < a.length;i++)
        {
            if (max < a[i]) max =  a[i];
            if (min > a[i]) min =  a[i];
        }
        System.out.println("Max value:"+max);
        System.out.println("Min value:"+min);
    }
}
