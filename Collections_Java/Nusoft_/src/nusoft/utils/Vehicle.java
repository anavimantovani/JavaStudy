//Author: Ana Victoria Gomes Mantovani
//Date: 04/15/2023
//Project: Fast Vehicle Lookup
//Description: Let user load a file, look through the data, delete and save the file

package nusoft.utils;

import java.util.Objects;

public class Vehicle {
    
	// Private fields to hold information about the vehicle
    private String vin;
    private int modelYear;
    private String make;
    private String model;
    private String color;

    //Constructor to initialize the fields with given values
    public Vehicle(String vin, int modelYear, String make, String model, String color) {
        this.vin = vin;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    //Getter methods to access the private fields from outside the class
    public String getVin() {
        return vin;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    //Override the equals method to compare two Vehicle objects based on their vin, modelYear, make, model, and color fields
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) obj;
        return Objects.equals(vin, other.vin)
                && modelYear == other.modelYear
                && Objects.equals(make, other.make)
                && Objects.equals(model, other.model)
                && Objects.equals(color, other.color);
    }

    //Override the hashCode method to generate a unique hash code for each Vehicle object based on its vin field
    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    //Override the toString method to return a string representation of the Vehicle object
    @Override
    public String toString() {
        String str = "Vin:      " + vin +
                     "\nYear:    " + modelYear +
                     "\nMake:   " + make +
                     "\nModel:  " + model +
                     "\nColor:    " + color;
        return str;
    }
}