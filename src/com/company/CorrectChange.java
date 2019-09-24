package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a whole number of cents: ");
        int input=scan.nextInt();
        int dollars=input/100;
        int rest_of_dollars=input%100;
        int quarters=rest_of_dollars/25;
        int rest_of_quarters=rest_of_dollars%25;
        int dimes=rest_of_quarters/10;
        int rest_of_dimes=rest_of_quarters%10;
        int nickels=rest_of_dimes/5;
        int rest_of_nickels=rest_of_dimes%5;
        int pennies=rest_of_nickels/1;
        int rest_of_pennies=rest_of_nickels%1;
        int total=rest_of_pennies;
        System.out.print("You have "+dollars+" dollars, "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies.");

    }
}
