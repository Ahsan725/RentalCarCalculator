package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        String pickupDate;
        int numDays;
        boolean electronicTag;
        boolean GPS;
        boolean roadsideAssistance;
        int age;
        double basicCarRental = 29.99;
        double optionsCost;
        double underageDriverSurcharge;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the data you need the car?");
        pickupDate = scanner.nextLine();

        System.out.println("How many days do you need the car for?");
        scanner.nextLine();
        numDays = scanner.nextInt();

        System.out.println("Would you like an electronic toll tag?");


    }
}
