
package test;

import controller.ControllerForView;
import entity.Employee;
import entity.Product;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("CreateProduct.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        
        Scene scene = new Scene(root);
        //scene.getStylesheets().add(getClass().getResource("/style/createProduct.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource("/style/dashboard.css").toExternalForm());

        //primaryStage.setTitle("Add Product");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}