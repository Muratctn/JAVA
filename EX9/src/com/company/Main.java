package com.company;

import java.util.Arrays;

class TestException {
    public void genExceptionsa() {
        String Cetin = null;
        System.out.println("Exception null");

    }
}

public class Main {

    public static void main(String[] args) {
        try {
            TestException exceptiontest= new TestException();
            exceptiontest.genExceptionsa();

        } catch (NullPointerException ex ) {
            ex.printStackTrace();
            System.out.println(ex);
            ex.getMessage();

        }
    }
}
class Arith {
    public static void main(String args[]) {
        try {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            int a[]=new int[25];
            a[35] = 9;
            System.out.println("Result: " + output);
        } catch(ArithmeticException e){
            System.out.println("catch :ArithmeticException ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch :ArrayIndexOutOfBoundsException");
        }
        finally {
            System.out.println("The try catch is finished.");
        }
    }
}
