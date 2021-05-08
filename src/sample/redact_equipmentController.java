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

public class redact_equipmentController {

    @FXML
    private GridPane pane;

    @FXML
    private Button back_to_main;

    @FXML
    private Button redact_position; //функция redact_inventar

    @FXML
    private Button find_inventar; //функция find_inventar_in_database

    @FXML
    private TextField inventar_code; //equipment_number

    @FXML
    private TextField name_inventar; //name

    @FXML
    private TextField cost_inventar; //cost_per_hour

    @FXML
    void redact_inventar(ActionEvent event) {
        //изменения из эдитов перезаписываются в таблицу "equipment"

        redact_invebtar_rabotaet.rabotaet(inventar_code, name_inventar, cost_inventar);

    }

    @FXML
    void find_inventar_in_database(ActionEvent event) {
        //челик вводит номер инвентаря в поле, нажимает на кнопку со значком "поиск"
        //и в поля подставляется подходящая информация из таблицы "equipment"
        // из name(БД)->в name_inventar(Edit), из cost_per_hour(БД)->в cost_inventar(Edit)

        find_inventar_rabotaet.rabotaet(inventar_code, name_inventar, cost_inventar);

    }

    @FXML
    void enter_blue(MouseEvent event) {
        redact_position.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exite_blue(MouseEvent event) {
        redact_position.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");
    }

    @FXML
    void exite_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
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

}
