package com;

public class Test {

    public static void main(String args[]){

        /*Stack stack = new Stack(10);
        stack.push((char) 123);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());*/

        /*int a = 1024*1024;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));*/

        /*Heap heap;
        heap = new Heap();

        for (int i = 0; i < 10000000; i++){
            heap.insertKey((int) (Math.random()*10000000));
        }

        for (int i = 0; i < 10000000; i++){
            System.out.print(" "+heap.extractKey());
        }
*/

        int arr[] = new int[1000];

        for (int i = 0; i < 1000; i++){
            arr[i] = (int) (Math.random()*10000);
        }

        int sorted[] = QuickSort.quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < sorted.length; i++){
            System.out.print(" "+sorted[i]);
        }
    }
}
