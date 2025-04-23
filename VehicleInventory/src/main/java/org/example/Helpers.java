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

    public static void addVehicle(Vehicle[] fullInventory) {
        long vehicleId = -1;

        for (int i = 0; i < fullInventory.length; i++) {
            if (fullInventory[i] == null) {
                vehicleId = i + 1; // Assuming vehicleId starts from 1
                break;
            }
        }

        if (vehicleId == -1) {
            System.out.println("Inventory is full. Cannot add more vehicles.");
            return;
        }

        System.out.println("Enter the make and model:");
        String makeModel = read.nextLine();

        System.out.println("Enter the color:");
        String color = read.nextLine();

        System.out.println("Enter the odometer reading:");
        int odometerReading = read.nextInt();

        System.out.println("Enter the price:");
        float price = read.nextFloat();

        Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        fullInventory[(int) vehicleId - 1] = newVehicle;
    }

}
