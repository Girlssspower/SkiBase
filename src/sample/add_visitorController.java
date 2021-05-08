package sample;

import com.sun.glass.ui.View;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class add_visitorController {
    @FXML
    private GridPane pane;

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

           add_visitor_rabotaet.add_visitor_rabotaet(passport_visitor, surname_visitor, name_visitor, otchestvo_visitor, phone_visitor, date_birth_visitor);


    }

    @FXML
    void enter_blue(MouseEvent event) {
        add_new_visitor.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exite_blue(MouseEvent event) {
        add_new_visitor.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");
    }

    @FXML
    void exite_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }


    public void go_main(ActionEvent actionEvent) throws IOException {
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


