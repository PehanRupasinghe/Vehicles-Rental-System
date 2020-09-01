package sample;

public class Car extends Vehicle {
    private int noofSeats;
    private String airBags;
    private String airCondition;

    public Car(){
        super();

    }

    public Car( int noofSeats, String airBags, String airCondition){
        super();

        this.noofSeats = noofSeats;
        this.airBags = airBags;
        this.airCondition = airCondition;
    }

    public Car(String plateNumber,  String model, String make, String typeofTransmission, String rentable, int noofSeats, String airBags, String airCondition){

        this.plateNumber = plateNumber;
        this.model = model;
        this.make = make;
        this.typeofTransmission = typeofTransmission;
        this.rentable = rentable;
        this.noofSeats = noofSeats;
        this.airBags = airBags;
        this.airCondition = airCondition;
    }





    public void setNoofSeats(int noofSeats) {
        this.noofSeats = noofSeats;
    }

    public void setairBags(String airBags) {
        this.airBags = airBags;
    }

    public void setairCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    public int getNoofSeats() {
        return noofSeats;
    }

    public String getairBags() {
        return airBags;
    }

    public String getAirCondition() {
        return airCondition;
    }

    @Override
    public String toString(){
        return "Number of seats" + getNoofSeats() +"Air Bags:" + getairBags() + "Air condition: " + getAirCondition() + super.toString();
    }



}