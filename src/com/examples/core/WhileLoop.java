package com.examples.core;

public class WhileLoop {
    public static void main(String[] args) {
        int num=10;
        int remain=1;
        int sum=0;
        int sumfor=0;
        while(remain<=num)
        {
            sum = sum+remain;
            remain++;
        }
        for(int i=1;i<=10;i++)
        {
            sumfor=sumfor+i;
        }
        System.out.println(remain);
        System.out.println("For"+sumfor);
        System.out.println(sum);
    }
}
