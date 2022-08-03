package com.sparta.ge;

//Code reviews - Code that already works
//1. What are you trying to do? Problem you are trying to solve?
//2. See how the code matches their solution?
//3. OOP + SOLID
//4. Code should be easy to understand and NOT USE COMMENTS

import java.util.Arrays;

public class BubbleSorter {

    public static void sortArray(int[] array){
        int n = array.length;
        int k; //use descriptive names for variables
        for(int m=n ; m>=0; m--){
            for(int i=0; i<n-1; i++){
                k = i + 1;
                if(array[i] > array[k]){
                    swap(array, k, i);
                }
            }
        }
    }

    private static void swap(int[] array, int k, int i){ //private methods cannot be tested
        int temp;
        temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }

    public static void main(String[] args) {
        //All data as immutable
        int[] data = {5, 1, 4,2, 8};
        sortArray(data);
        System.out.println(Arrays.toString(data));
    }
}
