//package org.example;
//import org.example.Client;
//
//public class Main {
//    public static void main(String[] args) {
//
//
//        Client[] clients = {
//                new Client("John","Pioneer","Pioneer","Pioneer@goomail.com","1234567890"),
//                new Client("Tim","Bank","Tim's Bank","Timbank@bank.com","0987654321"),
//                new Client("Martin","Apple","Apple","MartinApple@Mmail.com","1234567890")
//        };
//
//        showMenu(clients);
//
//        // Example of how to use the Client class
//
//        // Iterates over array of clients and prints out the first name, last name and business name of each client in the array.
//        for (Client client : clients) {
//            System.out.println("First Name: " + client.firstName);
//            System.out.println("Last Name: " + client.lastName);
//            System.out.println("Business Name: " + client.businessName);
//            System.out.println("Email Address: " + client.emailAddress);
//            System.out.println("Phone Number: " + client.phoneNumber);
//            System.out.println();
//        }
//
//        int clientList = clients.length;
//
//        for (int i = 0; i < clientList ; i++) {
//            String formattedname = clients[i].getFormattedName();
//            System.out.println(formattedname);
//        }
//
//        for (int i = 0; i < clientList ; i++) {
//            String formattedName = clients[i].getFormattedName();
//            System.out.println("Client " + (i+1) + ": " + formattedName + " " + clients[i].displayEmail());
//        }
//
//        // Use a for loop to print each client's email
//        for (int i = 0; i < clients.length; i++) {
//            clients[i].printEmail(); //  call the method on each object
//        }
//
//    }
//}
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  Step 1: Create an array of Client objects
        // Arrays are fixed-size collections; each element is a Client
        Client[] clients = {
                new Client("Sarah", "Lee", "QuickBooks", "sarah.quickbooks.com", "+31612345678"),
                new Client("Tom", "Holland", "LedgerWorks", "tom@ledgerworks.com", "+31698765432"),
                new Client("Ava", "Nguyen", "BalancePro", "ava@balancepro.com", "+31600001111")
        };

        // Step 2: Show the menu and handle the user's choice
        showMenu(clients);
    }

    /**
     * 🖥️ Displays a simple menu and processes the user's selection.
     * This method separates the input logic from the main logic.
     */
    public static void showMenu(Client[] clients) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("1. Show all business names");
        System.out.println("2. Show all email addresses");
        System.out.print("> "); // Prompt the user

        int choice = scanner.nextInt(); // Read user input
        System.out.println(); // Add a blank line for spacing

        // Use switch to handle menu options more cleanly than if/else
        switch (choice) {
            case 1:
                showBusinessNames(clients);
                break;
            case 2:
                showEmailAddresses(clients);
                break;
            default:
                System.out.println("❌ Invalid option. Please choose 1 or 2.");
        }

        scanner.close(); // Always close your scanner when you're done
    }

    /**
     *  Prints the business names of all registered clients.
     * Uses a for loop with index to access each client in the array.
     */
    public static void showBusinessNames(Client[] clients) {
        System.out.println("📋 Registered Businesses:");
        for (int i = 0; i < clients.length; i++) {
            // Print the formatted name (defined in the Client class)
            System.out.println(i + ". " + clients[i].getFormattedName());
        }
    }

    /**
     * Prints the email addresses of all clients.
     * Uses a for-each loop to make the code more readable.
     */
    public static void showEmailAddresses(Client[] clients) {
        System.out.println("📧 Client Email Addresses:");
        for (Client client : clients) {
            // This method is defined inside the Client class
            client.printEmail();
        }
    }
}