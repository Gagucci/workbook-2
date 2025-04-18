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
        System.out.println("Street Address: ");
        businessStreet = read.nextLine();
        if (businessStreet.isEmpty()) {
            System.out.println("Street address cannot be empty.");
            return;
        }

        System.out.println("City: ");
        businessCity = read.nextLine();
        if (businessCity.isEmpty()) {
            System.out.println("City cannot be empty.");
            return;
        }

        System.out.println("State: ");
        businessState = read.nextLine();
        if (businessState.isEmpty()) {
            System.out.println("State cannot be empty.");
            return;
        }

        System.out.println("Zip Code: ");
        businessZip = read.nextLine();
        if (businessZip.isEmpty()) {
            System.out.println("Zip code cannot be empty.");
            return;
        }

        // Prints the complete business address
        String businessAddressString = businessAddress.toString();
        System.out.println("Business Address: " + businessAddressString);

    }

    public void businessBuilder() {
        // Creates a StringBuilder object to store the business address
        StringBuilder businessAddress = new StringBuilder();

        // Appends the address components to the StringBuilder
        businessAddress.append("\nBusiness Street : " + businessStreet );
        businessAddress.append("\nBusiness City : " + businessCity);
        businessAddress.append("\nBusiness State : " + businessState);
        businessAddress.append("\nBusiness Zip : " + businessZip);

    }

}
