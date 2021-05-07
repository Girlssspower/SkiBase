package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;


import java.math.BigInteger;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Objects;

public class add_visitor_rabotaet {

    public static String root="root";
    public static String password="root";
    public static String url="jdbc:mysql://localhost:3306/skibase?serverTimezone=Europe/Moscow&useSSL=false";

    public static void add_visitor_rabotaet(TextField passport_visitor, TextField surname_visitor, TextField name_visitor, TextField otchestvo_visitor, TextField phone_visitor, DatePicker date_birth_visitor) {

        try (Connection conn = DriverManager.getConnection(url, root, password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql
            ResultSet resultSet = statement.executeQuery("SELECT * from visitors"); //коробка с данными из базы
            int matching = 0;
            long passportdata = 0;
            if (passport_visitor.getText().trim().matches("^[a-zA-Zа-яА-Я]*$") || !passport_visitor.getText().trim().matches("^[0-9]*$") || passport_visitor.getText().trim().length()!=10) { //паспортные данные только цифры
                alert.AlertAboutPassport();
                matching=2;
            } else {
            while (resultSet.next()) {//пока в коробке есть данные
                passportdata=resultSet.getLong(1);
                //берём данные из первой строки первого столбца

                if (Objects.equals(passportdata, BigInteger.valueOf(Long.parseLong(passport_visitor.getText().trim())))) {
                    matching = 1;
                }  //сравниваем с тем, что введено
            }}

            if (matching == 0) {
                    if (surname_visitor.getText().matches("^[a-zA-Z0-9]*$") || name_visitor.getText().matches("^[a-zA-Z0-9]*$") || otchestvo_visitor.getText().matches("^[a-zA-Z0-9]*$")) {
                        alert.AlertAboutName(); //Имя фамилия отчество только русскими буквами
//
                    } else {
                        if (phone_visitor.getText().matches("^[a-zA-Zа-яА-Я]*$") || !phone_visitor.getText().trim().matches("^[0-9]*$") || phone_visitor.getText().trim().length()!=11) {
                            alert.AlertAboutPhone(); //телефон только цифрами
                        } else {
                            if (!String.valueOf(date_birth_visitor.getEditor().getText()).matches("^[0-9.]*$")) {alert.AlertAboutAge(); //дата рождения не должна быть пустой
                            } else {
                                LocalDate localDate = LocalDate.now(); //время сейчас
                                String[] splitDate = String.valueOf(localDate).split("-"); //делим по разделителю время сейчас
                                String[] splitGiven = date_birth_visitor.getEditor().getText().split("\\."); //делим по разделителю дату рождения

                                if (Integer.parseInt(splitDate[0]) - Integer.parseInt(splitGiven[2]) < 16 || //если на данный момент возраст меньше 16 лет
                                        (Integer.parseInt(splitDate[0]) - Integer.parseInt(splitGiven[2]) == 16 &&
                                                Integer.parseInt(splitDate[1]) - Integer.parseInt(splitGiven[1]) == 0 &&
                                                Integer.parseInt(splitDate[2]) - Integer.parseInt(splitGiven[0]) < 0)) {
                                    alert.AlertAboutAge();
                                } else {


                                    //записываем имя, фамилию, отчество, почту, группу в visitors
                                    statement.executeUpdate("insert into visitors VALUES (" + passport_visitor.getText() + ",'"
                                            + surname_visitor.getText() + "', '"
                                            + name_visitor.getText() + "', '"
                                            + otchestvo_visitor.getText() + "', '"
                                            + splitGiven[2] +"-" +splitGiven[1] +"-" + splitGiven[0] + "' ,"
                                            + phone_visitor.getText() + ")");
                                    alert.Sucsess();


                                }
                            }
                        }
                }
            }else{ if (matching==1) alert.alreadyExist(); }
        } catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
