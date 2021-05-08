package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class redact_visitor_rabotaet {


    public static void rabotaet(TextField passport_visitor, TextField surname_visitor, TextField name_visitor, TextField phone_visitor, TextField otchestvo_visitor, DatePicker date_birth_visitor) {
        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url, add_visitor_rabotaet.root, add_visitor_rabotaet.password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql


            if (surname_visitor.getText().matches("^[a-zA-Z0-9]*$") || name_visitor.getText().matches("^[a-zA-Z0-9]*$") || otchestvo_visitor.getText().matches("^[a-zA-Z0-9]*$")) {
                alert.AlertAboutName(); //Имя фамилия отчество только русскими буквами
//
            } else {
                if (phone_visitor.getText().matches("^[a-zA-Zа-яА-Я]*$") || !phone_visitor.getText().trim().matches("^[0-9]*$") || phone_visitor.getText().trim().length()!=11) {
                    alert.AlertAboutPhone(); //телефон только цифрами
                } else {
                    if (!String.valueOf(date_birth_visitor.getValue()).matches("^[0-9-]*$")) {alert.AlertAboutAge(); //дата рождения не должна быть пустой
                    } else {
                        LocalDate localDate = LocalDate.now(); //время сейчас
                        String[] splitDate = String.valueOf(localDate).split("-"); //делим по разделителю время сейчас
                        String[] splitGiven = String.valueOf(date_birth_visitor.getValue()).split("-"); //делим по разделителю дату рождения

                        if (Integer.parseInt(splitDate[0]) - Integer.parseInt(splitGiven[0]) < 16 || //если на данный момент возраст меньше 16 лет
                                (Integer.parseInt(splitDate[0]) - Integer.parseInt(splitGiven[0]) == 16 &&
                                        Integer.parseInt(splitDate[1]) - Integer.parseInt(splitGiven[1]) == 0 &&
                                        Integer.parseInt(splitDate[2]) - Integer.parseInt(splitGiven[2]) < 0)) {
                            alert.AlertAboutAge();
                        } else {
            statement.executeUpdate("update visitors set passport_data_vis=" + passport_visitor.getText() + ", surname_vis='" + surname_visitor.getText()
                    + "', name_vis='" + name_visitor.getText() +  "', second_name_vis='" + otchestvo_visitor.getText() + "', birth_date_vis='"+ date_birth_visitor.getValue()
                    + "', phone_number_vis=" + phone_visitor.getText() + " where passport_data_vis=" + passport_visitor.getText());
            alert.SucsessEdit();
        } } } } }

        catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }



}
