//Author: Ana Victoria Gomes Mantovani
//Date: 08/12/2022
//Purpose: Calculate the total for a registration on a workshop

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
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Workshop extends Application
{
	//Fields
   CheckBox speechCheckBox;
   CheckBox ecommerceCheckBox;
   CheckBox futureWebCheckBox;
   CheckBox javaCheckBox;
   CheckBox securityCheckBox;
   Label totalLabel;
   private RadioButton generalRadio;
   private RadioButton studentRadio;
   
   public static void main(String[] args)
   {
	// Launch the application.
      launch(args);
   }
   
   public void start(Stage primaryStage)
   {
	   // Create the RadioButtons.
	   RadioButton generalRadio = new RadioButton("General Registration   $895.00");
	   RadioButton studentRadio = new RadioButton("Student Registration   $495.00");
	   
	   // Select the flowerRadio control.
	   generalRadio.setSelected(true);
	   
	   // Add the RadioButtons to a ToggleGroup.
	   ToggleGroup radioGroup = new ToggleGroup();
	   generalRadio.setToggleGroup(radioGroup);
	   studentRadio.setToggleGroup(radioGroup);
	   
	   //Add a prompt label
	   Label promptLabel1 = new Label("Select the registration option:");
	   
	   // Add the RadioButtons to a VBox.
	   VBox radioVBox = new VBox(10, promptLabel1, generalRadio, studentRadio);
	      
	   // Give the radioVBox some padding.
	   radioVBox.setPadding(new Insets(30));
	   
	   
	   
	   
	   
	   
	   //optional add-ons
	   Label promptLabel2 = new Label("Optional add-ons:");
	   speechCheckBox = new CheckBox("Opening night dinner                   $30.00");
	   ecommerceCheckBox = new CheckBox("Introduction to E-commerce        $295.00");
	   futureWebCheckBox = new CheckBox("The Future of the Web                 $295.00");
	   javaCheckBox = new CheckBox("Advanced Java Programming      $395.00");
	   securityCheckBox = new CheckBox("Network Security                         $395.00");
     
	   // Create the Button control.
       Button totalButton = new Button("Get Total");

       // Register the event handler.
       totalButton.setOnAction(new TotalButtonHandler());
      
       // Create a Label for the total.
       totalLabel = new Label("Your total is $0.00");
      
       // Put the CheckBoxes in a VBox.
       VBox checkBoxVBox = new VBox(10, promptLabel2, speechCheckBox, ecommerceCheckBox, futureWebCheckBox, javaCheckBox, securityCheckBox);
       
       // Create another VBox to use as the root node.
       VBox mainVBox = new VBox(10, radioVBox, checkBoxVBox, totalButton, totalLabel);
       
       // Set the main VBox's alignment to center.
       mainVBox.setAlignment(Pos.CENTER);
       
       // Set the main VBox's padding to 10 pixels.
       mainVBox.setPadding(new Insets(10));
       
       // Create a Scene.
       Scene scene = new Scene(mainVBox);
       
       // Add the Scene to the Stage.
       primaryStage.setScene(scene);
       
       // Set the title.
       primaryStage.setTitle("Workshop Registration");
       
       // Show the window.
       primaryStage.show();   
   }
    
   class TotalButtonHandler implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent event)
      {
    	// Variable to hold the result
         double result = 0;
         
         // Add up the optional add-ons
         if (generalRadio.isSelected())
             result += 895.0;
         
         if (studentRadio.isSelected())
             result += 495.0;
         
         if (speechCheckBox.isSelected())
             result += 30.0;
         
         if (speechCheckBox.isSelected())
             result += 30.0;
         
         if (ecommerceCheckBox.isSelected())
            result += 295.0;
         
         if (futureWebCheckBox.isSelected())
            result += 295.0;
         
         if (javaCheckBox.isSelected())
            result += 395.0;
         
         if (securityCheckBox.isSelected())
             result += 395.0;
         
         // Display the results.
         totalLabel.setText(String.format("$%,.2f", result));
      }
   }
}