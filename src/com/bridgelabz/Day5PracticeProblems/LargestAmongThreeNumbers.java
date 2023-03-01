package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1= sc.nextInt();

        Scanner ss=new Scanner(System.in);
        System.out.println("enter the num2");
        int num2= sc.nextInt();

        Scanner sp=new Scanner(System.in);
        System.out.println("enter the num3");
        int num3= sc.nextInt();

        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    }
}

