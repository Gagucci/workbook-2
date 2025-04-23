package org.example;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle( long _vehicleId, String _makeModel, String _color, int _odometerReading, float _price ) {
        this.vehicleId = _vehicleId;
        this.makeModel = _makeModel;
        this.color = _color;
        this.odometerReading = _odometerReading;
        this.price = _price;
    }

    public long getVehicleId() { return vehicleId; }
    public String getMakeModel() { return makeModel; }
    public String getColor() { return color; }
    public int getOdometerReading() { return odometerReading; }
    public float getPrice() { return price; }

    public void setVehicleId(long vehicleId) { this.vehicleId = vehicleId; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    public void setColor(String color) { this.color = color; }
    public void setOdometerReading(int odometerReading) { this.odometerReading = odometerReading; }
    public void setPrice(float price) { this.price = price; }

    public void showDetails(){
        System.out.printf("~~~~~~~~~~~~~~~~~\nVID: %d\nMake/Model: %s\nColor: %s\nOdometer Reading: %d\nPrice: $%f\n~~~~~~~~~~~~~~~~~\n",
                this.vehicleId,this.makeModel,this.color,this.odometerReading,this.price);
    }







}
