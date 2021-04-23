package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class add_prokatController {

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_position; //add_in_prokat

    @FXML
    private TextField passport_visitor;  //passport_data_vis

    @FXML
    private TextField kolvo_inventar;  //quantity_taken_equipment

    @FXML
    private TextField passport_sotrud;  //passport_data_em

    @FXML
    private TextField kolvo_hours;  //time

    @FXML
    private DatePicker date_deal;  //date_deal

    @FXML
    private ComboBox<?> inventar_code; //нужно, чтобы выпадали значения из таблицы "equipment" из столбца "equipment_number"

    @FXML
    private Label sum;  //cost
    //выводится произведение столбца "cost_per_hour" из таблицы "equipment"
    // на столбец "quantity_taken_equipment" из таблицы "rental_equipment"
    // и еще на столбец "time" из таблицы "rental_equipment"

    @FXML
    void add_in_prokat(ActionEvent event) {
        //в поля вводится информация и эта информация добавляется в таблицу "rental_equipment"
        //*по этой кнопке добавляется и запись в таблицу, и выводится стоимость в Label

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
