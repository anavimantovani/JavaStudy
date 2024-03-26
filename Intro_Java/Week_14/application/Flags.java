//Author: Ana Victoria Gomes Mantovani
//Date: 12/01/2022
//Purpose: Display 4 flags in a grid

package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Flags extends Application
{
	public static void main(String[] args)
	   { launch(args); }
	
	public void start(Stage primaryStage)
	   {
	      
		  //Create all images components
	      Image germany = new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\germany.gif");
	      Image china = new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\china.gif");
	      Image france = new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\fr.gif");
	      Image us = new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\us.gif");
	      
	      // Create ImageView control for all flags.
	      ImageView germView = new ImageView(germany);
	      ImageView chiView = new ImageView(china);
	      ImageView frView = new ImageView(france);
	      ImageView usView = new ImageView(us);
	      
	      // Create a GridPane.
	      GridPane gridpane = new GridPane();
	      
	      // Add the ImageViews to the GridPane.
	      gridpane.add(germView, 0, 0);     // Col 0, Row 0
	      gridpane.add(chiView, 1, 0);     // Col 1, Row 0
	      gridpane.add(frView, 0, 1);   // Col 0, Row 1
	      gridpane.add(usView, 1, 1);   // Col 1, Row 1
	      
	      // Set the gap sizes.
	      gridpane.setVgap(5);
	      gridpane.setHgap(5);
	      
	      // Set the GridPane's padding.
	      gridpane.setPadding(new Insets(5));
	      
	      // Create a Scene with the GridPane as its root node.
	      Scene scene = new Scene(gridpane);
	      
	      // Add the Scene to the Stage.
	      primaryStage.setScene(scene);
	      
	      // Set the stage title.
	      primaryStage.setTitle("Flags");
	      
	      // Show the window.
	      primaryStage.show();
	   }
}
