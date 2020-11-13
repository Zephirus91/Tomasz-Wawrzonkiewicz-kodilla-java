package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.99,1.4);
        } catch (Exception e) {
            System.out.println("Type x more or equal 1 and less than 2. Type y not equal 1.5");
        } finally {
            System.out.println("It was good work !!!");
        }
    }
}
