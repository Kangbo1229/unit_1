package com.company;

import java.util.Scanner;

public class PoundsToKilograms {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight in pounds");
        double ibs = scan.nextInt();
        double kg=ibs/2.205;
        System.out.print(ibs+" pounds = "+kg+" kilograms");



    }
}
