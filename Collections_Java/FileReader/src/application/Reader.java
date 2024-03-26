//Author: Ana Victoria Gomes Mantovani
//Date: 02/06/2023

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.*;

import javafx.stage.FileChooser;
  
public class Reader extends Application {
 
// Main Method
public static void main(String args[])
	{ 
	//Launch the application
	launch(args); 
	} 

//Launch the application
public void start(Stage stage)
{
    try {
        //Set title for the stage
        stage.setTitle("Binary File Reader");
        
 
        //Create a File chooser
        FileChooser fil_chooser = new FileChooser();
 
        //Create a Label
        Label label = new Label("Select a binary file to ead and apply decryption");
        
        //Create an output Label for decimals
        Label labelOutDec = new Label();
        
        Label labelOutDecDecrypt = new Label();
        
        //Create an output Label for encrypted message
        Label labelOutEnc = new Label();
        
        Label labelOutCharDecrypt = new Label();
        
        Label count = new Label();
 
        //Create a Button to create a file
        Button create = new Button("Create file");
        
        //Create a Button to select a file
        Button select = new Button("Open file");
        
        //Create a Button to save a file
        Button save = new Button("Save file");
        
        //Create a Button to delete a file
        Button delete = new Button("Delete file");
        
 
        // Create the RadioButton controls.
        RadioButton decryptButton = new RadioButton("Decryption");
        RadioButton noDecryptButton = new RadioButton("No decryption");
        
        ToggleGroup radioGroup = new ToggleGroup();
        decryptButton.setToggleGroup(radioGroup);
        noDecryptButton.setToggleGroup(radioGroup);
        
        
        
        //Create an Event Handler
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() 
        {
        	public void handle(ActionEvent e)
            {
        	    // get the file selected
                File file = fil_chooser.showOpenDialog(stage);
                
                //Get user to enter a byte file and store it on a byte array
                try (InputStream in = new FileInputStream(file)) {
                    byte[] bytes = new byte[(int) file.length()];
                    in.read(bytes);
                    
                    //Convert byte[] array to a decimal array
                    int[] iarray = new int[bytes.length];
                    int i = 0;
                    for (byte b : bytes)
                    { iarray[i++] = b & 0xff;}
                    
                    //Create character array without decryption
                    char[] carray = new char[iarray.length];
                    
                    //Create character array with decryption
                    char[] darray = new char[iarray.length];
                    
                    //Create a decrypted decimals array
                    int[] decimalDec = new int[iarray.length];
                    
                    //Convert decimal array to ascii
                    int length = iarray.length;
                    for (int m =0; m < length; m++)
                    {
                       decimalDec[m] = (iarray[m]-5);
                	   carray[m] = (char) iarray[m];
                	   darray[m] = (char) (iarray[m]-5);
                    }
                    
                    //Create the byte counter variable
            		int bCount = 0;
                    
            		//Create the strings to display the array
            		StringBuilder decimals = new StringBuilder();
            		StringBuilder encrypt = new StringBuilder();
            		StringBuilder decryptDec = new StringBuilder();
            		StringBuilder decryptChar = new StringBuilder();
            		
            		
                    //if no decryption is selected
                    if (noDecryptButton.isSelected())
                    {
                    	
                    	//Append the encrypted decimals
                    	for(int c = 0; c < iarray.length; c++ )
                		{
                			 
                			decimals.append(String.format(" %03d", iarray[c]));
                			
                		     	//Get the values from the ASCII table from 32 to 126
                			 	if (carray[c]>31 && carray[c]<127)
                    			{
                    				encrypt.append(" " + carray[c]);
                    			}
                				else
                    			{
                    				encrypt.append(" . " );
                    			}
                			
                			//If there are 16 values on a row, add a new line
                			if ((c+1) % 16 == 0 && c != iarray.length-1) 
                			{
                				decimals.append("\n");
                				encrypt.append("\n");
                			}
                			//Count how many bytes there are
                			bCount+= 1;
                		}
                    	
                    	//Pass the array to a string to be displayed
                		labelOutDec.setText(decimals.toString());
                		labelOutEnc.setText(encrypt.toString());
                		labelOutDecDecrypt.setText("");
                		labelOutCharDecrypt.setText("");
                		count.setText(Integer.toString(bCount) + " bytes");
                    }
                    		
                          
                    //if decryption is selected
                    if (decryptButton.isSelected())
                	{
                    	//Add the letter to the first line
                    	decimals.append("E: ");
                    	decryptDec.append("D:");
                    	
                    	//Append the encrypted and decrypted decimals
                    	for(int c = 0; c < iarray.length; c++ )
                		{
                			
                			decimals.append(String.format(" %03d", iarray[c]));
                			decryptDec.append(String.format(" %03d", decimalDec[c]));
                			
                				//Get the values from the ASCII table from 32 to 126
                				if (carray[c]>31 && carray[c]<127)
                    			{
                    				encrypt.append(" " + carray[c]);
                    				decryptChar.append(" " + darray[c]);
                    			}
                				else
                    			{
                    				encrypt.append(" . " );
                    				decryptChar.append(" . " );
                    			}
                			
                			//If there are 16 values on a row, add a new line
                			if ((c+1) % 16 == 0 && c != iarray.length-1) 
                			{
                				decimals.append("\nE: ");
                				decryptDec.append("\nD: ");
                				encrypt.append("\n");
                				decryptChar.append("\n");
                			}
                			//Count how many bytes there are
                			bCount+= 1;
                		}
                		//Pass the array to a string to be displayed
                		labelOutDec.setText(decimals.toString());
                		labelOutEnc.setText(encrypt.toString());
                		labelOutDecDecrypt.setText(decryptDec.toString());
                		labelOutCharDecrypt.setText(decryptChar.toString());
                		count.setText(Integer.toString(bCount) + " bytes");
                    	
                	}
                }
             
                ////Exception handler
                catch (Exception e1) 
                { e1.printStackTrace(); }
            }
        };
        
        //Event Handler
        select.setOnAction(event);
        
        //Create a HBox for the buttons
        HBox hboxButtons = new HBox(30, create, select, save, delete);
        
        //Create a HBox for the encrypt/decrypt option
        HBox radioButtons = new HBox(30, decryptButton, noDecryptButton);
        
        //Create a VBox for the head part of the GUI
        VBox vboxTop = new VBox(30, label, radioButtons, hboxButtons);
        
        //Create a HBox for the No encrypted output
        HBox hboxOutEncrypt = new HBox(30, labelOutDec, labelOutEnc);
        
        //Create a HBox for the decrypted output
        HBox hboxOutDecrypt = new HBox(30, labelOutDecDecrypt, labelOutCharDecrypt);
        
        //Create a VBox for the byte counter
        VBox counter = new VBox(count);
        
        //Create a VBox for the whole content of the GUI
        VBox output = new VBox(30, vboxTop, hboxOutEncrypt, hboxOutDecrypt, counter);
        
        //Create a Scroll Pane to display all the information
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(output);
        
        //Align the scroll pane to the center
        scrollPane.fitToWidthProperty().set(true);
 
        //Set Alignments and Paddings for the content
        hboxButtons.setAlignment(Pos.TOP_CENTER);
        radioButtons.setAlignment(Pos.TOP_CENTER);
        vboxTop.setAlignment(Pos.TOP_CENTER);
        hboxOutEncrypt.setAlignment(Pos.TOP_CENTER);
        hboxOutDecrypt.setAlignment(Pos.TOP_CENTER);
        counter.setAlignment(Pos.TOP_CENTER);
        counter.setPadding(new Insets(0, 0, 50, 0));
        label.setPadding(new Insets(50, 0, 0, 0));
        output.setAlignment(Pos.TOP_CENTER);
 
        //Create a scene
        Scene scene = new Scene(scrollPane, 800, 500);
 
        //Set the scene
        stage.setScene(scene);
        
        //Display the scene
        stage.show();
    }
 
    //Exception handler
    catch (Exception e) {
 
        System.out.println(e.getMessage());
    }
}
}