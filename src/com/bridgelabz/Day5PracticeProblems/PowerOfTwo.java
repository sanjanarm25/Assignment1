package com.bridgelabz.Day5PracticeProblems;

public class PowerOfTwo {
    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        int power =1;
        int i=0;
        if( num>=0 && num< 31) {
            System.out.println("num   "+"power of 2");
            while (i <= num) {
                System.out.println(" "+i + "        " + power);
                power = 2 * power;
                i = i + 1;
            }
        }else{
            System.out.println("value of num should be less than 31");
        }
    }
}
