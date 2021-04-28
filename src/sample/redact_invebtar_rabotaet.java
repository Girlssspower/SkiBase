package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.*;
import java.time.LocalDate;

public class redact_invebtar_rabotaet {

    public static void rabotaet(TextField inventar_code, TextField name_inventar, TextField cost_inventar) {
        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url, add_visitor_rabotaet.root, add_visitor_rabotaet.password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql

            statement.executeUpdate("update equipment set equipment_number=" + Integer.parseInt(inventar_code.getText()) + ", name='" + name_inventar.getText()
                    + "', cost_per_hour=" + Integer.parseInt(cost_inventar.getText()) +  " where equipment_number=" + Integer.parseInt(inventar_code.getText()));
            alert.SucsessEdit();
        }

        catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    }

