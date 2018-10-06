package com;

public class Subsequence {

    public static void main(String args[]){
        String s = "abcd";
        long starttime = System.nanoTime();
        for (String i:new Subsequence().subsequences(s)
             ) {
            System.out.println(i);
        }
        long endtime= System.nanoTime();
        System.out.println("Total time is----------------"+(endtime-starttime));
        //System.out.println(new Subsequence().subsequences(s).length);
    }

    public String[] subsequences(String s){
        int length = s.length();
        int no_of_subsequences = (int)Math.pow(2,length);
        String subsequences[] = new String[no_of_subsequences];
        for(int counter = 0; counter < no_of_subsequences; counter++) {
            String temp = new String();
            for (int j = 0; j < length; j++) {
                if ((counter & (1 << j)) > 0) {
                    temp += s.charAt(j);
                }
            }
            subsequences[counter] = temp;
        }
        return subsequences;
    }
}
