package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.AddSbuUIPage;

public class AddSbuUITest extends DriverIntialization
{
	static AddSbuUIPage table = new AddSbuUIPage();
	@Test
	public static void Menu() throws InterruptedException {

		PageFactory.initElements(driver, table);
		//login 
		AddSbuUIPage.Username.sendKeys("admin");
		AddSbuUIPage.Password.sendKeys("tokyo@admin");
		AddSbuUIPage.LoginButton.click();
		
		//Click on Master card
		Thread.sleep(4000);
		AddSbuUIPage.master.click();
		
		//Click on Sub Business Unit button
		Thread.sleep(3000);
		AddSbuUIPage.sbutable.click();

}
	
	
	//****************** Add SBU Button

	//Add SBU Button Text Visible
	@Test
	public void addsbubutton() throws InterruptedException 
	{
		 testCase = extent.createTest("Step1:- ADD-SBU-BUTTON UI PROPERTIES");
			try {
				boolean ExpectedTextVisible=true;
				System.out.println("IsVisible");
				boolean ActualTextVisible=AddSbuUIPage.AddSBUbutton.isDisplayed();
				testCase = extent.createTest("1-ADD-SBU-VISIBLE");
				try {
					Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
					testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
					testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
					testCase.log(Status.PASS, " Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
					testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
					testCase.log(Status.FAIL, "Wrong");
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("1-VISIBLE");
				testCase.log(Status.FAIL, "No element");
			}
	


	//Add SBU Button FONT COLOR
	
			try {	
				String ActualTitleFontColor = AddSbuUIPage.AddSBUbutton.getCssValue("color");
				System.out.println("Font color of button: " + ActualTitleFontColor);
				String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
				testCase = extent.createTest("2.ADD-SBU-FONT-COLOUR");
				
				try {
				  AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "Correct font Colour");
				  testCase.log(Status.PASS, "Correct font Colour");
				
				} catch(AssertionError e){
				  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "wrong font Colour");
				  testCase.log(Status.FAIL, "wrong font Colour");
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("2.ADD SBU-FONT-COLOUR");
				testCase.log(Status.FAIL, "No element");
			}
	
	//Add SBU Button FONTSIZE
	
		
		try {
					String ActualTitleFontsSize = AddSbuUIPage.AddSBUbutton.getCssValue("font-size");
					System.out.println("Font Size: " + ActualTitleFontsSize);
					String ExpectedTitleFontsSize = "14px";
					testCase = extent.createTest("3.ADD SBU-FONT- SIZE");
				try{
				  AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
				  testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
				  testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
				  testCase.log(Status.PASS, "Correct font-size");
				  testCase.log(Status.PASS, " Font-size Correct");
				}catch(AssertionError e) {
				  testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
				  testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
				  testCase.log(Status.INFO, "Wrong font-size");
				  testCase.log(Status.FAIL, "Font-size Wrong");
				
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("3.ADD SBU FONT- SIZE");
				testCase.log(Status.FAIL, "No Element");
			}
	

	//Add SBU Button Font Family 
	
			try {
				String ActualElementfamily = AddSbuUIPage.AddSBUbutton.getCssValue("font-family");
				System.out.println("FONT-FAMILY: "+ActualElementfamily);
				String ExpectedElementFamily = "Roboto, sans-serif";
				testCase = extent.createTest("4.ADD-SBU-FONT-FAMILY");
			try {
				  Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
				  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				  testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				  testCase.log(Status.FAIL, "wrong Text");
			}
			}
			catch(Exception e) {
				testCase = extent.createTest("4.FONT-FAMILY");
				 testCase.log(Status.FAIL, "NO ELEMENT");
			}
	


	//Add SBU Button Spelling	
	
		try {
				  String AcctualTitleText = AddSbuUIPage.AddSBUbutton.getText();
				  String ExpectedTitleText = "Add SBU";
				  System.out.println(" Text:" + AcctualTitleText);
				  testCase = extent.createTest("5.ADD-SBU-SPELLING-TEXT");
			  try {
			
			      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
			      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
			
			      testCase.log(Status.PASS, "Correct element");
			  } catch(AssertionError e) {
			      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
			      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
			 
			      testCase.log(Status.FAIL, "Wrong Element");
			  }
			} catch (Exception e) {
				  testCase = extent.createTest("5.ADD-SPU-SPELLING-TEXT");
				  testCase.log(Status.FAIL, "No Element");
			}
	
	//Add SBU Button Position
	
			try {
					Point ActulalLocation = AddSbuUIPage.AddSBUbutton.getLocation();        
					int actual_x = ActulalLocation.getX();
					int actual_y = ActulalLocation.getY();
					System.out.println("X axis: " + actual_x);
					System.out.println("Y axis: " + actual_y);
					Point ExpectedLocation = new Point(588, 93);
				
				testCase = extent.createTest("6.ADD-SBU-BUTTON-POSITION");
				try {
					  AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
					  testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
					  testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
					  testCase.log(Status.PASS, "Correct Location");
				} catch(AssertionError e){
					  testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
					  testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
					  testCase.log(Status.FAIL, "Wrong Location");
				}
			 }
			catch(Exception e) {
				 testCase = extent.createTest("6.POSITION");
				 testCase.log(Status.FAIL, "NO ELEMENT");
				
			} 
	
		
	//Add SBU Button Padding 
	
			try { 
						String Actualpadding = AddSbuUIPage.AddSBUbutton.getCssValue("padding");
						System.out.println("PADDING: "+Actualpadding);
						String Expectedpadding = "4px 15px";
						testCase = extent.createTest("7.ADD-SBU-TEXT PADDING");
					try {
						  Assert.assertEquals(Actualpadding, Expectedpadding);
						  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
						  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
						  testCase.log(Status.PASS, "padding is Correct");
					} catch (AssertionError e) {
						  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
						  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
						  testCase.log(Status.FAIL, "padding is Wrong");
					}
				}
			catch(Exception e) {
				 testCase = extent.createTest("7.SBU-PADDING");
				 testCase.log(Status.FAIL, "NO ELEMENT");
			}	 
	

		
	//Add SBU Button Shadow
	
	try {
			String Actualshadow = AddSbuUIPage.AddSBUbutton.getCssValue("box-shadow");
			System.out.println("Text Shadow :" + Actualshadow);
			String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";
			testCase = extent.createTest("8.ADD-SBU-BOX-SHADOW");
			try {
			  AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
			  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
			  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
			  testCase.log(Status.PASS, "Shadow available");
			} catch(AssertionError e){
			  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
			  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
			  testCase.log(Status.FAIL, "Shadow not available");
			}
		}
			catch(Exception e) {
				testCase = extent.createTest("8.BOX-SHADOW");
				testCase.log(Status.FAIL, "No Element");
			}
	

	//Add SBU Button BACKGROUND COLOR
	
	try {
			String Actualbackground = AddSbuUIPage.AddSBUbutton.getCssValue("color");
			System.out.println("BACKGROUND COLOR:" + Actualbackground);
			String Expectedbackground= "rgba(255, 255, 255, 1)";
			
			testCase = extent.createTest("9.ADD-SBU-BACKGROUND COLOR");
			try {
				AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
				
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
				testCase.log(Status.PASS, "correct");
			} catch(AssertionError e) {
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
				testCase.log(Status.FAIL, "wrong");
			}
		}
			catch(Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("9.BACKGROUND COLOR");
			}
		

	//Add SBU Button BORDER COLOR
			try {		 
					String actualbordercolor = AddSbuUIPage.AddSBUbutton.getCssValue("border-color");
					System.out.println(" border-color:" + actualbordercolor);
					String Expectedbordercolor = "rgb(255, 255, 255)";
					testCase = extent.createTest("10.ADD-SBU-BORDER-COLOR");
					try {
						AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
						testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
						testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e){
						testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
						testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
						testCase.log(Status.FAIL, "wrong");
					}
				}
				catch(Exception e) {
						testCase.log(Status.FAIL, "NO ELEMENT");
						testCase = extent.createTest("10.BORDER-COLOR");
					}
		 
		 
	//Add SBU Button CURSER POINT	 
	
			try {	 
					String ActualCursor = AddSbuUIPage.AddSBUbutton.getCssValue("cursor");
					System.out.println("cursor :" + ActualCursor);
					String Expectedcursor = "pointer";
					testCase = extent.createTest("11.ADD-SBU-CURSOR");
					try {
						AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
						testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
						testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
						testCase.log(Status.PASS, "correct");
					}  catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
						testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
						testCase.log(Status.FAIL, "wrong");
					}
				}
					catch(Exception e) {
						testCase.log(Status.FAIL, "No Element");
						testCase = extent.createTest("11.CURSOR");
					}
		 

		 
	//Add SBU Button OPACITY 
	
			try {
					String Actualopacity = AddSbuUIPage.AddSBUbutton.getCssValue("opacity");
					System.out.println("OPACITY :" + Actualopacity);
					
					String Expectedopacity = "1";
					testCase = extent.createTest("12.ADD-SBU-OPACITY");
					try {
						AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
						testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
						testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
						testCase.log(Status.PASS,  "correct");
					}
					catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
						testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
						testCase.log(Status.FAIL,  "wrong");
					}
				}
				catch (Exception e) {
						testCase = extent.createTest("12.OPACITY");
						testCase.log(Status.FAIL,  "No Element");
					}
			 
		
	//Add SBU Button HEIGHT
	
			try {	 
					String ActualHeight =AddSbuUIPage.AddSBUbutton.getCssValue("height");
					System.out.println("Height :" + ActualHeight);
					String ExpectedHeight = "32px";
					testCase = extent.createTest("13.ADD-SBU-HEIGHT");
					try {
						AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
						testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
						testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
						testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
						testCase.log(Status.FAIL, "wrong");
					}
				}
				catch(Exception e) {
						testCase = extent.createTest("13.HEIGHT");
						testCase.log(Status.FAIL, "No element");	
					}
		
	
		
	//Add SBU Button Width
	
			try {	 
					String Actualwidth =AddSbuUIPage.AddSBUbutton.getCssValue("width");
					System.out.println("width :" + Actualwidth);
				
					String Expectedwidth = "180px";
					testCase = extent.createTest("14.ADD-SBU-WIDTH");
					try {
						AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
						testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
						testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
						testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
						testCase.log(Status.FAIL, "wrong");
					}
			   }
			    catch(Exception e) {
					testCase = extent.createTest("14.WIDTH");
					testCase.log(Status.FAIL, "No element");	
				}
			
		

	//Add SBU Button Font-weight
	
			try {
					String Actualweight = AddSbuUIPage.AddSBUbutton.getCssValue("font-weight");
					System.out.println("16.Font-weight :" + Actualweight);
					String Expectedweight = "400";
					testCase = extent.createTest("15.ADD-SBU-FONT-WEIGHT");
					try {
						AssertJUnit.assertEquals(Actualweight, Expectedweight);
						testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
						testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
						testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
						testCase.log(Status.FAIL, "wrong");
					}
				} 
			catch(Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("15.FONT-WEIGHT");
			}
			Thread.sleep(2000);
			AddSbuUIPage.AddSBUbutton.click();
	}
	
	
//*********************************** Add SBU Model Window
	//Add SBU Button Popup Window Visible
 @Test
	public void addsbumodel() throws InterruptedException  
	{		
	 testCase = extent.createTest("Step2:- POPUP WINDOW UI PROPERTIES");
		//Model Window visible 
	 			Thread.sleep(2000);
			
				boolean AcctualVisible = AddSbuUIPage.addsbumodel.isDisplayed();
				boolean ExpectedVisible = true;

				testCase = extent.createTest("1-Model-Window-Visible");
				try {
					AssertJUnit.assertEquals(AcctualVisible, ExpectedVisible);
					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO, "Element Available");
					testCase.log(Status.PASS, "Correct element");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedVisible);
					testCase.log(Status.INFO, "Element not available");
					testCase.log(Status.FAIL, "No Element");
				}
				
				Thread.sleep(2000);

	// Model Window position 

				Point ActualLocation = AddSbuUIPage.addsbumodel.getLocation();

				int actual_x = ActualLocation.getX();
				int actual_y = ActualLocation.getY();

				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);

				Point ExpectedLocation = new Point(383, 100);

				testCase = extent.createTest("2-MODAL-POSITION");
				try {
					AssertJUnit.assertEquals(ActualLocation, ExpectedLocation);
					testCase.log(Status.INFO, "ActualFontSize :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
					testCase.log(Status.PASS, "Correct Location");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualLocation);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
					testCase.log(Status.FAIL, "Wrong Location");
				}
				
				Thread.sleep(2000);

	//Model Window size

				Dimension ActualSize = AddSbuUIPage.addsbumodel.getSize();
				System.out.println("Size : " + ActualSize);
				Dimension ExpectedSize = new Dimension(600, 230);

				testCase = extent.createTest("3-MODAL-SIZE");
				try {
					AssertJUnit.assertEquals(ActualSize, ExpectedSize);
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.PASS, "Correcrt size");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualSize);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedSize);
					testCase.log(Status.FAIL, "Wrong Size");
				}
			
				Thread.sleep(2000);

	// Model Window background-color

				String ActualButtonColor = AddSbuUIPage.addsbumodel.getCssValue("background-color");
				System.out.println("rgb :" + ActualButtonColor);
				String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

				testCase = extent.createTest("4-MODAL-BACKGROUND-COLOR");
				try {
					AssertJUnit.assertEquals(ActualButtonColor, ExpectedButtonColor);
					testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
					testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
					testCase.log(Status.PASS, "Correct Button Color");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualButtonColor :- " + ActualButtonColor);
					testCase.log(Status.INFO, "ExpectedButtonColor :- " + ExpectedButtonColor);
					testCase.log(Status.FAIL, "Wrong Button Color");
				}
				
				Thread.sleep(2000);

	// Model Window border-color
				
				String ActualBorderColor = AddSbuUIPage.addsbumodel.getCssValue("border-color");
				System.out.println("rgb :" + ActualBorderColor);
				String ExpectedBorderColor = "rgba(0, 0, 0, 0.85)";

				testCase = extent.createTest("5-MODAL-BORDER-COLOR");
				try {
					AssertJUnit.assertEquals(ActualBorderColor, ExpectedBorderColor);
					testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
					testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
					testCase.log(Status.PASS, "Correct Border Color");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualBorderColor :- " + ActualBorderColor);
					testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedBorderColor);
					testCase.log(Status.FAIL, "Wrong Border Color");
				}
				
				Thread.sleep(2000);

	// Model Window overflow

				String ActualOverflow = AddSbuUIPage.addsbumodel.getCssValue("overflow");
				System.out.println("overflow :" + ActualOverflow);
				String ExpectedOverflow = "visible";

				testCase = extent.createTest("6-MODAL-OVERFLOW-TYPE");
				try {
					AssertJUnit.assertEquals(ActualOverflow, ExpectedOverflow);
					testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
					testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
					testCase.log(Status.PASS, "Correct overflow");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualOverflow :- " + ActualOverflow);
					testCase.log(Status.INFO, "ExpectedOverflow :- " + ExpectedOverflow);
					testCase.log(Status.FAIL, "Wrong overflow");
				}
			
				Thread.sleep(2000);

	// Model element margin

				String ActualMargin = AddSbuUIPage.addsbumodel.getCssValue("margin");
				System.out.println("margin :" + ActualMargin);
				String ExpectedMargin = "0px";

				testCase = extent.createTest("7-MODAL-MARGIN-TYPE");
				try {
					AssertJUnit.assertEquals(ActualMargin, ExpectedMargin);
					testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
					testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
					testCase.log(Status.PASS, "Correct Margin");

				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualMargin :- " + ActualMargin);
					testCase.log(Status.INFO, "ExpectedMargin :- " + ExpectedMargin);
					testCase.log(Status.FAIL, "Wrong Margin");
				}
				
				Thread.sleep(2000);

	// ***** element cursor

				String ActualActions = AddSbuUIPage.addsbumodel.getCssValue("cursor");
				System.out.println("cursor :" + ActualActions);
				String ExpectedActions = "auto";

				testCase = extent.createTest("8-MODAL-CURSOR-TYPE");
				try {
					AssertJUnit.assertEquals(ActualActions, ExpectedActions);
					testCase.log(Status.INFO, "ActualFontSize :- " + ActualActions);
					testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedActions);
					testCase.log(Status.PASS, "correct cursor type");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualSize :- " + ActualActions);
					testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedActions);
					testCase.log(Status.FAIL, "wrong cursor type");
				}
				
				Thread.sleep(2000);

	// ***** element z-index

				String ActualZindex = AddSbuUIPage.addsbumodel.getCssValue("z-index");
				System.out.println("z-index :" + ActualZindex);
				String ExpectedZindex = "auto";

				testCase = extent.createTest("9-MODAL-Z-INDEX-TYPE");
				try {
					AssertJUnit.assertEquals(ActualZindex, ExpectedZindex);
					testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
					testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
					testCase.log(Status.PASS, "correct z-index  type");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualZindex :- " + ActualZindex);
					testCase.log(Status.INFO, "ExpectedZ-index :- " + ExpectedZindex);
					testCase.log(Status.FAIL, "wrong z-index type");
				}
				
				Thread.sleep(2000);
		
				
	//  click on outside of modal
				
//				Actions action = new Actions(driver);
//		        action.moveByOffset(0, 0).click().build().perform();
//		    	boolean AcctualAfterClick = AddSbuUIPage.addsbumodel.isDisplayed();
//				boolean ExpectedAfterClick = true;
//				
//				testCase = extent.createTest("010-MODAL-INVISIBLE-ONCLICK-OUTSIDE");
//				try {
//					AssertJUnit.assertEquals(AcctualAfterClick, ExpectedAfterClick);
//					testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClick);
//					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
//					testCase.log(Status.FAIL, "Modal visible ");
//				} catch (AssertionError e) {
//					testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
//					testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
//					testCase.log(Status.PASS, "Modal invisible");
//				}
//				
//				Thread.sleep(2000); 
//				
			}
 
 //**************** Add SBU Model Save Button
 
//Add SBU Model Save Button Text Visible
	@Test
	public void addsbumodelsavebutton() throws InterruptedException 
	{
		testCase = extent.createTest("Step3:- POPUP WINDOW SAVE BUTTON  UI PROPERTIES");
			try {
				boolean ExpectedTextVisible=true;
				System.out.println("IsVisible");
				boolean ActualTextVisible=AddSbuUIPage.AddSBUbutton.isDisplayed();
				testCase = extent.createTest("1-ADD-SBU-MODEL-SAVE-BUTTON-VISIBLE");
				try {
					Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
					testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
					testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
					testCase.log(Status.PASS, " Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
					testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
					testCase.log(Status.FAIL, "Wrong");
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("1-VISIBLE");
				testCase.log(Status.FAIL, "No element");
			}
	


	//Add SBU Model Save Button FONT COLOR
	
			try {	
				String ActualTitleFontColor = AddSbuUIPage.AddSBUbutton.getCssValue("color");
				System.out.println("Font color of button: " + ActualTitleFontColor);
				String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
				testCase = extent.createTest("2.ADD-SBU-MODEL-SAVE-BUTTON-FONT-COLOUR");
				
				try {
				  AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "Correct font Colour");
				  testCase.log(Status.PASS, "Correct font Colour");
				
				} catch(AssertionError e){
				  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				  testCase.log(Status.INFO, "wrong font Colour");
				  testCase.log(Status.FAIL, "wrong font Colour");
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("2.ADD-SBU-MODEL-SAVE-BUTTON-FONT-COLOUR");
				testCase.log(Status.FAIL, "No element");
			}
	
	//Add SBU Model Save Button FONTSIZE
	
		
		try {
					String ActualTitleFontsSize = AddSbuUIPage.AddSBUbutton.getCssValue("font-size");
					System.out.println("Font Size: " + ActualTitleFontsSize);
					String ExpectedTitleFontsSize = "14px";
					testCase = extent.createTest("3.ADD-SBU-MODEL-SAVE-BUTTON-FONT-SIZE");
				try{
				  AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
				  testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
				  testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
				  testCase.log(Status.PASS, "Correct font-size");
				  testCase.log(Status.PASS, " Font-size Correct");
				}catch(AssertionError e) {
				  testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
				  testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
				  testCase.log(Status.INFO, "Wrong font-size");
				  testCase.log(Status.FAIL, "Font-size Wrong");
				
				}
			}
			catch(Exception e) {
				testCase = extent.createTest("3.ADD-SBU-MODEL-SAVE-BUTTON-FONT-SIZE");
				testCase.log(Status.FAIL, "No Element");
			}
	

	//Add SBU Model Save Button Font Family 
	
			try {
				String ActualElementfamily = AddSbuUIPage.AddSBUbutton.getCssValue("font-family");
				System.out.println("FONT-FAMILY: "+ActualElementfamily);
				String ExpectedElementFamily = "Roboto, sans-serif";
				testCase = extent.createTest("4.ADD-SBU-MODEL-SAVE-BUTTON-FONT-FAMILY");
			try {
				  Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
				  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				  testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
				  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
				  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
				  testCase.log(Status.FAIL, "wrong Text");
			}
			}
			catch(Exception e) {
				testCase = extent.createTest("4.ADD-SBU-MODEL-SAVE-BUTTON-FONT-FAMILY");
				 testCase.log(Status.FAIL, "NO ELEMENT");
			}
	


	//Add SBU Model Save Button Spelling	
	
		try {
				  String AcctualTitleText = AddSbuUIPage.AddSBUbutton.getText();
				  String ExpectedTitleText = "Add SBU";
				  System.out.println(" Text:" + AcctualTitleText);
				  testCase = extent.createTest("5.ADD-SBU-MODEL-SAVE-BUTTON-SPELLING-TEXT");
			  try {
			
			      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
			      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
			
			      testCase.log(Status.PASS, "Correct element");
			  } catch(AssertionError e) {
			      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
			      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
			 
			      testCase.log(Status.FAIL, "Wrong Element");
			  }
			} catch (Exception e) {
				  testCase = extent.createTest("5.ADD-SBU-MODEL-SAVE-BUTTON-SPELLING-TEXT");
				  testCase.log(Status.FAIL, "No Element");
			}
	
	//Add SBU Model Save Button Position
	
			try {
					Point ActulalLocation = AddSbuUIPage.AddSBUbutton.getLocation();        
					int actual_x = ActulalLocation.getX();
					int actual_y = ActulalLocation.getY();
					System.out.println("X axis: " + actual_x);
					System.out.println("Y axis: " + actual_y);
					Point ExpectedLocation = new Point(588, 93);
				
				testCase = extent.createTest("6.ADD-SBU-MODEL-SAVE-BUTTON-POSITION");
				try {
					  AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
					  testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
					  testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
					  testCase.log(Status.PASS, "Correct Location");
				} catch(AssertionError e){
					  testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
					  testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
					  testCase.log(Status.FAIL, "Wrong Location");
				}
			 }
			catch(Exception e) {
				 testCase = extent.createTest("6.POSITION");
				 testCase.log(Status.FAIL, "NO ELEMENT");
				
			} 
	
		
	//Add SBU Model Save Button Padding 
	
			try { 
						String Actualpadding = AddSbuUIPage.AddSBUbutton.getCssValue("padding");
						System.out.println("PADDING: "+Actualpadding);
						String Expectedpadding = "4px 15px";
						testCase = extent.createTest("7.ADD-SBU-MODEL-SAVE-BUTTON-TEXT-PADDING");
					try {
						  Assert.assertEquals(Actualpadding, Expectedpadding);
						  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
						  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
						  testCase.log(Status.PASS, "padding is Correct");
					} catch (AssertionError e) {
						  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
						  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
						  testCase.log(Status.FAIL, "padding is Wrong");
					}
				}
			catch(Exception e) {
				 testCase = extent.createTest("7.SBU-PADDING");
				 testCase.log(Status.FAIL, "NO ELEMENT");
			}	 
	

		
	//Add SBU Model Save Button Shadow
	
	try {
			String Actualshadow = AddSbuUIPage.AddSBUbutton.getCssValue("box-shadow");
			System.out.println("Text Shadow :" + Actualshadow);
			String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";
			testCase = extent.createTest("8.ADD-SBU-MODEL-SAVE-BUTTON-BOX-SHADOW");
			try {
			  AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
			  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
			  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
			  testCase.log(Status.PASS, "Shadow available");
			} catch(AssertionError e){
			  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
			  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
			  testCase.log(Status.FAIL, "Shadow not available");
			}
		}
			catch(Exception e) {
				testCase = extent.createTest("8.BOX-SHADOW");
				testCase.log(Status.FAIL, "No Element");
			}
	

	//Add SBU Model Save Button BACKGROUND COLOR
	
	try {
			String Actualbackground = AddSbuUIPage.AddSBUbutton.getCssValue("color");
			System.out.println("BACKGROUND COLOR:" + Actualbackground);
			String Expectedbackground= "rgba(255, 255, 255, 1)";
			
			testCase = extent.createTest("9.ADD-SBU-MODEL-SAVE-BUTTON-BACKGROUND-COLOR");
			try {
				AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
				
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
				testCase.log(Status.PASS, "correct");
			} catch(AssertionError e) {
				testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
				testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
				testCase.log(Status.FAIL, "wrong");
			}
		}
			catch(Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("8.BACKGROUND COLOR");
			}
		

	//Add SBU Model Save Button BORDER COLOR
			try {		 
					String actualbordercolor = AddSbuUIPage.AddSBUbutton.getCssValue("border-color");
					System.out.println(" border-color:" + actualbordercolor);
					String Expectedbordercolor = "rgb(255, 255, 255)";
					testCase = extent.createTest("9.ADD-SBU-MODEL-SAVE-BUTTON-BORDER-COLOR");
					try {
						AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
						testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
						testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e){
						testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
						testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
						testCase.log(Status.FAIL, "wrong");
					}
				}
				catch(Exception e) {
						testCase.log(Status.FAIL, "NO ELEMENT");
						testCase = extent.createTest("9.BORDER-COLOR");
					}
		 
		 
	//Add SBU Model Save Button CURSER POINT	 
	
			try {	 
					String ActualCursor = AddSbuUIPage.AddSBUbutton.getCssValue("cursor");
					System.out.println("cursor :" + ActualCursor);
					String Expectedcursor = "pointer";
					testCase = extent.createTest("10.ADD-SBU-MODEL-SAVE-BUTTON-CURSOR");
					try {
						AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
						testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
						testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
						testCase.log(Status.PASS, "correct");
					}  catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
						testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
						testCase.log(Status.FAIL, "wrong");
					}
				}
					catch(Exception e) {
						testCase.log(Status.FAIL, "No Element");
						testCase = extent.createTest("10.CURSOR");
					}
		 

		 
	//Add SBU Model Save Button OPACITY 
	
			try {
					String Actualopacity = AddSbuUIPage.AddSBUbutton.getCssValue("opacity");
					System.out.println("OPACITY :" + Actualopacity);
					
					String Expectedopacity = "1";
					testCase = extent.createTest("11.ADD-SBU-MODEL-SAVE-BUTTON-OPACITY");
					try {
						AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
						testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
						testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
						testCase.log(Status.PASS,  "correct");
					}
					catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
						testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
						testCase.log(Status.FAIL,  "wrong");
					}
				}
				catch (Exception e) {
						testCase = extent.createTest("11.OPACITY");
						testCase.log(Status.FAIL,  "No Element");
					}
			 
		
	//Add SBU Model Save Button HEIGHT
	
			try {	 
					String ActualHeight =AddSbuUIPage.AddSBUbutton.getCssValue("height");
					System.out.println("Height :" + ActualHeight);
					String ExpectedHeight = "32px";
					testCase = extent.createTest("12.ADD-SBU-MODEL-SAVE-BUTTON-HEIGHT");
					try {
						AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
						testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
						testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
						testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
						testCase.log(Status.FAIL, "wrong");
					}
				}
				catch(Exception e) {
						testCase = extent.createTest("12.HEIGHT");
						testCase.log(Status.FAIL, "No element");	
					}
		
	
		
	//Add SBU Model Save Button HEIGHT
	
			try {	 
					String Actualwidth =AddSbuUIPage.AddSBUbutton.getCssValue("width");
					System.out.println("width :" + Actualwidth);
				
					String Expectedwidth = "180px";
					testCase = extent.createTest("13.ADD-SBU-MODEL-SAVE-BUTTON-WIDTH");
					try {
						AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
						testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
						testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
						testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
						testCase.log(Status.FAIL, "wrong");
					}
			   }
			    catch(Exception e) {
					testCase = extent.createTest("13.WIDTH");
					testCase.log(Status.FAIL, "No element");	
				}
			
		

	//Add SBU Model Save Button Font-weight
	
			try {
					String Actualweight = AddSbuUIPage.AddSBUbutton.getCssValue("font-weight");
					System.out.println("16.Font-weight :" + Actualweight);
					String Expectedweight = "400";
					testCase = extent.createTest("14.ADD-SBU-MODEL-SAVE-BUTTON-FONT-WEIGHT");
					try {
						AssertJUnit.assertEquals(Actualweight, Expectedweight);
						testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
						testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
						testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
						testCase.log(Status.FAIL, "wrong");
					}
				} 
			catch(Exception e) {
				testCase.log(Status.FAIL, "No Element");
				testCase = extent.createTest("14.FONT-WEIGHT");
			}
		
	}
	

	
//STEP-7 CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE
//LAST-ADDED-DATA
 @Test
 public static  void checkLastAddvalue() throws InterruptedException{

				
		Thread.sleep(2000);
		String actualdata = AddSbuUIPage.tablerow.getText();
		System.out.println("First row of table : " + actualdata);

		
		String expecteddata = AddSbuFunTest.sbu;
		System.out.println("expecteddata");

		
		testCase = extent.createTest("1.CHECK THE ENTERED VALUE HAS SAVED IN FIRST OF THE TABLE");
		try {
			AssertJUnit.assertEquals(actualdata, expecteddata);
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);
			testCase.log(Status.PASS, "Correct last added data");

		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Data :- " + actualdata);
			testCase.log(Status.INFO, "Expected Data :- " + expecteddata);
			testCase.log(Status.FAIL, "Wrong last added data");
		}
	}
	
}
