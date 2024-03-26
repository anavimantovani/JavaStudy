//Author: Ana Victoria Gomes Mantovani
//Date: 03/02/2023
//Project: Display the capitals
//Description: The program will ask the user to select a state and will display the state's capital and population

package application;

public class StateCapital {
	
	private String state;
	private String city;
	private int population;
	
	//Constructor that takes three parameters: state, city and population
	public StateCapital(String state, String city, int population) {
        this.state = state;
        this.city = city;
        this.population = population;
    }
	
	//Mutator method for the state variable
	public void setState(String state) {
        this.state = state;
    }
	
	//Mutator method for the city variable
	public void setCity(String city) {
        this.city = city;
    }
	
	//Mutator method for the population variable
	public void setPopulation(int population) {
        this.population = population;
    }
	
	//Accessor method for the state variable
	public String getState() {
        return state;
    }
	
	//Accessor method for the city variable
	public String getCity() {
        return city;
    }
	
	//Accessor method for the population variable
	public int getPopulation() {
        return population;
    }

	//Method to make a string to display the data to the user
	public String toString() {
	
		String str = "State selected: " + state + 
				"\nState capital: " + city +
				"\nState population: " + population;
		
        return str;
    }
	
}
