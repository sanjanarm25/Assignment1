package com.bridgelabz.AccessModifiersAndOperators;

import java.util.Scanner;

public class SumOfnNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum +=i;
        }
        System.out.println("Sum=" +sum);
    }
}

