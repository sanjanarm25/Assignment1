package com.bridgelabz.Day5PracticeProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount=0;
        int tailCount=0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter no. of times flip the coin :");
        double count=sc.nextInt();
        for (int i=0;i<count;i++){
            double random=Math.random();
            System.out.println(random);
            if(random<0.5){
                tailCount++;
            }else{
                headCount++;
            }

        }
        double head=headCount/ count*100;
        double tail=tailCount/ count*100;
        System.out.println("The percentage of Head is " +head +"%");
        System.out.println("The percentage of Tail is " +tail +"%");


    }
}
