package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static void main(String[] args) throws IOException {
        System.out.println("Reading excel");

        String filePath = "/home/coder/project/workspace/demo/testdata/login.xlsx";

        FileInputStream fis = new FileInputStream(new File(filePath));

        XSSFWorkbook workBook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workBook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(5);
        XSSFCell usernameCell = row.getCell(0);
        XSSFCell passwordCell = row.getCell(1);
        // System.out.println(passwordCell);
        System.out.println(usernameCell.getStringCellValue());
        System.out.println(passwordCell.getStringCellValue());
    }
}
