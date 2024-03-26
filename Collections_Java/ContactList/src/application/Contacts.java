//Author: Ana Victoria Gomes Mantovani
//Date: 01/26/2023
//Class: CIS-2572-001

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Contacts extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the ListView width and height
      final double WIDTH = 400.0, HEIGHT = 100.0;
      
      // Create a ListView of Integers.
      ListView<String> listView = new ListView<>();
      listView.setPrefSize(WIDTH, HEIGHT);
      listView.getItems().addAll("Bethany Miller", "Katrina Smith", "Charles Jhonson", "Will Addams");
      listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
      
      // Create a Label to display the selection.
      Label outputLabel = new Label("Select a Contact");
      
      //Create buttons to create, open or delete a contact
      Button button1 = new Button("Add New Contact");
      Button button2 = new Button("View Contact");
      Button button3 = new Button("Edit Contact");
      Button button4 = new Button("Delete Contact");
      
      // Create an event handler for the Button.
      button2.setOnAction(event ->
      {
         // Determine which item is selected
         if (listView.getSelectionModel().getSelectedIndex() == 0)
         {
            // Get the ObservableList of selected items.
            ObservableList<String> selections = listView.getSelectionModel().getSelectedItems();
            
            //Contact detail variable
            String details = "";
            
            //Get the details of the contact
            for (String num : selections)
            	details = num + 
            	"\n +1(555)-123-4567" +
            			"\n Indianapolis, IN";
               
            //Display the contact
            outputLabel.setText(details);
            outputLabel.setAlignment(Pos.BOTTOM_CENTER);
            outputLabel.setPrefSize(200, 100);
         }
      // Determine which item is selected
         else if (listView.getSelectionModel().getSelectedIndex() == 1)
         {
            // Get the ObservableList of selected items.
            ObservableList<String> selections = listView.getSelectionModel().getSelectedItems();
            
         	//Contact detail variable
            String details = "";
            
            //Get the details of the contact
            for (String num : selections)
            	details = num + 
            	"\n +1(555)-111-2222" +
            	"\n Miami, FL";
               
            //Display the contact
            outputLabel.setText(details);
            outputLabel.setAlignment(Pos.BOTTOM_CENTER);
            outputLabel.setPrefSize(200, 100);
         }
         // Determine which item is selected
         else if (listView.getSelectionModel().getSelectedIndex() == 2)
         {
            // Get the ObservableList of selected items.
            ObservableList<String> selections = listView.getSelectionModel().getSelectedItems();
            
            //Contact detail variable
            String details = "";
            
            //Get the details of the contact
            for (String num : selections)
            	details = num + 
            	"\n +1(555)-777-8888" +
            	"\n Los Angeles, CA";
               
            //Display the contact
            outputLabel.setText(details);
            outputLabel.setAlignment(Pos.BOTTOM_CENTER);
            outputLabel.setPrefSize(200, 100);
         }
         // Determine which item is selected
         else if (listView.getSelectionModel().getSelectedIndex() == 3)
         {
            // Get the ObservableList of selected items.
            ObservableList<String> selections = listView.getSelectionModel().getSelectedItems();
            
            //Contact detail variable
            String details = "";
            
            //Get the details of the contact
            for (String num : selections)
            	details = num + 
            	"\n +1(555)-123-4567" +
            	"\n Chicago, IL";
               
            //Display the contact
            outputLabel.setText(details);
            outputLabel.setAlignment(Pos.BOTTOM_CENTER);
            outputLabel.setPrefSize(200, 100);
         }
         //If not item is selected
         else
         {
            outputLabel.setText("Nothing Selected");
         }
      });
      
      //Create a HBox that contains the three buttons
      HBox hbox = new HBox(10, button1, button2, button3, button4);
      hbox.setPadding(new Insets(30));
      hbox.setAlignment(Pos.CENTER);
      HBox buttons = new HBox(hbox);
      
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, listView, outputLabel, buttons);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
      
      //Set stage title
      primaryStage.setTitle("Contact List");
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}