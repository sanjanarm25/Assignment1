package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int arr[][] = new int[15][15];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter row for the array max 15 : ");
        int row = scan.nextInt();
        System.out.print("Enter column for the array max 15 : ");
        int column = scan.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("The Array is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
