package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1");
        int num1= sc.nextInt();

        Scanner ss=new Scanner(System.in);
        System.out.println("enter the num2");
        int num2= sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " +num1);
        System.out.println("Second number = " + num2);
    }
}
