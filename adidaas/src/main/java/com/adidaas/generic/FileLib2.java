package com.adidaas.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib2 {
	public String getExcelValue(String sheetname,int row,int cell) throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis2 = new FileInputStream("./src/test/resources/testscript.slxs");
		Workbook wb = WorkbookFactory.create(fis2);
		String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return value;
		
	}

}
