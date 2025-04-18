package com.pluralsight;
import com.pluralsight.Cellphone;
import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Cellphone phoneOne = new Cellphone();
        System.out.println("Welcome to the Cellphone Database App!\n Please enter the following information: ");

        System.out.println("Serial Number: ");
        phoneOne.setSerialNumber(read.nextLine());
        System.out.println("Model: ");
        phoneOne.setModel(read.nextLine());
        System.out.println("Carrier: ");
        phoneOne.setCarrier(read.nextLine());
        System.out.println("Phone Number: ");
        phoneOne.setPhoneNumber(read.nextLine());

        System.out.println(phoneOne.getSerialNumber() + "\n" + phoneOne.getModel() + "\n" + phoneOne.getCarrier() + "\n" + phoneOne.getPhoneNumber());

    }
}
