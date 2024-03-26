//Author: Ana Victoria Gomes Mantovani
//Date: 08/12/2022
//Purpose: Calculate the assessment value and tax of a property

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class PropertyTax extends Application
{
   private TextField landValue;
   private Label assessmentLabel;
   private Label taxLabel;
   
   public static void main(String[] args)
   {
	// Launch the application.
      launch(args);
   }
   
   public void start(Stage primaryStage)
   {
	   // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter the value of the land:");
      
      // Create a TextField for input.
      landValue = new TextField();
      
      // Create a Button to perform the calculation.
      Button calcButton = new Button("Calculate Tax");
      
      //Register the event handler.
      calcButton.setOnAction(new CalcButtonHandler());
      
      //Calculate the value and tax
      assessmentLabel = new Label();
      taxLabel = new Label();
      
      // Put the promptLabel and the landValue in an HBox.
      HBox hbox = new HBox(10, promptLabel, landValue);
      
      //Put all the buttons and labens inside the VBox
      VBox vbox = new VBox(10, hbox, calcButton, assessmentLabel, taxLabel);
      
      //Set the VBox's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      //Set the VBox's padding to 10 pixels.
      vbox.setPadding(new Insets(10));
      
      //Create a Scene.
      Scene scene = new Scene(vbox);
      
      //Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      //Set the stage title.
      primaryStage.setTitle("Tax Calculator");
      
      //Show the window.
      primaryStage.show();   
   }
    
   //Calculate the assessment value and tax
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent event)
      {
         //Get the land value
         Double land = Double.parseDouble(landValue.getText());
         
         //Calculate the value of the property
         Double value = land * 0.6;
         
         //Calculate the total tax
         Double tax = value / 100 * 0.64;
         
         // Display the results.
         assessmentLabel.setText("The assessment value is: $" + String.format("%,.2f", value));
         taxLabel.setText("The total tax is: $" + String.format("%,.2f", tax));
      }
   }
}
