package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.sql.*;

public class getPrice {

    public static int equipmentNumber=0;
    public static int price=0;
    public static int getPrice(TextField kolvo_hours, TextField kolvo_inventar, ComboBox<String> inventar_code) {

        try (Connection conn = DriverManager.getConnection(add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) {
            Statement state= conn.createStatement();
            ResultSet resultset = state.executeQuery("select * from equipment where name='" +inventar_code.getSelectionModel().getSelectedItem() +"'");
            while (resultset.next()) {price=resultset.getInt(3);
                                       equipmentNumber=resultset.getInt(1); };
            price=price*Integer.parseInt(kolvo_hours.getText())*Integer.parseInt(kolvo_inventar.getText());

        }
        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return price;


    }
}
