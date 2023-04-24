package com.examples.oops;

public class SyntificCalculator extends Calculator{
    private double degree;

    public SyntificCalculator( ) {
        this.degree = 0;
    }
    public SyntificCalculator(double degree) {
        this.degree = degree;
    }


    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }


    public double sin(){
        return Math.sin(degree);

    }

    public double cos()
    {
        return Math.cos(degree);
    }
    public double tan(){
        return Math.tan(degree);
    }
    public double divide(){
        if(getSecondNumber()==0){
            System.out.println("Divide by zero not applicalble");
            return 0;
        }
        return getFirstNumber()/getSecondNumber();

    }
}
