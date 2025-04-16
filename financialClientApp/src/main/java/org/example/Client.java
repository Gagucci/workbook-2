//package org.example;
//import java.util.Scanner;
//
//Must-Have Features (Core Functional Requirements)
//1. Register a client (firstname, lastname, bsuinessname, e-mailadress and phonenumbers
//        2. View clients (display a list of all registered clients)
//Format the clients name like this: Lastname, Firstname and initials.
//3.  Save the data -> Store client data in a text file / csv file (which is normally a SQL database)
//public class Client {
//    static public String firstName;
//    static public String lastName;
//    static public String businessName;
//    static public String emailAddress;
//    static public String phoneNumber;
//    static Scanner read = new Scanner(System.in);
//
//    // Constructor
//    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.businessName = businessName;
//        this.emailAddress = email;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public static String showBusinessNames() {
//        return businessName;
//    }
//
//    public String getFormattedName() {
//        return String.format("%s, %s %s.", lastName, firstName, firstName.charAt(0));
//    }
//
//    public String displayEmail() {
//        return String.format("Email: %s", emailAddress);
//    }
//
//    public void printEmail() {
//        System.out.println("Email: " + this.emailAddress); // not required here, but improves clarity
//    }
//
//    public static void showMenu(Client[] clients) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What would you like to do?");
//        System.out.println("1. Show all business names");
//        System.out.println("2. Show all email addresses");
//        System.out.print("> "); // Prompt the user
//
//        int choice = scanner.nextInt(); // Read user input
//        System.out.println(); // Add a blank line for spacing
//
//        // Use switch to handle menu options more cleanly than if/else
//        switch (choice) {
//            case 1:
//                showBusinessNames(clients);
//                break;
//            case 2:
//
//
//        }
//    }
//}
package org.example;

public class Client {

    // Storing information like. firstname, lastname



    public String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phoneNumber;

    // Constructor
    // its to design and create new Clients where we must provide this information
    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //
    public String getFormattedName() {
        return String.format("%s, %s %s.", this.lastName, this.firstName, this.firstName.charAt(0));
    }

    public void printEmail() {
        System.out.println("Email: " + this.email);
    }
}