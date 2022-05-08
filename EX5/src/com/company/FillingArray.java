package com.company;

public class FillingArray {
    public static void main(String[] args){
        int[] a = new int[10];
        for (int i = 1; i <= a.length; i++) {
            a[i-1] = a.length-i;
        }
        for (int i:a){
            System.out.println("Array"+i+"="+a[i]);
        }

    }
}
