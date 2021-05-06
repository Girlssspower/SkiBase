package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.*;
import java.time.LocalDate;
import java.time.chrono.Chronology;

public class find_visitor_rabotaet {


    public static void rabotaet(TextField passport_visitor, TextField surname_visitor, TextField name_visitor, TextField phone_visitor, TextField otchestvo_visitor, DatePicker date_birth_visitor) {
        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url, add_visitor_rabotaet.root, add_visitor_rabotaet.password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql
            ResultSet resultSet = statement.executeQuery("SELECT * from visitors WHERE passport_data_vis=" + Long.parseLong(String.valueOf(Integer.parseInt(passport_visitor.getText().trim())))); //коробка с данными из базы
            if (!resultSet.next()) alert.noVisitor();
            else {
                surname_visitor.setText(resultSet.getString(2));
                name_visitor.setText(resultSet.getString(3));
                otchestvo_visitor.setText(resultSet.getString(4));
                date_birth_visitor.setValue(LocalDate.parse(resultSet.getString(5)));
                phone_visitor.setText(resultSet.getString(6));
            }

        } catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
