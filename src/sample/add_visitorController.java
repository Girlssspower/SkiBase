package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class add_visitorController  {


    @FXML
    public static Button back_to_main;

    @FXML
    public static Button add_new_visitor;  //функция add_new

    @FXML
    public static TextField passport_visitor;  //passport_data_vis

    @FXML
    public static TextField surname_visitor;  //surname_vis

    @FXML
    public static TextField name_visitor;   //name_vis

    @FXML
    public static TextField phone_visitor;  //phone_number_vis

    @FXML
    public static TextField otchestvo_visitor;  //second_name_vis

    @FXML
    public static DatePicker date_birth_visitor;  //birth_date_vis

    @FXML
    void add_new(ActionEvent event) {
        //в поля вводится информация и эта информация добавляется в таблицу "visitors"

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("о");

            // Header Text: null
            alert.setHeaderText(null);
            alert.setContentText(passport_visitor.getText());

            alert.showAndWait();


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

