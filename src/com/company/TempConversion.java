package com.company;

import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the temperature in Fahrenheit");
        double Fahrenheit = scan.nextInt();
        double Celsius=(Fahrenheit-32)*5/9.0;
        System.out.println(Fahrenheit+"°F = "+Celsius+"°C");
    }
}
