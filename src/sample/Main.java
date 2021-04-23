package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root;
        root = FXMLLoader.load(getClass().getResource("first_window.fxml"));
        Font font = Font.loadFont("sources/Raleway-VariableFont_wght.ttf", 45);
        primaryStage.setTitle("Главная страница");
        primaryStage.setResizable(true);
        primaryStage.setScene(new Scene(root, 1600, 900));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
