// write a programmig that will ask the user to enter the year, make and model of a vehicle.
// use the input to create a new vehicle object and assign it to myVehicle.
// print the value of myVehicle's year, make and model.
// then ask the user to enter the year, make and model of another vehicle.
// use the input to create a new vehicle object and assign it to yourVehicle.
// print the value of yourVehicle's year, make and model.
// finally, compare the two vehicles and print a message stating whether they are the same or different.

import java.util.Scanner;

abstract class Vehicle {
     final int year;final String make, model ;

    public Vehicle(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
    }


    // public int getYear(){
    //     return year;
    // }

    
}

// car class
class Car extends Vehicle{
    private boolean isConvertible;
    private int milesPerGallon;

    public Car(int year, String make, String model, boolean isConvertible, int milesPerGallon){
        super(year, make, model);
        this.isConvertible = isConvertible;
        this.milesPerGallon = milesPerGallon;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }

    public int getMilesPerGallon(){
        return milesPerGallon;
    }

    public void setIsConvertible(boolean isConvertible){
        this.isConvertible = isConvertible;
    }

    public void setMilesPerGallon(int milesPerGallon){
        this.milesPerGallon = milesPerGallon;
    }

    public String toString(){
        return "Year: " + year + "\nMake: " + make + "\nModel: " + model + "\nIs Convertible: " + isConvertible + "\nMiles Per Gallon: " + milesPerGallon;
    }
}