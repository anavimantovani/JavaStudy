//Author: Ana Victoria Gomes Mantovani
//Date: 12/01/2022
//Purpose: Display a GUI of a Tic tac toe

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Tictactoe extends Application {
	
	public static void main(String[] args)
	   {
	      launch(args);
	   }
	
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		GridPane pane = new GridPane();

		// Add nodes to pane
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int n = (int)(Math.random() * 3);
				if (n == 0)
					pane.add(new ImageView(new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\x.gif")), j, i);
				else if (n == 1)
					pane.add(new ImageView(new Image("file:C:\\Users\\COD_User\\eclipse-workspace\\HomeworkWeek13\\application\\o.gif")), j, i);
				else
					continue;
			}
		}

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 120, 130);
		primaryStage.setTitle("Tic-tac-toe"); // Set title for stage
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}