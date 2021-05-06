package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.*;

public class add_prokat_rabotaet {


    public static void rabotaet(TextField passport_visitor, TextField kolvo_inventar, TextField passport_sotrud, TextField kolvo_hours,
                                DatePicker date_deal, ComboBox<String> inventar_code) {

        try (Connection conn = DriverManager.getConnection (
                add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) {

            Statement statement = conn.createStatement();
            ResultSet resultset = statement.executeQuery ("select * from equipment");



        }
        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
