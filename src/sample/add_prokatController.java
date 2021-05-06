package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class add_prokatController implements Initializable {

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_position; //add_in_prokat


    @FXML
    private TextField kolvo_inventar;  //quantity_taken_equipment

    @FXML
    private ComboBox<?> passport_visitor;

    @FXML
    private ComboBox<?> passport_sotrud;

    @FXML
    private TextField kolvo_hours;  //time

    @FXML
    private DatePicker date_deal;  //date_deal

    @FXML
    private ComboBox<String> inventar_code; //выпадают значения из таблицы "equipment" из столбца "equipment_number"
                                            //через метод initialize

    @FXML
    private Label sum;  //cost
    //выводится произведение столбца "cost_per_hour" из таблицы "equipment"
    // на столбец "quantity_taken_equipment" из таблицы "rental_equipment"
    // и еще на столбец "time" из таблицы "rental_equipment"


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> inventoryList = FXCollections.observableArrayList();
        try (Connection conn = DriverManager.getConnection (
                add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) {

            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery ("select * from equipment");
            while (resultset.next()) {
                inventoryList.add(resultset.getString(2));
            }
        }
        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        inventar_code.setItems(inventoryList);
    }

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
