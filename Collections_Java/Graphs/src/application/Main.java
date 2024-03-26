//Author: Ana Victoria Gomes Mantovani
//Date: 05/01/2023
//Project: Weighted Graph
//Description: Find shortest path and find minimum spanning tree

package application;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Application {
    private WeightedGraph<?> graph;
    private TextArea edgesTextArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	
    	//Create labels to hold the data
        Button selectFileButton = new Button("Select File");
        Label fileNameLabel = new Label("Selected File: ");
        Label verticesLabel = new Label("Vertices: ");
        Label edgesLabel = new Label("Number of Edges: ");
        Label edgesListLabel = new Label("Edges: ");
        edgesTextArea = new TextArea();
        
        //Put labels on boxes to be displayed
        VBox graphInfoBox = new VBox(verticesLabel, edgesLabel, edgesListLabel, edgesTextArea);
        Label selectedFileLabel = new Label();
        TextField vertex1TextField = new TextField();
        TextField vertex2TextField = new TextField();
        Button shortestPathButton = new Button("Find Shortest Path");
        Label shortestPathLabel = new Label();
        HBox shortestPathBox = new HBox(vertex1TextField, vertex2TextField, shortestPathButton, shortestPathLabel);
        
        //Create a Grid Pane to center all elements
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setAlignment(Pos.CENTER);
        root.add(selectFileButton, 0, 0);
        root.add(selectedFileLabel, 0, 1);
        root.add(graphInfoBox, 0, 2);
        root.add(shortestPathBox, 0, 3);
        root.add(fileNameLabel, 0, 1);
        GridPane.setHalignment(selectFileButton, HPos.CENTER);
        GridPane.setHalignment(graphInfoBox, HPos.CENTER);
        GridPane.setHalignment(shortestPathBox, HPos.CENTER);

        //Let user select a file from the directory
        selectFileButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                fileNameLabel.setText("Selected File: " + selectedFile.getName());
                graph = createGraphFromFile(selectedFile);
                int numberOfVertices = graph.getNumberOfVertices();
                int numberOfEdges = graph.getNumberOfEdges();
                verticesLabel.setText("Vertices: " + numberOfVertices);
                edgesLabel.setText("Number of Edges: " + numberOfEdges);

                List<WeightedEdge> graphEdges = graph.getEdges();
                // Display all the edges in the edgesTextArea
                edgesTextArea.clear();
                for (WeightedEdge edge : graphEdges) {
                    edgesTextArea.appendText(edge.toString() + "\n");
                }
            }
        });

        /*shortestPathButton.setOnAction(e -> {
            int vertex1 = Integer.parseInt(vertex1TextField.getText());
            int vertex2 = Integer.parseInt(vertex2TextField.getText());
            int[] path = graph.getShortestPath(vertex1, vertex2);
            String pathString = "A path from " + vertex1 + " to " + vertex2 + ": ";
            for (int vertex : path) {
                pathString += vertex + " ";
            }
            shortestPathLabel.setText(pathString);
        });*/

        //Display the scene
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //Method to read the file and store the data
    private WeightedGraph createGraphFromFile(File file) {
        List<WeightedEdge> edges = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            int numberOfVertices = scanner.nextInt();

            // Consume the rest of the first line
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] triplets = line.split("[\\|]");

                for (String triplet : triplets) {
                    String[] parts = triplet.split(",");
                    int u = Integer.parseInt(parts[0].trim());
                    int v = Integer.parseInt(parts[1].trim());
                    double w = Double.parseDouble(parts[2].trim());
                    edges.add(new WeightedEdge(u, v, w));
                    edges.add(new WeightedEdge(v, u, w)); // add the reverse edge as well
                }
            }

            return new WeightedGraph(edges, numberOfVertices);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}