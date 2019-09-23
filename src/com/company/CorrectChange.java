package com.company;

import java.util.Scanner;

public class CorrectChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a whole number of cents: ");
        int input=scan.nextInt();
        int dollars=input/100;
        int rest_of_dollars=input%100;
        int quarters=25;
        int rest_of_quarters=input%25;
        int dimes=10;
        int rest_of_dimes=input%10;
        int nickels=5;
        int rest_of_nickels=input%5;
        int pennies=1;
        int rest_of_pennies=input%1;
        System.out.print("You have "+dollars+" dollars, ");

    }
}
