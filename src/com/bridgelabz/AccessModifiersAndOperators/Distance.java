package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter x1 point");

        double x1=sc.nextInt();

        System.out.println("enter y1 point");

        double y1=sc.nextInt();

        System.out.println("enter x2point");

        double x2=sc.nextInt();

        System.out.println("enter y2 point");

        double y2=sc.nextInt();

        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);

    }
}
