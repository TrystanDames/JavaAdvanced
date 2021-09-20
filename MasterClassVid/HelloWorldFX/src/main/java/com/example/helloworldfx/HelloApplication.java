package com.example.helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 340);

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.RED);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
//
//        root.getChildren().add(greeting);

        stage.setTitle("Hello JavaFX!");
        stage.setScene(scene);
//        stage.setScene(new Scene(root, 700, 375));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}