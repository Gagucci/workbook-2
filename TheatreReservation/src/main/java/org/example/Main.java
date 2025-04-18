package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
        public static Scanner read = new Scanner(System.in);
        static String fullName;
        static int numberOfTickets;
    public static void main(String[] args) {


//        String birthday = "2000-03-22";//iso standard
//
//        String friendsBirthDay = "22-03-2000";//not iso standard
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        LocalDate realBirthday  = LocalDate.parse(birthday);
//        LocalDate friendsBirthday  = LocalDate.parse(friendsBirthDay,formatter);
        // prompt user for input
        System.out.println("Welcome to the Theatre Ticket Reservation App!\n Please enter your first and last name: ");
        fullName = read.nextLine();
        System.out.println("Hello " + fullName + "!, how many tickets would you like to reserve?");
        numberOfTickets = read.nextInt();
        read.nextLine();

        DateTimeFormatter formatArrivalDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("What date will you be arriving? (Format: MM-DD-yyyy)");
        String arrivalDate = read.nextLine();
        LocalDate arrival = LocalDate.parse(arrivalDate,formatArrivalDate);
        System.out.println("Your arrival date is: " + arrival);

        String[] splitName = fullName.split(" ");
        String firstName = splitName[0].trim();
        String lastName = splitName[1].trim();

        if (numberOfTickets == 1){
            System.out.println("You have " + numberOfTickets + " ticket reserved for " + arrival + " under " + lastName + "," + firstName);
        }


    }
}