package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.print (i + " ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println(num);
        }
    }
}
