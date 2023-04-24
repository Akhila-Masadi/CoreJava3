package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Collections.min;

public class MinOfList {
//    Create an ArrayList of Integers - 25, 60, 137, 48, 3, 90
//    a. Write logic to findout the minimum of the list
//    b. Write logic to findout the sum of all the numbers in the list
//    c. Write logic to print the even numbers and odd numbers separately from the above list
//    public static int sum(List<Integer> intlist){
//        int sum=0;
//        intlist.forEach(ele-> {
//
//        });
//        for(int i=0;i< intlist.size();i++){
//            sum= sum+intlist.get(i);
//    }
//    return sum;
//    }
    public static List evenAndOdd(List<Integer> intlist) {
        List evenList = new ArrayList<Integer>();
        List oddList = new ArrayList<Integer>();
        List combinedArray = new ArrayList<Integer>();
        for (int i = 0; i < intlist.size(); i++) {
            if (intlist.get(i) % 2 == 0) {
                evenList.add(intlist.get(i));
            }
            else {
                oddList.add(intlist.get(i));
            }
        }
               combinedArray.add(0,evenList);
               combinedArray.add(1,oddList);
        return combinedArray;

    }

    public static void main(String[] args) {
        List intlist = new ArrayList<Integer>();
        intlist.add(25);
        intlist.add(60);
        intlist.add(137);
        intlist.add(48);
        intlist.add(3);
        intlist.add(90);
        intlist.forEach(ele-> System.out.println(ele));
        System.out.println("Minimum of List::"+min(intlist));
//        intlist.stream().mapToInt(Integer);
//        System.out.println("Sum of List::"+sum(intlist));
        System.out.println("Even Numbers  ::"+(evenAndOdd(intlist).get(0)));
        System.out.println("Odd Numbers  ::"+(evenAndOdd(intlist).get(1)));
    }
}
