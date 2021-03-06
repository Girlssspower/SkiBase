package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;


public class first_windowController {
    @FXML
    private GridPane pane;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn5;

    @FXML
    private Button btn4;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Label second_text;

    @FXML
    private Label first_text;

    @FXML
    void background(MouseEvent event) {
        btn1.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white");

    }

    @FXML
    void background2(MouseEvent event) {

        btn1.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background3(MouseEvent event) {

        btn2.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white");
    }

    @FXML
    void background4(MouseEvent event) {

        btn2.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background5(MouseEvent event) {

        btn3.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white");
    }

    @FXML
    void background6(MouseEvent event) {

        btn3.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background7(MouseEvent event) {

        btn4.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white");
    }

    @FXML
    void background8(MouseEvent event) {

        btn4.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }



    @FXML
    void background9(MouseEvent event) {

        btn5.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white;");
    }

    @FXML
    void background10(MouseEvent event) {

        btn5.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void background11(MouseEvent event) {

        btn6.setStyle("-fx-background-color:linear-gradient(to bottom ,#8dbefe, #a9ceff, #b8d6ff); -fx-border-radius: 9; -fx-background-radius: 9; -fx-text-fill: white;");
    }

    @FXML
    void background12(MouseEvent event) {

        btn6.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void add_visitor(ActionEvent event)throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btn1.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_visitor.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("???????????????? ???????????? ????????????????????");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void redact_visitor(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btn2.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("redact_visitor.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("?????????????????????????? ???????????????????? ?? ????????????????????");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void add_inventar(ActionEvent event) throws IOException  {
        Stage stage;
        Parent root;

        stage = (Stage) btn3.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_equipment.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("???????????????? ?????????? ??????????????????");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void redact_inventar(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btn4.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("redact_equipment.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("?????????????????????????? ???????????????????? ???? ??????????????????");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void add_prokat(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btn6.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("add_prokat.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("???????????????? ?????????????? ?? ???????????? ????????????????????");
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    void make_otchet(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) btn5.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("otchety.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("?????????????? ??????????");
        stage.setScene(scene);
        stage.show();
    }
}








