package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class WeatherMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(WeatherControl.class.getResource("weather-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 415, 400);
            stage.setTitle("Погода!");
            stage.setScene(scene);
            stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
