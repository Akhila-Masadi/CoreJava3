package com.examples.oops;

public  class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator() {
        this.secondNumber=2.3;
        this.firstNumber=2.4;
    }

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public  double add(){
        return 0;
    }

    public double add(double thirdNumber){
        return firstNumber+secondNumber+thirdNumber;

    }
    private double subtract(){
        return firstNumber-secondNumber;

    }
    public double multiply(){
        return firstNumber*secondNumber;

    }
    public double divide(){
        return firstNumber/secondNumber;

    }

}


