package sample;

import javafx.scene.control.TextField;
import sample.add_visitor_rabotaet;
import sample.alert;

import java.sql.*;
import java.time.LocalDate;
import java.util.Objects;

public class add_inventar_rabotaet {

    public static void rabotaet(TextField inventar_code, TextField name_inventar, TextField count_inventar) {

        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url, add_visitor_rabotaet.root, add_visitor_rabotaet.password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql
            ResultSet resultSet = statement.executeQuery("SELECT * from equipment"); //коробка с данными из базы
            int matching = 0;
            int number_exist=0;
            if (inventar_code.getText().trim().matches("^[a-zA-Zа-яА-Я]*$") || !inventar_code.getText().trim().matches("^[0-9]*$")) {
                //код инвентаря только цифры
                alert.inventarCode();
                matching=2;
            } else {
            while (resultSet.next()) {//пока в коробке есть данные
                number_exist = resultSet.getInt(1);
                //берём данные из первой строки первого столбца
                if (Objects.equals(number_exist, Integer.parseInt(inventar_code.getText().trim()))) {
                    matching = 1;
                    alert.inventarDouble();
                }  //сравниваем с тем, что введено
            } }

                if (matching==0) {
                        if (name_inventar.getText().trim().length()>20 || name_inventar.getText().trim().length()==0) {alert.inventarName();}
                        //имя инвентаря не должно быть длиннее 20ти символов
                        else {
                            if (count_inventar.getText().trim().matches("^[a-zA-Zа-яА-Я]*$")) {alert.inventarPrice();}
                            //цена должна быть в цифрах
                            else {


                    //записываем имя, фамилию, отчество, почту, группу в visitors
                    statement.executeUpdate("insert into equipment VALUES (" + inventar_code.getText() + ",'" + name_inventar.getText() + "', " + count_inventar.getText() +  ")");
                    alert.Sucsess();

                } } }

        } catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
