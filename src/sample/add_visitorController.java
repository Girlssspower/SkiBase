package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class add_visitorController {

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_new_visitor;  //функция add_new

    @FXML
    private TextField passport_visitor;  //passport_data_vis

    @FXML
    private TextField surname_visitor;  //surname_vis

    @FXML
    private TextField name_visitor;   //name_vis

    @FXML
    private TextField phone_visitor;  //phone_number_vis

    @FXML
    private TextField otchestvo_visitor;  //second_name_vis

    @FXML
    private DatePicker date_birth_visitor;  //birth_date_vis

    @FXML
    void add_new(ActionEvent event) {
        //в поля вводится информация и эта информация добавляется в таблицу "visitors"

    }


    public void go_main(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) back_to_main.getScene().getWindow();
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

