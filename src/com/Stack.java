package com;

public class Stack {

    private char arr[];
    private int tos;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.arr = new char[size];
        this.tos = -1;
    }

    public boolean push(char item){
        if (isFull())
            return false;
        else
            arr[++tos] = item;
        return true;
    }

    public char pop(){
        if (isEmpty())
            return (char) -1;
        else
            return arr[tos--];
    }

    public boolean isEmpty(){
        if (tos == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (tos == size-1)
            return true;
        else
            return false;
    }
}
