package org.example;

import java.util.Scanner;

public class Helpers {
    static Scanner read = new Scanner(System.in);

    public static void showAllVehicles(Vehicle[] fullInventory) {

        System.out.println("All Vehicles:");
        for (Vehicle vehicle : fullInventory) {
            if (vehicle != null) {
                vehicle.showDetails();
            }
        }
    }


    public static void searchByMake(Vehicle[] fullInventory) {
        System.out.println("Enter the make and model of the vehicle you want to search for:");
        String makeModel = read.nextLine();

        Vehicle[] results = new Vehicle[fullInventory.length];
        int resultIndex = 0;
        for (Vehicle vehicle : fullInventory) {
            if (vehicle != null && vehicle.getMakeModel().equalsIgnoreCase(makeModel)) {
                results[resultIndex++] = vehicle;
                vehicle.showDetails();
            }
        }
    }
}
