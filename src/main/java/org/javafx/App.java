package org.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/javafx/main.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 335, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}