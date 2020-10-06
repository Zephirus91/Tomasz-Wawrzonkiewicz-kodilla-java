package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error !");
        }

        Calculator calculator = new Calculator(24, 28);

        Integer sum = calculator.add();
        Integer subs = calculator.substract();

        System.out.println("\n Testing calculator \n");

        if (sum.equals(sum) & subs.equals(subs)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error !");
        }
    }
}