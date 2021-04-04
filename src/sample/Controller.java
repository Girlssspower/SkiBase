package sample;
import com.sun.prism.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

public class Controller {


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
    void background(MouseEvent event) {
        btn1.setStyle("-fx-background-color:linear-gradient(to bottom ,#2f94de, #66a7eb, #73b7ec); -fx-border-radius: 9; -fx-background-radius: 9;");

    }

    @FXML
    void background2(MouseEvent event) {

        btn1.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background3(MouseEvent event) {

        btn2.setStyle("-fx-background-color:linear-gradient(to bottom ,#2f94de, #66a7eb, #73b7ec); -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void background4(MouseEvent event) {

        btn2.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background5(MouseEvent event) {

        btn3.setStyle("-fx-background-color:linear-gradient(to bottom ,#2f94de, #66a7eb, #73b7ec); -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void background6(MouseEvent event) {

        btn3.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }


    @FXML
    void background7(MouseEvent event) {

        btn4.setStyle("-fx-background-color:linear-gradient(to bottom ,#2f94de, #66a7eb, #73b7ec); -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void background8(MouseEvent event) {

        btn4.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }



    @FXML
    void background9(MouseEvent event) {

        btn5.setStyle("-fx-background-color:linear-gradient(to bottom ,#2f94de, #66a7eb, #73b7ec); -fx-border-radius: 9; -fx-background-radius: 9;");
    }

    @FXML
    void background10(MouseEvent event) {

        btn5.setStyle("-fx-background-color:white; -fx-border-radius: 9; -fx-background-radius: 9;");
    }
}








