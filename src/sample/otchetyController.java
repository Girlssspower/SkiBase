package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class otchetyController {

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

        Stage stage = (Stage) back_to_main.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("first_window.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Другая форма");
        stage.setScene(new Scene(root));
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

}








