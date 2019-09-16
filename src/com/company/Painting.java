package com.company;

public class Painting {

    public static void main(String[] args) {
        final int AREA_PER_GALLON=350;
        int length=40;
        int width=32;
        int height=16;
        int area_of_door=20;
        int area_of_window=15;
        int number_of_doors=2;
        int number_of_windows=4;
        double total_surface_area= length*height*2+width*height*2+length*width - area_of_door*number_of_doors - area_of_window*number_of_windows;
        double total_gallon=total_surface_area/AREA_PER_GALLON;
        System.out.println("You will need "+total_gallon+" gallons of paint");

    }
}
