package sample;

import javafx.scene.control.TextField;
import sample.add_visitor_rabotaet;
import sample.alert;

import java.sql.*;
import java.util.Objects;

public class find_inventar_rabotaet {

    public static void rabotaet(TextField inventar_code, TextField name_inventar, TextField cost_inventar) {
        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url, add_visitor_rabotaet.root, add_visitor_rabotaet.password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql
            ResultSet resultSet = statement.executeQuery("SELECT * from equipment WHERE equipment_number=" + Integer.parseInt(inventar_code.getText().trim())); //коробка с данными из базы
            if (!resultSet.next()) alert.noNumber();
            else {
            name_inventar.setText(resultSet.getString(2));
            cost_inventar.setText(resultSet.getString(3)); }

        } catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    }

