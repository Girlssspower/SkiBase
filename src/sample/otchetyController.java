package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class otchetyController {

    @FXML
    private GridPane pane;

    @FXML
    private Button visitors;  //функция otchet_visitors

    @FXML
    private Button money;  //функция otchet_money

    @FXML
    private Button inventar;  //функция otchet_inventar

    @FXML
    private Button back_to_main;

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
    void otchet_inventar(ActionEvent event) {
        otchety_inventar.inventar();
        //выведение из таблицы "rental_equipment" столбцов "date_deal", "equipment_number" и "quantity_taken_equipment"
        //в excel
        //с заголовками таблицы "дата проката", "номер инвентаря" и "количество взятого инвентаря"

    }

    @FXML
    void otchet_money(ActionEvent event) { otchety_money.money();
        //выведение из таблицы "rental_equipment" столбцов "date_deal" и "cost" в excel
        //с заголовками таблицы "дата проката" и "денежное поступление", посчитана сумму столбца "cost"

    }

    @FXML
    void otchet_visitors(ActionEvent event) { otchet_visitors.visitors();
        //выведение из таблицы "rental_equipment" столбцов "date_deal", "passport_data_vis" в excel
        //с заголовками таблицы "дата проката" и "паспортные данные посетителя"

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exit_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");

    }

    @FXML
    void button1_is_blue(MouseEvent event) {
        visitors.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: black; -fx-border-width:2; -fx-border-color:black;");

    }

    @FXML
    void button1_is_white(MouseEvent event) {
        visitors.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill:black");
    }

    @FXML
    void button2_is_blue(MouseEvent event) {
        money.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: black; -fx-border-width:2; -fx-border-color:black;");

    }

    @FXML
    void button2_is_white(MouseEvent event) {
        money.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill:black");
    }

    @FXML
    void button3_is_blue(MouseEvent event) {
        inventar.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: black; -fx-border-width:2; -fx-border-color:black;");

    }

    @FXML
    void button3_is_white(MouseEvent event) {
        inventar.setStyle("-fx-background-color:white; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill:black");
    }

}








