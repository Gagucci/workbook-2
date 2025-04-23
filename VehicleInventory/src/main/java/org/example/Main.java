package org.example;

import java.util.Scanner;

public class Main {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        Vehicle[] fullInventory = new Vehicle[20];

        fullInventory[0] = new Vehicle(1, "Toyota Supra", "Blue", 50000, 20000);
        fullInventory[1] = new Vehicle(2, "Honda S2000", "Red", 30000, 22000);
        fullInventory[2] = new Vehicle(3, "Ford Focus", "Black", 40000, 18000);
        fullInventory[3] = new Vehicle(4, "Chevrolet Malibu", "White", 60000, 21000);
        fullInventory[4] = new Vehicle(5, "Nissan Altima", "Silver", 70000, 23000);
        fullInventory[5] = new Vehicle(6, "Nissan 370Z", "Yellow", 80000, 25000);

        while(true) {
            System.out.println("Welcome to the Vehicle Inventory System");
            System.out.println("1. Show All Vehicles");
            System.out.println("2. Search Vehicles by Make and Model");
            System.out.println("3. Search Vehicles by Price Range");
            System.out.println("4. Search Vehicles by Color");
            System.out.println("5. Add a Vehicle");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1 - 6):\n> ");

            int choice = read.nextInt();
            read.nextLine();
            switch (choice) {
                case 1:
                // list all vehicles
                    Helpers.showAllVehicles(fullInventory);
                    break;
                case 2:
                // search vehicles by make and model
                    Helpers.searchByMake(fullInventory);
                    break;
                case 3:
                // search vehicles by price range
                    break;
                case 4:
                // search vehicles by color
                    break;
                case 5:
                // add a vehicle
                case 6:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }



    }
}