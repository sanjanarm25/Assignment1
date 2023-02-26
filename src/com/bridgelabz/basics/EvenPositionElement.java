package com.bridgelabz.basics;

public class EvenPositionElement {
    public static void main(String[] args) {
        int [] arr1=new int[5];
        arr1[0]=2;
        arr1[1]=2;
        arr1[2]=6;
        arr1[3]=8;
        arr1[4]=6;
        for(int i=0;i<arr1.length;i++){

            if(i%2==0){
                System.out.println(arr1[i]);
            }

        }

    }
}
