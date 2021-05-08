package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

public class redact_visitorController {

    @FXML
    private GridPane pane;

    @FXML
    private Button back_to_main;

    @FXML
    private Button redact; //функция redact_visitor

    @FXML
    private Button find_visitor; //функция find_visitor_in_database

    @FXML
    private TextField passport_visitor;  //passport_data_vis

    @FXML
    private TextField surname_visitor;  //surname_vis

    @FXML
    private TextField name_visitor;  //name_vis

    @FXML
    private TextField phone_visitor;  //phone_number_vis

    @FXML
    private TextField otchestvo_visitor; //second_name_vis

    @FXML
    private DatePicker date_birth_visitor; //birth_date_vis

    @FXML
    void enter_blue(MouseEvent event) {
        redact.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exite_blue(MouseEvent event) {
        redact.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");
    }

    @FXML
    void exite_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }


    @FXML
    void find_visitor_in_database(ActionEvent event) {
        //челик вводит паспортные данные в поле, нажимает на кнопку со значком "поиск"
        //и в поля подставляется подходящая информация из таблицы "visitors"
        find_visitor_rabotaet.rabotaet(passport_visitor, surname_visitor, name_visitor, phone_visitor,  otchestvo_visitor, date_birth_visitor);

    }

    @FXML
    void redact_visitor(ActionEvent event) {
        //изменения из эдитов перезаписываются в таблицу "visitors"
        redact_visitor_rabotaet.rabotaet(passport_visitor, surname_visitor, name_visitor, phone_visitor,  otchestvo_visitor, date_birth_visitor);
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
