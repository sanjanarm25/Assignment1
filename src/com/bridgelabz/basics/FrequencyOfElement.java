package com.bridgelabz.basics;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int [] arr1=new int[5];
        arr1[0]=2;
        arr1[1]=2;
        arr1[2]=6;
        arr1[3]=8;
        arr1[4]=6;
        int [] frequency = new int [arr1.length];
        int taken = -1;
        for(int i = 0; i < arr1.length; i++){
            int count = 1;
            for(int j = i+1; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    count++;
                    frequency[j] = taken;
                }
            }
            if(frequency[i] != taken)
                frequency[i] = count;

        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] != taken)
                System.out.println(arr1[i] +" "+ frequency[i]);
        }

    }
}
