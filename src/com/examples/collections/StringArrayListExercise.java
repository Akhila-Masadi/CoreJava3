package com.examples.collections;

import java.util.*;
import static java.util.Collections.max;

public class StringArrayListExercise {
//2. Create an ArrayList of Strings - "JAVA", "SPRING", "GIT", "MAVEN", "POSTGRESQL", "MONGODB"
//    a. Write logic to finout the string with highest size
//    b. Write logic to print the number of Vowels in each string
//

    public static void main(String[] args) {
        List stringArrayList = new ArrayList<String >();
        stringArrayList.add("JAVA");
        stringArrayList.add("SPRING");
        stringArrayList.add("GIT");
        stringArrayList.add("MAVEN");
        stringArrayList.add("POSTGRESQL");
        stringArrayList.add("MONGODB");

        for(int i=0;i<stringArrayList.size();i++){
            int count =0;
            for(int j=0;j<stringArrayList.get(i).toString().length();j++){
                if(stringArrayList.get(i).toString().charAt(j)=='A'
                        ||stringArrayList.get(i).toString().charAt(j)=='E'
                        ||stringArrayList.get(i).toString().charAt(j)=='I'
                        ||stringArrayList.get(i).toString().charAt(j)=='O'
                        ||stringArrayList.get(i).toString().charAt(j)=='U'){
                    count++;
                }
            }
            Map countmap = new HashMap<String,Integer>();
            countmap.put(stringArrayList.get(i),count);
            System.out.println(countmap);
        }

        List<Integer> highestNum =stringArrayList.stream()
                .map(ele->ele.toString().length())
                .toList();


        System.out.println("Highest length of Strings::"+max(highestNum));

    }
}
