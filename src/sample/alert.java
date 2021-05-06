package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class alert {

    public static void AlertAboutName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("ФИО может быть введено только по-русски и не быть пустым.");

        alert.showAndWait();
    }

    public static void AlertAboutPhone() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Телефон должен быть введён только 11ю цифрами и не быть пустым.");

        alert.showAndWait();
    }

    public static void AlertAboutPassport() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Паспортные данные должены быть введёны только 10ю цифрами и не быть пустыми.");

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
        alert.setContentText("Такой паспорт уже есть в базе данных.");

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
        alert.setContentText("Код инвентаря может содержать только цифры и не должен быть пустым.");

        alert.showAndWait();
    }

    public static void inventarName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Наименование инвентаря может быть не больше 20ти символов и не должно быть пустым.");

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
        alert.setContentText("Выберите паспортные данные работника.");

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
        alert.setContentText("Отчёт о инвентаре готов в C:/Отчёты/Эксплутируемый инвентарь.xsl");

        alert.showAndWait();
    }
    public static void otchetMoney() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Отчёт о инвентаре готов в C:/Отчёты/Денежные поступления.xsl");

        alert.showAndWait();
    }
    public static void otchetVisitors() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText("Отчёт о инвентаре готов в C:/Отчёты/Количество посетителей.xsl");

        alert.showAndWait();
    }


    public static void whatsThere() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("о");
        alert.setTitle("Сообщение");
        alert.setHeaderText(null);
        alert.setContentText(String.valueOf(LocalDate.now()));

        alert.showAndWait();
    }

}
