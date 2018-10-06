package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String args[]){

        Set<String> hash_set = new HashSet<String>();
        hash_set.add("a");
        hash_set.add("b");
        hash_set.add("c");
        hash_set.add("d");

        System.out.println("The set is :"+hash_set);
        System.out.println("Power set is :");

        Iterator iterator = SetDemo.generatePowerSet(hash_set).iterator();
        while (iterator.hasNext()){
            ArrayList<String> arr = (ArrayList<String>) iterator.next();
            for (int i = 0; i < arr.size(); i++)
                System.out.print(arr.get(i));
            System.out.println();
        }
    }

    public static Set<ArrayList<String>> generatePowerSet(Set<String> set){
        
        int set_size = set.size();
        long power_set_size = (int) Math.pow(2,set_size);

        String arr[] = new String[set_size];
        arr = set.toArray(arr);

        Set<ArrayList<String>> power_set = new HashSet<>();
        for (long counter = 0; counter < power_set_size; counter++){
            ArrayList<String> element = new ArrayList<String>();
            for (int j = 0; j < set_size; j++){
                if ((counter & (1 << j)) > 0){
                    element.add(arr[j]);
                }
            }
            power_set.add(element);
        }
        return power_set;
    }
}
