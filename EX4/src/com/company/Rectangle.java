package com.company;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RectangleArea {
    double a, b, area;

    void getData() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates area of rectangle");
        System.out.printf("Enter value for side a: ");
        a = Double.parseDouble(br.readLine());
        System.out.printf("Enter value for side b: ");
        b = Double.parseDouble(br.readLine());
    }

    void computeField() { area = a * b;}

    void fieldDisplay() {
        System.out.print("Area of rectangle: ");
        System.out.printf("%2.2f. ", area);
        System.out.print("Where a = ");
        System.out.printf("%2.2f ", a);
        System.out.print("and b = ");
        System.out.printf("%2.2f", b);
    }

    static void allCalculation() throws IOException {
        RectangleArea ra = new RectangleArea();
        ra.getData();
        ra.computeField();
        ra.fieldDisplay();
    }
}

public class Rectangle {
    public static void main(String[] args) throws IOException {

        RectangleArea.allCalculation();
    }
}