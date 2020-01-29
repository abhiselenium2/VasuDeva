package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingTest 
{

	public static void main(String[] args) throws Exception
	
	{
		// Specify Excel File Name
		
		File srcFile=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
	/*String data=ws.getRow(0).getCell(0).getStringCellValue();
	
	String data1=ws.getRow(0).getCell(1).getStringCellValue();
	
	String data2=ws.getRow(0).getCell(2).getStringCellValue();
	
	System.out.println(data+"   "+data1+"  "+data2);*/
		
		//reading multiple set of data
	/*	
	int rcnt=ws.getLastRowNum();
	
	for (int i = 1; i <=rcnt; i++)
	{
		String data=ws.getRow(i).getCell(0).getStringCellValue();
		
		String data1=ws.getRow(i).getCell(1).getStringCellValue();
		
		String data2=ws.getRow(i).getCell(2).getStringCellValue();
		
		System.out.println(data+"   "+data1+"  "+data2);
	}
	*/
		
		/*//Reading numeric values
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt; i++)
		{
						
		int data=(int)ws.getRow(i).getCell(1).getNumericCellValue();
		//System.out.println(data);
		
		//converting integer to String
		
		String vasu=String.valueOf(data);
		
		System.out.println(vasu);
		}*/
		
		//reading both String and integers
		
int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i <=rcnt; i++)
		{
			
			
			//checking the value is numeric value
			if(ws.getRow(i).getCell(1).getCellType()==CellType.NUMERIC)
			{
				int data=(int)ws.getRow(i).getCell(1).getNumericCellValue();
				
				//converting integer to String
				
				String vasu=String.valueOf(data);
				
				System.out.println(vasu);
			}else
			{
				String vasu=ws.getRow(i).getCell(1).getStringCellValue();
				System.out.println(vasu);
			}
		}
		
		
	}

}
