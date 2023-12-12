package org.example;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataProvider {
    @DataProvider(name = "loginData")
    public static Object[][] loginData() throws IOException {
        String filePath = "src/main/java/resources/LoginData.xlsx";
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();

        Object [][] data = new Object[rowCount-1][colCount];

        for(int i = 1; i<rowCount; i++){
            Row row = sheet.getRow(i);
            for (int j = 0; j<colCount; j++){
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        workbook.close();
        fileInputStream.close();
        return data;
    }
}
