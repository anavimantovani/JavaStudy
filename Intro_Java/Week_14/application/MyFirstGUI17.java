package application;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *  A simple JavaFX GUI application
 */

public class MyFirstGUI17 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
	   //creates stage and calls the start method
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Set the window's title.
      primaryStage.setTitle("My First GUI Application");
      
      // Show the window.
      primaryStage.show();
   }
}