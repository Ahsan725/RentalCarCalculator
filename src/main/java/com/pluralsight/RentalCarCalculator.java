package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        //I declared all my variables
        String pickupDate;
        int numDays;
        boolean electronicTag;
        boolean GPS;
        boolean roadsideAssistance;
        int age;
        double basicCarRental = 29.99;
        double optionsCost = 0;
        double underageDriverSurcharge = 1.3;
        double total = 0;
        double surcharge = 0;
        double baseTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the date you need the car?");
        pickupDate = scanner.nextLine();

        System.out.println("How many days do you need the car for?");
        numDays = scanner.nextInt();

        System.out.println("Would you like an electronic toll tag? Enter True or False");
        electronicTag = scanner.nextBoolean();
        if (electronicTag){
            total += 3.95 * numDays;
            optionsCost += 3.95 * numDays;
        }

        System.out.println("Would you like to add GPS?");
        GPS = scanner.nextBoolean();
        if (GPS){
            total += 2.95 * numDays;
            optionsCost += 2.95 * numDays;
        }

        System.out.println("Would you like roadside assistance? Enter True or False");
        roadsideAssistance = scanner.nextBoolean();
        if (roadsideAssistance){
            total += 3.95 * numDays;
            optionsCost += 3.95 * numDays;
        }

        System.out.println("What is your age?");
        age = scanner.nextInt();
        scanner.nextLine();

        baseTotal = basicCarRental * numDays;
        //calculations
        if (age < 25){
            surcharge = baseTotal * 0.30;
            //this is where we modify the total
            total += (basicCarRental * numDays) * underageDriverSurcharge;
        }else{
            total += (basicCarRental * numDays);
        }

        System.out.println("Success! You have booked the car for " + pickupDate + " for " + numDays + " days. Your total is: $" + total + " Your options cost is: $" + optionsCost);
        System.out.println("The base price is: " + baseTotal);
        System.out.println("The surcharge is: " + surcharge);
        System.out.println("The options costed: " + optionsCost);
        System.out.println("The final price is: " + total);
    }
}
