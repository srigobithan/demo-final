//***********************************************************************************
//* Description
//*------------
//* Add Sbu functionaltiy
//***********************************************************************************
//*
//* Author           : Sriharan Gobithan 
//* Date Written     : 17/02/2023
//* 
//*
//* 
//* Test Case Number       Date         Intis        Comments
//* ================       ====         =====        ========
//*                        17/02/2023   Gobithan     Orginal Version
//*
//************************************************************************************

package com.invicta.qa.testcases.sbu;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuFunPage;


public class AddSbuFunTest extends DriverIntialization{
			
	static AddSbuFunPage table = new AddSbuFunPage();
			
	static AddSbuUITest UI = new AddSbuUITest();
	
@BeforeTest
public static void start () throws InterruptedException { 
				
	PageFactory.initElements(driver, table);
	
	//Step1: CHECK LOGIN WINDOW (Enter username & Password)
	UI.Menu();
	
	/*Step2: CHECK ADD SBU BUTTON UI PROPERTIES (Visible, FontColor, FontSize, Font Family, Text Spelling, Button Position,
	Button Padding, Button Shadow, Button BG Color, Button Border Color, Button Curser Point, Button Opacity, Button Height
	Button Width, Button Font-weight )*/
	UI.addsbubutton();
		
	
		
//	AddSbuFunPage.Username.sendKeys("admin");
//	AddSbuFunPage.Password.sendKeys("tokyo@admin");
//	AddSbuFunPage.LoginButton.click();
//	
//	Thread.sleep(2000);
//	AddSbuFunPage.master.click();
//	
//	Thread.sleep(2000);
//	AddSbuFunPage.sbutable.click();

 
}

		@Test
	public static void sbudata () throws IOException, InterruptedException {
			
		/*Step3: CHECK ADD SBU POPUP WINDOW UI PROPERTIES (visible, position, PopupWindowSize, background-color, border-color
		 		overflow, margin, cursor, z-index)*/
		UI.addsbumodel();
		
		/*Step4: CHECK ADD SBU POPUP WINDOW SAVE BUTTON UI PROPERTIES(Visible, FontColor, FontSize, Font Family, Text Spelling, Button Position,
				Button Padding, Button Shadow, Button BG Color, Button Border Color, Button Curser Point, Button Opacity, Button Height
				Button Width, Button Font-weight)*/
		UI.addsbumodelsavebutton();
		
		//Step5: Enter the excel sheet data into popup window form
		PageFactory.initElements(driver, table);
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\qdms-auto\\automation\\QDMS-AUTOMATION\\src\\test\\resources\\Excel-sheets\\QDMS.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); 
		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			
			//Step6: Enter the value on Sub Business Unit:
			AddSbuFunPage.SBUtext.sendKeys(sbu);
			
			//Step7: Enter the value on Description:
			AddSbuFunPage.SBUdestext.sendKeys(description);
			
			//Step8: Click on Add SBU Popup Window Save Button
//			Thread.sleep(3000);
//			AddSbuFunPage.SBU.click();
			
			
		}
		
			
		}
		
	
	//Click on Add SBU Popup Window Save Button
	@AfterTest	 
	public static void clicksave () throws InterruptedException {
		
		PageFactory.initElements(driver, table);
		Thread.sleep(2000);
		
		//Step9: Click on Add SBU Popup Window Save Button
		AddSbuFunPage.SBUsavebutton.click();
	}

}

