package com.maven.org.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFramework {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\New\\TestNG\\target\\DATADRIVEN.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("registration");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("9094766357");

		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.err.println("Mission Completed");

	}
}

