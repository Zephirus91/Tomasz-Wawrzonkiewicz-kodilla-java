package com.kodilla;

public class Calculator {
    private int numberA;
    private int numberB;

    Calculator (int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public int getSum() {
        return (numberA + numberB);
    }
    public int getSubstraction() {
        return (numberA - numberB);
    }
    public static void main (String args[]) {
        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.getSum());
        System.out.println(calculator.getSubstraction());
    }
}
