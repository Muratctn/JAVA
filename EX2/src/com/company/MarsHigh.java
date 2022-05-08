package com.company;

public class MarsHigh {    public static void main(String[] args) {
    float eartWeight;
    float marsWeight;
    double marsWeightInDouble;
    int marsWeightInInt;

    eartWeight = 74;
    marsWeight = (eartWeight * 0.38F);
    System.out.println(eartWeight + " kg on Earth is " + marsWeight + " kg on Mars");

    marsWeightInDouble = marsWeight;
    System.out.println("Kilograms on mars after converting to double: " + marsWeightInDouble);

    System.out.printf("Kilograms on Mars displayed to four decimal places: %.4f %n ", marsWeightInDouble);

    marsWeightInInt = (int)marsWeightInDouble;
    System.out.println("Kilograms on mars casted to integer: " + marsWeightInInt);

    char c = (char)marsWeightInInt;
    System.out.println("the ASCII table equivalent of marsweight is: " + c);

    int exampleOfMathOnChar = c * c;
    System.out.println("An example of a mathematical operation on the char type: " + exampleOfMathOnChar);


}
}
