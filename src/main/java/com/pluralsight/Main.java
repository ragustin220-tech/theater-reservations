package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args){
// prompt for full name
 System.out.print("Full Name:");
 String fullName = scanner.nextLine();
//        System.out.print("Please enter first name:");
//        String firstName =scanner.nextLine();

//        System.out.print("Please enter last name:");
//        String lastName =scanner.nextLine();


// full name will be separated in two parts one first name and one last name
        String[]nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
//format name from last displayed first then first displayed last 
        String formatName = lastName + ", " + firstName;

// prompt for date when they would like to watch the show
        System.out.print("What date will you be coming (MM/dd/yyyy:)");
        String date = scanner.nextLine();
//using formater in examples when input in date is formated it will show as yyyy/dd/MM
        String userInput;
        DateTimeFormatter formatter;
        userInput = date;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date1 = LocalDate.parse(userInput, formatter);

// prompt for the amount of tickets reserved
        System.out.print("How many tickets would you like?:");
        int tickets = scanner.nextInt();

        String ticketamount = "";
// if ticket equals 1 ticket will be printed if not then tickets will be printed
        if (tickets == 1){
         ticketamount = "ticket";
        }else {
            ticketamount = "tickets";
        }


 //       String fullName;
 //       fullName = lastName + "," + firstName;

// print out line then format of how ticket will be viewed when inputs have been made.
        System.out.println();
        System.out.print( tickets + " "+ ticketamount + " reserved for " + date1 + " under" + " " + formatName);

    }
}
