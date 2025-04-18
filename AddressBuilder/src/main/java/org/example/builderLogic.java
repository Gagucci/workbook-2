package org.example;
import java.util.Scanner;

public class builderLogic {
    Scanner read = new Scanner(System.in);
    private String fullName;
    private String businessStreet, businessCity, businessState, businessZip;
    private String shippingStreet, shippingCity, shippingState, shippingZip;


    public void getFullName() {
        System.out.println("Enter your full name: ");
        fullName = read.nextLine();
        System.out.println("Hello " + fullName);
    }


    public void promptBusiness() {

        System.out.println("Please enter the following: ");
        System.out.println("Business Street Address: ");
        businessStreet = read.nextLine();
        if (businessStreet.isEmpty()) {
            System.out.println("Street address cannot be empty.");
            return;
        }

        System.out.println("Business City: ");
        businessCity = read.nextLine();
        if (businessCity.isEmpty()) {
            System.out.println("City cannot be empty.");
            return;
        }

        System.out.println("Business State: ");
        businessState = read.nextLine();
        if (businessState.isEmpty()) {
            System.out.println("State cannot be empty.");
            return;
        }

        System.out.println("Business Zip Code: ");
        businessZip = read.nextLine();
        if (businessZip.isEmpty()) {
            System.out.println("Zip code cannot be empty.");
        }

    }

    public void promptShipping() {

        System.out.println("Please enter the following: ");
        System.out.println("Shipping Street Address: ");
        shippingStreet = read.nextLine();
        if (shippingStreet.isEmpty()) {
            System.out.println("Street address cannot be empty.");
            return;
        }

        System.out.println("Shipping City: ");
        shippingCity = read.nextLine();
        if (shippingCity.isEmpty()) {
            System.out.println("City cannot be empty.");
            return;
        }

        System.out.println("Shipping State: ");
        shippingState = read.nextLine();
        if (shippingState.isEmpty()) {
            System.out.println("State cannot be empty.");
            return;
        }

        System.out.println("Shipping Zip Code: ");
        shippingZip = read.nextLine();
        if (shippingZip.isEmpty()) {
            System.out.println("Zip code cannot be empty.");
        }

    }

    public void displayName(){
        System.out.println(fullName);
    }

    public void businessBuilder() {
        // Creates a StringBuilder object to store the business address
        StringBuilder businessAddress = new StringBuilder();

        // Appends the address components to the StringBuilder
        businessAddress.append("\n" + businessStreet);
        businessAddress.append("\n" + businessCity + "," + businessState + " " + businessZip);
        String businessAddressString = businessAddress.toString();
        System.out.println("Business Address: " + businessAddressString);

    }

    public void shippingBuilder() {

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append("\n" + shippingStreet);
        shippingAddress.append("\n" + shippingCity + "," + shippingState + " " + shippingZip);
        String shippingAddressString = shippingAddress.toString();
        System.out.println("Shipping Address: " + shippingAddressString);
    }

    public void runProgram() {
        getFullName();
        promptBusiness();
        promptShipping();
        displayName();
        businessBuilder();
        shippingBuilder();

    }

}
