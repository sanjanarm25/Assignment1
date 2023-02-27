package com.bridgelabz.basics;

import java.util.Scanner;

public class ArithmaticOperations {


    public static void main(String[] args) {
        System.out.println("a");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("b");
        Scanner sm=new Scanner(System.in);
        int b= sm.nextInt();
        System.out.println("c");
        Scanner pk=new Scanner(System.in);
        int c= pk.nextInt();
        int op1=a+b*c;
        System.out.println("a+b*c= " + op1);
        int op2=c+a/b;
        System.out.println("c+a/b= " + op2);
        int op3= a%b+c;
        System.out.println("a%b+c= " + op3);
        int op4=a*b+c;
        System.out.println("a*b+c= " + op4);






    }
}
