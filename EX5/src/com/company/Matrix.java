package com.company;

public class Matrix {
    public static void main(String[] args){

        int[][] matrix= new int[10][10];
        for(int i = 0; i<matrix.length; i++)
        {
            matrix[i][i] = i;
            for (int j = 0; j< matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i< matrix.length; i++)
        {
            sum += matrix[i][i];
        }
        System.out.println("\nSum of diagonal: " + sum);
    }
    }

