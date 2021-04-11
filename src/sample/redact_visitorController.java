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

public class redact_visitorController {

    @FXML
    private Button back_to_main;

    @FXML
    private Button edit;

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

    @FXML
    void edit_vis(ActionEvent event) {

    }

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

}
