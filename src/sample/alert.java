package sample;

import javafx.scene.control.Alert;

public class alert {

    public static void AlertAboutName() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ошибочка вышла");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("пошел нахуй, пиндос ебучий");

        alert.showAndWait();
    }

    public static void AlertAboutPhone() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ошибочка вышла");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("Телефон эт цифры, ес чо, умник");

        alert.showAndWait();
    }

    public static void Sucsess() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ну неужели");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("В базу добавлено");

        alert.showAndWait();
    }
    public static void alreadyExist() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Атата");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("Такие паспортные данные уже имеются");

        alert.showAndWait();
    }
    public static void DatabaseFail() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("А где");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText("База данных затерялась во тьме");

        alert.showAndWait();
    }

    public static void whatsThere() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("о");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText(add_visitorController.passport_visitor.getText());

        alert.showAndWait();
    }

}
