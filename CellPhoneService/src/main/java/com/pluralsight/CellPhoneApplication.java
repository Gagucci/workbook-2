package com.pluralsight;
import com.pluralsight.Cellphone;
import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner read = new Scanner(System.in);
    static Cellphone phoneOne = new Cellphone();
    static Cellphone phoneTwo = new Cellphone();

    public static void main(String[] args) {

        phoneTwo.setSerialNumber("123456789");
        phoneTwo.setModel("iPhone 14");
        phoneTwo.setCarrier("Verizon");
        phoneTwo.setPhoneNumber("123-456-7890");
        phoneTwo.setOwnerName("John Pork");

        System.out.println("Welcome to the Cellphone Database App!\n Please enter the following information: ");

        System.out.println("Serial Number: ");
        phoneOne.setSerialNumber(read.nextLine());
        System.out.println("Model: ");
        phoneOne.setModel(read.nextLine());
        System.out.println("Carrier: ");
        phoneOne.setCarrier(read.nextLine());
        System.out.println("Phone Number: ");
        phoneOne.setPhoneNumber(read.nextLine());
        System.out.println("Owner Name: ");
        phoneOne.setOwnerName(read.nextLine());

        //System.out.println(phoneOne.getSerialNumber() + "\n" + phoneOne.getModel() + "\n" + phoneOne.getCarrier() + "\n" + phoneOne.getPhoneNumber() + "\n" + phoneOne.getOwnerName());
        display(phoneOne);
        display(phoneTwo);

        phoneTwo.dial(phoneOne.getPhoneNumber());
        phoneOne.dial(phoneTwo.getPhoneNumber());

    }

    public static void display(Cellphone _phone) {
        System.out.println("Serial Number: " + _phone.getSerialNumber());
        System.out.println("Model: " + _phone.getModel());
        System.out.println("Carrier: " + _phone.getCarrier());
        System.out.println("Phone Number: " + _phone.getPhoneNumber());
        System.out.println("Owner Name: " + _phone.getOwnerName());
    }
}
