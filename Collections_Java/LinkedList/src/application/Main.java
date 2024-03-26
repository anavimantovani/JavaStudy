//Author: Ana Victoria Gomes Mantovani
//Date: 03/24/2023
//Project: Implement and test a linked list
//Description: Let user load a text file from their computer and view it, add and delete some data

package application;
	
import java.io.File;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
	 
	//Linked list to hold car objects
	private LinkedList<Car> carList = new LinkedList<>();
	
	//Observable list to display car data in list view
    private ObservableList<String> carData = FXCollections.observableArrayList();
    private ListView<String> listView = new ListView<>(carData);

    //Text fields for user input
    private TextField colorField = new TextField();
    private TextField makeField = new TextField();
    private TextField modelField = new TextField();
    private TextField yearField = new TextField();

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        HBox inputBox = new HBox(10);
        VBox buttonBox = new VBox(10);

        //Create input fields
        colorField.setPromptText("Color");
        makeField.setPromptText("Make");
        modelField.setPromptText("Model");
        yearField.setPromptText("Year");

        //Create buttons
        Button addButton = new Button("Add Car");
        Button deleteButton = new Button("Delete Car");
        Button selectFileButton = new Button("Select File");

        //Set button actions
        addButton.setOnAction(e -> addCar());
        deleteButton.setOnAction(e -> deleteCar());
        selectFileButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                // Do something with the selected file
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            }
        });

        //Add input fields and buttons to their respective containers
        inputBox.getChildren().addAll(colorField, makeField, modelField, yearField);
        buttonBox.getChildren().addAll(addButton, deleteButton, selectFileButton);

        //Create labels and containers for list view
        Label carListLabel = new Label("Car List");
        VBox carListContainer = new VBox(10);
        carListContainer.getChildren().addAll(carListLabel, listView);

        //Set up main container
        root.setCenter(inputBox);
        root.setRight(buttonBox);
        root.setBottom(carListContainer);
        root.setPadding(new Insets(10));

        //Set up scene and stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Car list");
        primaryStage.show();

    }

    private void addCar() {
        //Get input values
        String color = colorField.getText();
        String make = makeField.getText();
        String model = modelField.getText();
        int year = Integer.parseInt(yearField.getText());

        //Create new car and add to list
        Car car = new Car(color, year, make, model);
        carList.add(car);

        //Add car data to observable list for list view
        carData.add(car.toString());
    }

    private void deleteCar() {
        //Get selected car index and remove from list and observable list
        int selectedIndex = listView.getSelectionModel().getSelectedIndex();
        carList.remove(selectedIndex);
        carData.remove(selectedIndex);
    }

    //Start program
    public static void main(String[] args) {
        launch(args);
    }
}
