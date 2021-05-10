package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class alert {

    public static void AlertAboutName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("ФИО должно быть введено только по-русски и не быть пустым.");

        alert.showAndWait();
    }

    public static void AlertAboutPhone() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Поле для номера телефона должно содержать 11 цифр и не быть пустым.");

        alert.showAndWait();
    }

    public static void AlertAboutPassport() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Поле для паспортных данных должно содержать 10 цифр и не быть пустым.");

        alert.showAndWait();
    }
    public static void AlertAboutAge() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Возраст должен быть больше 16 лет и не быть пустым.");

        alert.showAndWait();
    }

    public static void Sucsess() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Информация занесена в базу данных.");

        alert.showAndWait();
    }
    public static void alreadyExist() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Такой номер паспорта уже есть в базе данных.");

        alert.showAndWait();
    }
    public static void DatabaseFail() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("А где");
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("База данных не найдена");

        alert.showAndWait();
    }
    public static void inventarCode() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Код инвентаря должен содержать только цифры и не быть пустым.");

        alert.showAndWait();
    }

    public static void inventarName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Наименование инвентаря должно быть не больше 20 символов и не быть пустым.");

        alert.showAndWait();
    }

    public static void inventarPrice() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Цена инвентаря должна быть записана цифрами и быть не больше 2000 рублей.");

        alert.showAndWait();
    }

    public static void inventarDouble() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Такой номер инвентаря уже есть в базе данных.");

        alert.showAndWait();
    }

    public static void SucsessEdit() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Информация в базе данных обновлена.");

        alert.showAndWait();
    }

    public static void noNumber() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Такого номера инвентаря нет в базе данных.");

        alert.showAndWait();
    }

    public static void noVisitor() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Такого номера паспорта нет в базе данных.");

        alert.showAndWait();
    }

    public static void wrongKolvoInv() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Количество инвентаря должно быть введено арабскими цифрами и не быть пустым.");

        alert.showAndWait();
    }
    public static void wrongKolvoHours() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Количество часов должно быть введено арабскими цифрами и не быть пустым.");

        alert.showAndWait();
    }
    public static void selectVisitor() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Выберите паспортные данные посетителя.");

        alert.showAndWait();
    }
    public static void selectEmployee() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Выберите паспортные данные сотрудника.");

        alert.showAndWait();
    }
    public static void selectInventar() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Выберите инвентарь.");

        alert.showAndWait();
    }
    public static void otchetInventar() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Отчёт об эксплуатируемом инвентаре готов в C:/Отчёты/Эксплутируемый инвентарь.xsl");

        alert.showAndWait();
    }
    public static void otchetMoney() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Отчёт о денежных поступлениях готов в C:/Отчёты/Денежные поступления.xsl");

        alert.showAndWait();
    }
    public static void otchetVisitors() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Отчёт о количестве посетителей готов в C:/Отчёты/Количество посетителей.xsl");

        alert.showAndWait();
    }


    public static void whatsThere(DatePicker date_birth_visitor) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("о");
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText(String.valueOf(date_birth_visitor.getEditor().getText()));

        alert.showAndWait();
    }

}
