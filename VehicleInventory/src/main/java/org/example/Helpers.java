package org.example;

import java.util.Scanner;

public class Helpers {
    Scanner read = new Scanner(System.in);

    public static void showAllVehicles(Vehicle[] fullInventory) {
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : fullInventory) {
            if (vehicle != null) {
                vehicle.showDetails();
            }
        }
    }
}
