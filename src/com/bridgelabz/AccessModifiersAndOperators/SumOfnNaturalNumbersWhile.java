package com.bridgelabz.day2;

import java.util.Scanner;

public class SumOfnNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        int sum=0;
        int i=0;
        while(i<=num){
            sum +=i;
           i=i+1;
        }
        System.out.println("Sum=" +sum);
    }
}
