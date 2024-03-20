package capstoneProject.ThirdAnswer;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\deepa\\CapstoneProject\\ThirdAnswer\\APINew.xlsx";
        
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Sheet1");
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("translation");

            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue("germany");
            dataRow.createCell(1).setCellValue("alemania");
            dataRow.createCell(2).setCellValue("Saksamaa");

            FileOutputStream fileOut = new FileOutputStream(filePath);
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Excel file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
