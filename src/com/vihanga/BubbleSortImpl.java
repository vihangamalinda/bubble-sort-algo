package com.vihanga;

import java.util.Arrays;

public class BubbleSortImpl {
    public static void main(String[] args) {
        int [] arr = {14,-50,10,-7,55,100,-1000};

        for(int lastUnsortedIndex = arr.length-1;lastUnsortedIndex >0;lastUnsortedIndex--){
            for(int i =0; i<lastUnsortedIndex;i++){
                if(arr[i]>arr[i+1]){
                    swapElement(i,i+1,arr);
                }

            }

        }

        for (int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void swapElement(int i , int j ,int [] arr){
        if(arr[i]==arr[j]){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
