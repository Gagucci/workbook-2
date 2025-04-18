package com.pluralsight;

public class Cellphone {
    private String serialNumber;
    private String model;
    private String carrier;
    private String PhoneNumber;
    private String ownerName;


    public Cellphone() {
        serialNumber = "0";
        model = "";
        carrier = "";
        PhoneNumber = "";
        ownerName = "";

    }
    // accepts a phone number parameter and displays the message "owner's phone is calling phone-parameter"
    public void dial(String _phoneNumber) {
        System.out.println( this.ownerName + " is calling " + _phoneNumber);

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


}
