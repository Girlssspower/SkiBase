package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class add_equipmentController {
    @FXML
    private GridPane pane;

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_inventar;  //функция add_in_inventar

    @FXML
    private TextField inventar_code; //equipment_number

    @FXML
    private TextField name_inventar;  //name

    @FXML
    private TextField count_inventar;  //cost_per_hour

    @FXML
    void add_in_inventar(ActionEvent event) {
    //в поля вводится информация и эта информация добавляется в таблицу "equipment"
        add_inventar_rabotaet.rabotaet(inventar_code, name_inventar, count_inventar);
    }

    @FXML
    void go_main(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) back_to_main.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("first_window.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Главная страница");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void enter_blue(MouseEvent event) {
        add_inventar.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exite_blue(MouseEvent event) {
        add_inventar.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");
    }

    @FXML
    void exite_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

}

