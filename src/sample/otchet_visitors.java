package sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.sql.*;

public class otchet_visitors {
    public static void visitors() {
        Workbook wb = new HSSFWorkbook(); //создаём книгу
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("Отчёт"); //создаём лист
        Row row = sheet.createRow(0); //создаём строку
        row.createCell(0).setCellValue(createHelper.createRichTextString("Дата проката")); //создаём ячейку
        sheet.autoSizeColumn(0); //маштабируем её под размер содержимого
        row.createCell(1).setCellValue(
                createHelper.createRichTextString("Паспортные данные посетителя"));
        sheet.autoSizeColumn(1);

        try (Connection conn = DriverManager.getConnection (
                add_visitor_rabotaet.url,
                add_visitor_rabotaet.root,
                add_visitor_rabotaet.password)) { //подключаемся к бд

            Statement state = conn.createStatement(); //обработчик запросов

            ResultSet resultSet = state.executeQuery("select * from rental_equipment"); //берём всё из нужной таблицы

            while (resultSet.next()) {

                Row rowNext=sheet.createRow(sheet.getLastRowNum()+1); //создаём новую строку, прибавляя к индексу последней 1
                rowNext.createCell(0).setCellValue(String.valueOf(resultSet.getDate(8))); //создаём ячейки
                rowNext.createCell(1).setCellValue(resultSet.getLong(3));

            }

        }


        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        String dir="C:\\Отчёты"; //путь к папке
        final File crdir = new File(dir); //файл  по указанному пути
        if (!crdir.exists()) //если папки нет
            crdir.mkdir(); //создаём

        try  (OutputStream fileOut = new FileOutputStream("C:\\Отчёты\\Количество посетителей.xls")) { //записываем всё, что насоздавали
            wb.write(fileOut);
            alert.otchetVisitors();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
