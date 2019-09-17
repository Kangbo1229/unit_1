package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of length");
        int length = scan.nextInt();
        System.out.println("Enter the number of width");
        int width = scan.nextInt();
        int area = length * width;
        System.out.println("Area=" + area);
    }
}