package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args){
// prompt for full name
// System.out.print("Full Name:");
// String fullName = scanner.nextLine();
        System.out.print("Please enter first name:");
        String firstName =scanner.nextLine();

        System.out.print("Please enter last name:");
        String lastName =scanner.nextLine();

// prompt for date when they would like to watch the show
        System.out.print("What date will you be coming (MM/dd/yyyy:)");
        String date = scanner.nextLine();
// prompt for the amount of tickets reserved
        System.out.print("How many tickets would you like?:");
        int tickets = scanner.nextInt();


        String fullName;
        fullName = lastName + "," + firstName;
        System.out.println();
        System.out.println(tickets + " tickets reserved for " + date + " under" + " " +fullName);














    }
}
