package com.bridgelabz.Day5PracticeProblems;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the harmonic value");
        int val=sc.nextInt();
        float harmonic=1;
        for(int i=2;i<=val;i++){
            harmonic= harmonic+(float)1/i;
        }
        System.out.println("The nth harmonic value is : " +harmonic);
    }
}
