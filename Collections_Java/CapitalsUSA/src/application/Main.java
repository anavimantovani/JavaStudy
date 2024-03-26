//Author: Ana Victoria Gomes Mantovani
//Date: 03/02/2023
//Project: Display the capitals
//Description: The program will ask the user to select a state and will display the state's capital and population

package application;
	
import javafx.scene.control.Label;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	
		//Create a map to store the state capitals
	 	private Map<String, StateCapital> stateCapitals = new HashMap<>();

	    @Override
	    public void start(Stage primaryStage) {

	        try {
	        	
	        	//Load the data from the file
	            readData();

	            //Label and a combo box to select a state
	            Label stateLabel = new Label("Select a state:");
	            ComboBox<String> stateComboBox = new ComboBox<>();

	            //Sort the list of state names alphabetically
	            List<String> stateNames = new ArrayList<>(stateCapitals.keySet());
	            Collections.sort(stateNames);
	            stateComboBox.getItems().addAll(stateNames);

	            //Label to display the state's capital and population
	            Label capitalLabel = new Label();

	            //Display the information when a state is selected
	            stateComboBox.setOnAction(event -> {
	                String state = stateComboBox.getValue();
	                StateCapital stateCapital = stateCapitals.get(state);
	                capitalLabel.setText(stateCapital.toString());
	            });

	            //VBox to hold all the labels
	            VBox vBox = new VBox(stateLabel, stateComboBox, capitalLabel);
	            vBox.setSpacing(10);
	            vBox.setAlignment(Pos.CENTER);

	            //Create and display the scene
	            Scene scene = new Scene(vBox, 300, 200);
	            primaryStage.setTitle("State Capitals");
	            primaryStage.setScene(scene);
	            primaryStage.show();
	            
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	//Read the data from the file and store it on the map
	private void readData(){
		
		//Open the file and create a list to store the lines of data
		File dataFile = new File("StateCapitals.txt");
	    ArrayList<StateCapital> stateList = new ArrayList<>();
	    
	    try {
	    	
	    	//Read data from the file
	        Scanner inputFile = new Scanner(dataFile);
	        inputFile.useDelimiter("\t|\n");

	        //Store each line of data into an object
	        while (inputFile.hasNext()) {
	            String state = inputFile.next();
	            String capital = inputFile.next();
	            String populationStr = inputFile.next().replaceAll("[\",]", "").trim();
	            int population = Integer.parseInt(populationStr);
	            
	            //Create a object and add it to the State Capital list
	            StateCapital stateCapital = new StateCapital(state, capital, population);
	            stateList.add(stateCapital);
	        }

	        //Close the file
	        inputFile.close();
	        
	        //Go through the State Capital list and add the objects to the map
	        for(StateCapital oneState : stateList) {
	            stateCapitals.put(oneState.getState(), oneState);
	        }
			
		} catch (FileNotFoundException e) {
			System.out.println("There was a problem finding the file.");
		}
		
	}
	
	//Start the application
	public static void main(String[] args) {
		launch(args);
	}
}
