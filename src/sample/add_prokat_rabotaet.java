package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigInteger;
import java.sql.*;

public class add_prokat_rabotaet {


    public static void rabotaet(ComboBox<String> passport_visitor, TextField kolvo_inventar, ComboBox<String> passport_sotrud, TextField kolvo_hours,
                                DatePicker date_deal, ComboBox<String> inventar_code, Label sum) {
        try (Connection conn = DriverManager.getConnection (
                add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) {

            Statement statement = conn.createStatement();
            if (passport_visitor.getSelectionModel().getSelectedItem()==null) {alert.selectVisitor();}
            else { if (passport_sotrud.getSelectionModel().getSelectedItem()==null) {alert.selectEmployee();}
                        else { if (inventar_code.getSelectionModel().getSelectedItem()==null) {alert.selectInventar();}
                                    else {if (kolvo_inventar.getText().isEmpty()) {alert.wrongKolvoInv();}
                                                else {if (kolvo_hours.getText().isEmpty()) alert.wrongKolvoHours();
                                                        else {
                                                            statement.executeUpdate("insert into rental_equipment (" +
                                                                    " equipment_number, passport_data_vis, quantity_taken_equipment," +
                                                                    "time, cost, passport_data_em, date_deal) values ("+ getPrice.equipmentNumber + ", "
                                                                    + Long.parseLong(passport_visitor.getSelectionModel().getSelectedItem())+ ", "
                                                                    + kolvo_inventar.getText().trim() + ", "
                                                                    + kolvo_hours.getText().trim() + ","
                                                                    + sum.getText() + ", "
                                                                    + passport_sotrud.getSelectionModel().getSelectedItem() + ", '"
                                                                    + date_deal.getValue() +
                                                                    "')");
                                                            alert.Sucsess();
            }} }

            }}




        }
        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }


    }
}
