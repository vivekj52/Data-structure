package com;

public class QuickSort {

    public static int[] quickSort(int arr[], int p, int r){

        if (p < r){
            int q = partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr, q+1, r);
        }

        return arr;
    }

    private static int partition(int arr[], int p, int r){

        int x = arr[r];
        int i = p-1;

        for (int j = p; j < r; j++){
            if (arr[j] <= x){
                i++;
                if (i != j)
                    swap(arr, i, j);
            }
        }
        swap(arr, i+1, r);
        return i+1;
    }

    private static void swap(int arr[], int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
