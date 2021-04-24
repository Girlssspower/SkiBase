package sample;

import java.sql.*;
import java.util.Objects;

public class add_visitor_rabotaet {

    public static String root="root";
    public static String password="root";
    public static String url="jdbc:mysql://localhost:3306/skibase?serverTimezone=Europe/Moscow&useSSL=false";

    public static void add_visitor_rabotaet() {

        try (Connection conn = DriverManager.getConnection(url, root, password)) { //подключаемся к бд
            Statement statement = conn.createStatement(); //штука, которая обрабатывает запросы sql
            ResultSet resultSet = statement.executeQuery("SELECT * from visitors"); //коробка с данными из базы
            int matching = 0;
            int passportdata = 0;
            while (resultSet.next()) {//пока в коробке есть данные
                passportdata=resultSet.getInt(1);
                //берём данные из первой строки первого столбца
                if (Objects.equals(passportdata, add_visitorController.add_new_visitor.getText().trim())) {
                    matching = 1;
                }  //сравниваем с тем, что введено
            }

            if (matching == 0) {
                if (add_visitorController.surname_visitor.getText().matches("^[a-zA-Z]*$") || add_visitorController.name_visitor.getText().matches("^[a-zA-Z]*$") || add_visitorController.otchestvo_visitor.getText().matches("^[a-zA-Z]*$")) {
                    alert.AlertAboutName(); //Имя фамилия отчество только русскими буквами
//
                } else {
                    if (add_visitorController.phone_visitor.getText().matches("^[0-9]*$")){
                        alert.AlertAboutPhone(); //телефон только цифрами
                    }
                    else {
//                        if ()


                        //записываем имя, фамилию, отчество, почту, группу в student_info
                        statement.executeUpdate("insert into visitors VALUES (" + passportdata + ",'" + add_visitorController.surname_visitor.getText() + "', '" + add_visitorController.name_visitor.getText()+ "', '" + add_visitorController.otchestvo_visitor.getText() + "', " + add_visitorController.date_birth_visitor.getValue() + "," + add_visitorController.phone_visitor.getText() + ")");
                        alert.Sucsess();




                    }
                }
            }else alert.alreadyExist();
        } catch (
                SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
