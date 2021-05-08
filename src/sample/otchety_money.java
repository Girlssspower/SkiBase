package sample;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.sql.*;

public class otchety_money {
    public static void money() {
        Workbook wb = new HSSFWorkbook(); //создаём книгу
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("Отчёт"); //создаём лист
        Row row = sheet.createRow(0); //создаём строку
        row.createCell(0).setCellValue(createHelper.createRichTextString("Дата проката")); //создаём ячейку
        sheet.autoSizeColumn(0); //маштабируем её под размер содержимого
        row.createCell(1).setCellValue(
                createHelper.createRichTextString("Денежное поступление"));
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
                rowNext.createCell(1).setCellValue(resultSet.getLong(6));

            }

        }


        catch (SQLException throwables) {
            alert.DatabaseFail(); //если не получилось подключиться, держим в курсе
            throwables.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        Row summaRow =  sheet.createRow(sheet.getLastRowNum()+1);
        summaRow.createCell(3).setCellValue("Cумма:");
        sheet.autoSizeColumn(sheet.getLastRowNum());
        summaRow.createCell(4).setCellFormula("SUM(B2:B7)");
        String dir="C:\\Отчёты"; //путь к папке
        final File crdir = new File(dir); //файл  по указанному пути
        if (!crdir.exists()) //если папки нет
            crdir.mkdir(); //создаём

        try  (OutputStream fileOut = new FileOutputStream("C:\\Отчёты\\Денежные поступления.xls")) { //записываем всё, что насоздавали
            wb.write(fileOut);
            alert.otchetMoney();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
