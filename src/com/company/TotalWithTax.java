package com.company;

import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of price");
        final double TAXRATE=0.0825;
        double price = scan.nextDouble();
        double tax=price*TAXRATE;
        double totalcost=price +tax;
        System.out.println("Price: $"+price);
        System.out.println("Sales Tax: $"+tax);
        System.out.println("Total: $"+totalcost);
    }
}
