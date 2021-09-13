/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner input = new Scanner(System.in);
        float amount = input.nextFloat();

        System.out.println("What is the state?");
        input = new Scanner(System.in);
        String state = input.nextLine();

        if ("WI".equals(state)) {
            float tax = (float) 0.055 * amount;

            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\n", amount, tax);

            amount += tax;
        }

        System.out.printf("The total is $%.2f.", amount);
    }
}
