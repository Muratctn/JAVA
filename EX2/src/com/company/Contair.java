package com.company;

public class Contair {  public static void main(String[] args) {




    int amountOfBricks =63;



    int containerCapacity = 8;




    int containersUnfilled = amountOfBricks % containerCapacity;

    System.out.println("The number of unfilled containers will be " + containersUnfilled);





    int filledContainers = amountOfBricks / containerCapacity;

    System.out.printf("Number of filled containers: " + filledContainers);




    System.out.println(" ");

    int totalContainers = filledContainers + containersUnfilled;

    System.out.println("Number of containers in total are " + totalContainers);



}

}

