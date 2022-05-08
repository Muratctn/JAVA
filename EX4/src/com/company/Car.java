package com.company;

import java.io.IOException;

class Cars {
    private String model;
    private String brand;
    private String color;
    private int price;
    private int year;
    private int quantity;

    public Cars(String model, String brand, String color, int price, int year, int quantity) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", quantity=" + quantity +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



public class Car {
    public static void main(String[] args) throws IOException {
        Cars car1 = new Cars("RAM","Dodge","Black", 190000,2017,8);
        System.out.println(car1.toString());

        System.out.println(car1.getColor());

        int year = car1.getYear();

        car1.setColor("Dark Blue");

        System.out.println(car1.toString());
        System.out.println(year);
    }
}