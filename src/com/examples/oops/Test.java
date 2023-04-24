package com.examples.oops;

import java.util.concurrent.Callable;

public class Test {

    public static void main(String[] args) {
//        Test t = new Test();
        Calculator calc = new Calculator(3.4,4.5);
//        calc.firstNumber = 3.8;
//        calc.secondNumber= 0;
        double addResult =calc.add();
        double powerResult = Math.pow(2,4);
        System.out.println(powerResult);

        SyntificCalculator sync = new SyntificCalculator(180);
        double sinResult = sync.sin();

        sync.setFirstNumber(1.5);
        sync.setSecondNumber(0);
        System.out.println(sync.divide());
        System.out.println("Test"+sinResult);



    }
}
