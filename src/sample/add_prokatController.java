package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class add_prokatController implements Initializable {

    @FXML
    private GridPane pane;

    @FXML
    private Button back_to_main;

    @FXML
    private Button add_position; //add_in_prokat


    @FXML
    private TextField kolvo_inventar;  //quantity_taken_equipment

    @FXML
    private ComboBox<String> passport_visitor; //выпадают значения из таблицы "visitors" из столбца "passport_data_vis"
                                            //через метод initialize

    @FXML
    private ComboBox<String> passport_sotrud; //выпадают значения из таблицы "employees" из столбца "passport_data_em"
                                        //через метод initialize

    @FXML
    private TextField kolvo_hours;  //time

    @FXML
    private DatePicker date_deal;  //date_deal

    @FXML
    private ComboBox<String> inventar_code; //выпадают значения из таблицы "equipment" из столбца "equipment_name"
                                            //через метод initialize

    @FXML
    private Label sum;  //cost
    //выводится произведение столбца "cost_per_hour" из таблицы "equipment"
    // на столбец "quantity_taken_equipment" из таблицы "rental_equipment"
    // и еще на столбец "time" из таблицы "rental_equipment"


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> inventoryList = FXCollections.observableArrayList(); //лист с инвентарём
        ObservableList<String> employeePassportList = FXCollections.observableArrayList(); //лист с паспортами работников
        ObservableList<String> visitorPassportList = FXCollections.observableArrayList(); //лист с паспортами клиентов
        try (Connection conn = DriverManager.getConnection (
                add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) { //подключаемся к бд

            Statement statement = conn.createStatement(); //обработчик запрсов на выборки
            ResultSet resultset = statement.executeQuery ("select * from equipment"); //выбираем всё из инвентаря
            while (resultset.next()) {
                inventoryList.add(resultset.getString(2)); //берём название
            }
            resultset = statement.executeQuery ("select * from visitors"); //всё из посетителей
            while (resultset.next()) {
                visitorPassportList.add(resultset.getString(1)); //паспорт
            }
            resultset = statement.executeQuery ("select * from employees"); //всё из работников
            while (resultset.next()) {
                employeePassportList.add(resultset.getString(1)); //паспорт
            }
        }
        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        inventar_code.setItems(inventoryList); //добавляем листы в комбобоксы
        passport_visitor.setItems(visitorPassportList);
        passport_sotrud.setItems(employeePassportList);

        date_deal.setValue(LocalDate.now()); //ставим сегодняшнюю дату

        kolvo_hours.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                    if (kolvo_hours.getText().trim().matches("^[a-zA-Zа-яА-Я]*$")) {
                        alert.wrongKolvoInv();
                        kolvo_hours.selectAll();
                    }
                if (!kolvo_inventar.getText().isEmpty() && !kolvo_hours.getText().isEmpty() && !inventar_code.getSelectionModel().getSelectedItem().isEmpty())
                    sum.setText(String.valueOf(getPrice.getPrice(kolvo_hours, kolvo_inventar, inventar_code)));
            }
        });

        kolvo_inventar.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if (kolvo_inventar.getText().trim().matches("^[a-zA-Zа-яА-Я]*$")) {
                    alert.wrongKolvoHours();
                    kolvo_inventar.selectAll();
                }
                if (!kolvo_inventar.getText().isEmpty() && !kolvo_hours.getText().isEmpty() && !inventar_code.getSelectionModel().getSelectedItem().isEmpty())
                    sum.setText(String.valueOf(getPrice.getPrice(kolvo_hours, kolvo_inventar, inventar_code)));

            }
        });


    }

    @FXML
    void add_in_prokat(ActionEvent event) {
        //в поля вводится информация и эта информация добавляется в таблицу "rental_equipment"
        //*по этой кнопке добавляется и запись в таблицу, и выводится стоимость в Label
        add_prokat_rabotaet.rabotaet(passport_visitor, kolvo_inventar, passport_sotrud, kolvo_hours, date_deal, inventar_code, sum);

    }


    @FXML
    void enter_blue(MouseEvent event) {
        add_position.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");

    }

    @FXML
    void enter_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 155; -fx-pref-height: 55; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
    }

    @FXML
    void exite_blue(MouseEvent event) {
        add_position.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-background-color: #a3c7f8;-fx-background-radius:6 ");
    }

    @FXML
    void exite_white(MouseEvent event) {
        back_to_main.setStyle("-fx-pref-width: 150; -fx-pref-height: 50; -fx-border-color:#a3c7f8; -fx-background-color:transparent; -fx-background-radius:6; -fx-border-width:2; -fx-border-radius:6;");
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
