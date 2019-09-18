package com.company;

import java.util.Scanner;

public class FindTheAverage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double total=0;
        System.out.println("Enter four values.");
        System.out.print("Value 1: ");
        double value=scan.nextDouble();
        total+= value;
        System.out.print("Value 2: ");
        double value2=scan.nextDouble();
        total+= value2;
        System.out.print("Value 3: ");
        double value3=scan.nextDouble();
        total+= value3;
        System.out.print("Value 4: ");
        double value4=scan.nextDouble();
        total+= value4;
        System.out.print("Average= "+(total/4.0));

    }
}
