package com.bridgelabz.basics;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr1=new int[5];
        arr1[0]=2;
        arr1[1]=4;
        arr1[2]=6;
        arr1[3]=2;
        arr1[4]=4;
        for(int i=0;i<arr1.length;i++){
            for(int j = i + 1; j < arr1.length; j++) {
                if(arr1[i] == arr1[j])
                    System.out.println(arr1[j]);
            }
        }
    }
}
