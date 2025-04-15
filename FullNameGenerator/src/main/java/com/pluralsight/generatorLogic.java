package com.pluralsight;
import java.util.Scanner;

public class generatorLogic {

    static Scanner read = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String middleName;
    static String suffix;
    static String fullName;

    static boolean hasMiddleName;
    static boolean hasSuffix;

    public static void promptUser() {

        System.out.println("Welcome to the Full Name Generator!\nPlease enter your first name:");
        firstName = read.nextLine();
        firstName = firstName.trim();
        System.out.println("If you have a middle name please enter it\nOtherwise leave blank and hit Enter");
        middleName = read.nextLine();
        middleName = middleName.trim();
        System.out.println("Please enter your last name:");
        lastName = read.nextLine();
        lastName = lastName.trim();
        System.out.println("If your name contains a suffix please enter it\nIf not leave field blank and press Enter");
        suffix = read.nextLine();
        suffix = suffix.trim();
    }

    public static void middleTrim() {
        int length = middleName.length();
        if  (length == 0) {
            middleName = middleName.trim();
            hasMiddleName = false;
        } else {
            hasMiddleName = true;
        }
    }

    public static void suffixTrim() {
        int length = suffix.length();
        if  (length == 0) {
            suffix = suffix.trim();
            hasSuffix = false;
        } else {
            hasSuffix = true;
        }
    }

    public static void nameGen() {
        if (hasMiddleName && hasSuffix) {
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
            System.out.println("Your full name is: " + fullName);
        } else if (hasMiddleName && !hasSuffix) {
            fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Your full name is: " + fullName);
        } else if (!hasMiddleName && hasSuffix) {
            fullName = firstName + " " + lastName + " " +  suffix;
            System.out.println("Your full name is: " + fullName);
        } else {
            fullName = firstName + " " + lastName;
            System.out.println("Your full name is: " + fullName);
        }


    }

}
