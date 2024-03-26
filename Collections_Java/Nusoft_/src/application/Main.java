//Author: Ana Victoria Gomes Mantovani
//Date: 04/15/2023
//Project: Fast Vehicle Lookup
//Description: Let user load a file, look through the data, delete and save the file

package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import nusoft.utils.NuHashMap;
import nusoft.utils.Vehicle;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Main extends Application {

    private NuHashMap<String, Vehicle> carMap = new NuHashMap<String, Vehicle>();
    private ListIterator<String> carIterator;
    private TextArea fileContentTextArea;
    private TextField searchField; //Added TextField for search
    private Label searchResultLabel; //Added Label for search result

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Car Data");

        //Create label and button for selecting a file
        Label fileLabel = new Label("File:");
        Button fileButton = new Button("Select File");
        fileButton.setOnAction(e -> {
            //Open a file chooser dialog to select a car data file
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Car Data File");
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                //Read the car data from the selected file and display the first car
                readCarData(selectedFile);
                carIterator = new ArrayList<String>(carMap.keySet()).listIterator();
                displayCar();
            }
        });

        //Create a text area to display the car data
        fileContentTextArea = new TextArea();
        fileContentTextArea.setEditable(false);

        //Create buttons for navigating through the cars
        Button prevButton = new Button("<<");
        prevButton.setOnAction(e -> {
            // Display the previous car in the map
            if (carIterator.hasPrevious()) {
                carIterator.previous();
                displayCar();
            }
        });

        Button nextButton = new Button(">>");
        nextButton.setOnAction(e -> {
            //Display the next car in the map
            if (carIterator.hasNext()) {
                carIterator.next();
                displayCar();
            }
        });

        //Create a text field and button for searching for a vehicle by VIN
        searchField = new TextField();
        searchResultLabel = new Label();
        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> {
            //Retrieve the vehicle with the specified VIN from the map and display its data
            String vin = searchField.getText();
            Vehicle car = carMap.get(vin);
            if (car != null) {
                fileContentTextArea.setText(car.toString());
                searchResultLabel.setText("");
            } else {
                fileContentTextArea.setText("");
                searchResultLabel.setText("No vehicle found with VIN: " + vin);
            }
        });
        
        //Create a button for deleting a vehicle by VIN
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> {
            // Remove the vehicle with the specified VIN from the map and display the next car
            String vin = searchField.getText();
            Vehicle car = carMap.get(vin);
            if (car != null) {
                carMap.remove(vin);
                carIterator = new ArrayList<String>(carMap.keySet()).listIterator();
                displayCar();
                fileContentTextArea.setText("");
                searchResultLabel.setText("Vehicle with VIN " + vin + " deleted successfully.");
            } else {
                fileContentTextArea.setText("");
                searchResultLabel.setText("No vehicle found with VIN: " + vin);
            }
        });
        
        //Create a button for saving the car data to a file
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> {
            saveCarData(); //Call the saveCarData() method to save car data to a file
            searchResultLabel.setText("File saved successfully.");
        });

        //Create a horizontal box to hold the previous and next buttons
        HBox buttonBox = new HBox();
        buttonBox.getChildren().addAll(prevButton, nextButton);
        buttonBox.setPadding(new Insets(10, 0, 0, 0)); // Added padding to the top
        buttonBox.setSpacing(10); // Added spacing between the buttons
        buttonBox.setAlignment(Pos.CENTER);

        //Create a vertical box to hold the file content text area and the button box
        VBox vbox = new VBox();
        vbox.getChildren().addAll(fileContentTextArea, buttonBox);

        //Create a grid pane to hold all UI components
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20)); // Added padding to the GridPane
        gridPane.add(fileLabel, 0, 0);
        gridPane.add(fileButton, 1, 0);
        gridPane.add(vbox, 1, 2);
        gridPane.add(deleteButton, 0, 4);
        gridPane.add(saveButton, 1, 4);
        Label searchLabel = new Label("Search:");
        gridPane.add(searchLabel, 0, 1);
        gridPane.add(searchField, 1, 1);
        gridPane.add(searchButton, 2, 1);
        gridPane.add(searchResultLabel, 1, 3);

        //Set and show the scene
        Scene scene = new Scene(gridPane, 650, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Method to read the file and add create objects for each car
    private void readCarData(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
                String[] tokens = line.split("\t");
                String vin = tokens[0];
                int year = Integer.parseInt(tokens[1]);
                String make = tokens[2];
                String model = tokens[3];
                String color = tokens[4];
                Vehicle car = new Vehicle(vin, year, make, model, color);
                carMap.put(vin, car);
            }
            carIterator = new ArrayList<String>(carMap.keySet()).listIterator();
            displayAllCars();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Method to update the map location
    private void displayAllCars() {
        while (carIterator.hasNext()) {
            String vin = carIterator.next();
            Vehicle car = carMap.get(vin);
            fileContentTextArea.setText(car.toString());
        }
        carIterator = new ArrayList<String>(carMap.keySet()).listIterator();
    }
   

    //Method to display the car data
    private void displayCar() {
        if (carIterator.hasPrevious()) {
            String vin = carIterator.previous();
            Vehicle car = carMap.get(vin);
            fileContentTextArea.setText(car.toString());
            carIterator.next();
        }
    }
    
    //Method to save the file as a new file
    private void saveCarData() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Car Data File");
        File selectedFile = fileChooser.showSaveDialog(null);
        if (selectedFile != null) {
            try (PrintWriter writer = new PrintWriter(selectedFile)) {
                for (Vehicle car : carMap.values()) {
                    writer.println(car.getVin() + "\t" + car.getModelYear() + "\t" + car.getMake() + "\t" + car.getModel() + "\t" + car.getColor());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //Start the program
    public static void main(String[] args) {
        launch(args);
    }
}