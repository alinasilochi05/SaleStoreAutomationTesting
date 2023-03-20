package com.example.storeseleniumproject.UtilsHandlers;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCredentials {
    public static List<Map> getCredentials() throws IOException {

        FileInputStream workbookLocation = new FileInputStream("src/test/java/com/example/storeseleniumproject/Resources/credentials.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
        XSSFSheet sheet = workbook.getSheetAt(0);

        List<Map> credentialsList = new ArrayList<>();

        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            XSSFRow row = sheet.getRow(rowIndex);
            HashMap<String, String> credentials = new HashMap<>();

            String username = row.getCell(1).getStringCellValue();
            String password = row.getCell(2).getStringCellValue();

            credentials.put("username", username);
            credentials.put("password", password);

            credentialsList.add(credentials);
        }

        return credentialsList;
    }
};

