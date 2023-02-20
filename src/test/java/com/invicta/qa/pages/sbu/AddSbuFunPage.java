package com.invicta.qa.pages.sbu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddSbuFunPage {


	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div/div[1]/a/div")
	public static WebElement master;
	
	@FindBy(xpath = "//button[@type=\"button\"][@class=\"ant-btn sc-gZMcBi dMdnOw\"]")
	public static WebElement SBU;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/section/section/main/div/div/div[1]/div/div[1]")
	public static WebElement sbutable;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")
	public static WebElement AddSBU;
	
	@FindBy(id = "sub_business_unit")
	public static WebElement SBUtext;
	
	@FindBy(id = "description")
	public static WebElement SBUdestext;
	
	@FindBy(xpath = "//div[@class=\"ant-modal-footer\"]/div/button[@type=\"button\"][@class=\"ant-btn sc-gZMcBi dMdnOw\"]")
	public static WebElement SBUsavebutton;
	
		
	@FindBy(xpath = "//*[@id=\"rcDialogTitle0\"]/div/span")
	public static WebElement SBUclose;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]/span")
	public static WebElement SBUsavefont;
	
	@FindBy(xpath = "//*[@id=\"sub_business_unit\"]")
	public static WebElement SBUplaceholder;
	
	@FindBy(xpath = "//*[@id=\"description\"]")
	public static WebElement Desplaceholder;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]")
	public static WebElement sbumodal;
	
	@FindBy(id = "usernameOrEmail")
	public static WebElement Username;
	
	@FindBy(id = "password")
	public static WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div/div[3]/div/div/span/button")
	public static WebElement LoginButton;
	
}
