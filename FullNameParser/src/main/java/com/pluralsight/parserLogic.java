package com.pluralsight;
import java.util.Scanner;

public class parserLogic {

    static Scanner read = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String middleName;
    static String fullName;
// prompts user for their full name
    public static void promptUser() {
        System.out.println(
                "Welcome to the Name Parser App!" +
                "\nPlease enter your full name in one of the following formats." +
                "\n---Formats---" +
                "\n first-name middle-name last-name" +
                "\n first-name last-name");
        fullName = read.nextLine();
    }
// parses full name into an array of strings, separated at the spaces into first, middle and last names.
    public static void parseFullName() {
        String[] parsedName = fullName.split(" ");
        firstName = parsedName[0];
        middleName = parsedName.length > 2 ? parsedName[1] : "";
        lastName = parsedName[parsedName.length - 1];
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }

}

