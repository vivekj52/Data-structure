package com;

public class Test {

    public static void main(String args[]){

        Stack stack = new Stack(10);
        stack.push((char) 123);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
