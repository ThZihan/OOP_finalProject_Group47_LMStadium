package com.group47.main_pkg.final_oopproject_group47_lmstadium;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplicationClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplicationClass.class.getResource("fieldManagerDashboardScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Stadium Manager Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}