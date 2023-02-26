package com.bridgelabz.basics;

public class ReverseOrderElement {
    public static void main(String[] args) {
        int [] arr1=new int[5];
        arr1[0]=2;
        arr1[1]=2;
        arr1[2]=6;
        arr1[3]=8;
        arr1[4]=6;
        for(int i=arr1.length-1;i>=0;i--){

            System.out.println(arr1[i]);
        }

    }
}
