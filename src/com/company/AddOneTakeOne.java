package com.company;

import java.util.Scanner;

public class AddOneTakeOne {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int value1=scan.nextInt();
        int value2=value1--;
        int value3=value2++;
        System.out.print(value1+" "+value3+" "+value2);

    }
}
