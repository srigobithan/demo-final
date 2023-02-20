package com.invicta.qa.pages.sbu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSbuUIPage {

	    //User Name
		@FindBy(id = "usernameOrEmail")
		public static WebElement Username;
		
		//password
		@FindBy(id = "password")
		public static WebElement Password;
		
		//Login Button
		@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
		public static WebElement LoginButton;
		
		//Master card
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div")
		public static WebElement master;
		
		//Sub Business Units button
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]")
		public static WebElement sbutable;
		
		//Sub Business Units test
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[1]")
		public static WebElement subbusiness;
		
		//Table bg-Box
		@FindBy(xpath = "//*[@class=\"ant-table-wrapper sc-jzJRlG jLFQHD plantManageTable\"]")
		public static WebElement tablebox;
		
		// edit button
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[1]")
		public static WebElement editbutton ;
		
		// delete button
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[3]/span/a[2]")
		public static WebElement deletebutton;
		
		// Description button
		@FindBy(xpath = "//tbody[@class='ant-table-tbody']/tr[2]/td[2]/div/span")
		public static WebElement descriptionbutton;
		
		// Description button
		@FindBy(xpath = "//div[@class=\"ant-modal-content\"]")
		public static WebElement descriptionmodel;
		
		// model title
		@FindBy(xpath = "//div[@class=\"ant-modal-title\"][@id=\"rcDialogTitle0\"]")
		public static WebElement modeltitle;
			
		// model detail text
		@FindBy(xpath = "//div[@class=\"ant-modal-body\"]/p")
		public static WebElement modeldetailtext;
			
		// Tabel row
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]")
		public static WebElement tabelrow;
			
		// Search Button
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/table/thead/tr/th[1]/div/span[2]")
		public static WebElement searchbutton;
			
		@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[2]/div/div/div/div/div/div[1]/div/div[2]/button")
		public static WebElement AddSBUbutton;
		
		//model cancel button
		@FindBy(xpath = "//button[@type=\"button\"][@class=\"ant-btn ant-btn-ghost sc-gZMcBi dMdnOw\"]")
		public static WebElement modelcancelbutton;
		
		//model cancel icon
		@FindBy(xpath = "//button[@type=\"button\"]/span[@class=\"ant-modal-close-x\"]/span[@class=\"anticon anticon-close ant-modal-close-icon\"]")
		public static WebElement modelcancelicon;
		
		//Add SBU Button model window
		@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]")
		public static WebElement addsbumodel;


		
	}
