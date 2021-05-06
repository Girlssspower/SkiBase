package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class add_equipmentController {

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

        Stage stage = (Stage)back_to_main.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("first_window.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Главная страница");
        stage.setScene(new Scene(root));
        stage.show();


    }

}

