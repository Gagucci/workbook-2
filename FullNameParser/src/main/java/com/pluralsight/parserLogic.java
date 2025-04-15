package com.pluralsight;
import java.util.Scanner;

public class parserLogic {
    static String firstName;
    static String lastName;
    static String middleName;
    static String fullName;

    public static void promptUser() {
        System.out.println(
                "Welcome to the Name Parser App!" +
                "\nPlease enter your full name in one of the following formats." +
                "\n---Formats---" +
                "\n first-name middle-name last-name" +
                "\n first-name last-name");
    }

}
