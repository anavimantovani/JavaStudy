package demo;

public class Car {
	
	private String vin;
	private String make;
	private String model;
	private int year;
	private String color;
	
	Car(String vin, String make, String model, String color, int year){
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	public String setVin(String vin) {
		return vin;
	}
	
	public String setMake(String make) {
		return make;
	}
	
	public String setModel(String model) {
		return model;
	}
	
	public int setYear(int year) {
		return year;
	}
	
	public String setColor(String color) {
		return color;
	}
	
	public void getVin() {
		this.vin = vin;
	}
	
	public void getMake() {
		this.make = make;
	}
	
	public void getModel() {
		this.model = model;
	}
	
	public void getYear() {
		this.year = year;
	}
	
	public void getColor() {
		this.year = year;
	}
	
	public String toString() {
		String str = "Car: vin = " + vin + ", make = " + make + 
				", model = " + model + ", year = " + year + 
				", color = " + color;
		return str;
	}
}
