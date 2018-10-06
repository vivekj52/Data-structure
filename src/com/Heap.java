package com;

import java.util.Arrays;

public class Heap {

    private int capacity;
    private int heapArr[];
    private int heapSize;

    //Constructor
    public Heap() {
        capacity = 10;
        heapArr = new int[capacity];
        heapSize = 0;
    }

    private int getLeftChildIndex(int i){
        return (2*i)+1;
    }

    private int getRightChildIndex(int i){
        return (2*i)+2;
    }

    private int getParentIndex(int i){
        return (i-1)/2;
    }

    private boolean hasLeftChild(int i){
        return getLeftChildIndex(i) < heapSize;
    }

    private boolean hasRightChild(int i){
        return getRightChildIndex(i) < heapSize;
    }

    private boolean hasParent(int i){
        return getParentIndex(i) >= 0;
    }

    private int getLeftChild(int i){
        return heapArr[getLeftChildIndex(i)];
    }

    private int getRightChild(int i){
        return heapArr[getRightChildIndex(i)];
    }

    private int getParent(int i){
        return heapArr[getParentIndex(i)];
    }

    private void swap(int i, int j){
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }

    private void ensureOverflow(){
        if (heapSize == capacity){
            heapArr = Arrays.copyOf(heapArr, capacity * 2);
            capacity *= 2;
        }
    }

    public void minHeapify(int i){
        int l = getLeftChildIndex(i);
        int r = getRightChildIndex(i);

        int smallest = i;

        if (hasLeftChild(i) && getLeftChild(i) < heapArr[i])
            smallest = l;
        if (hasRightChild(i) && getRightChild(i) < heapArr[smallest])
            smallest = r;

        if (smallest != i){
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    public void insertKey(int item){
        ensureOverflow();
        heapArr[heapSize] = item;

        heapSize++;

        int i = heapSize - 1;
        while (hasParent(i) && getParent(i) > heapArr[i]){
            swap(i, getParentIndex(i));
            i = getParentIndex(i);
        }
    }

    public int extractKey(){
        if (heapSize <= 0)
            return Integer.MIN_VALUE;

        int item = heapArr[0];
        heapArr[0] = heapArr[heapSize-1];
        heapSize--;
        minHeapify(0);

        return item;
    }

    //Driver program
    public static void main(String args[]){

        Heap heap = new Heap();
        heap.insertKey(10);
        heap.insertKey(15);
        heap.insertKey(20);
        heap.insertKey(17);
        heap.insertKey(25);

        heap.extractKey();

        for (int i = 0; i < heap.heapSize; i++)
            System.out.println(heap.heapArr[i]+" ");
    }


}
