package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

public class add_visitorController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_new_visitor;

    @FXML
    private TextField Passport_visitor;

    @FXML
    private TextField surname_visitor;

    @FXML
    private TextField Name_visitor;

    @FXML
    private TextField phone_visitor;

    @FXML
    private TextField last_name_visitor;

    @FXML
    private DatePicker date_birth_visitor;


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

    @FXML
    void add_new(ActionEvent event) {

    }


}

