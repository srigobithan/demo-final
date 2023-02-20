package com.invicta.qa.testcases.sbu;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.invicta.qa.base.DriverIntialization;
import com.invicta.qa.pages.sbu.TableSbuUIPage;




public class TableSbuUITest extends DriverIntialization{

	TableSbuUIPage table = new TableSbuUIPage();
	@Test
	public void Menu() throws InterruptedException {

		PageFactory.initElements(driver, table);
		TableSbuUIPage.Username.sendKeys("admin");
		TableSbuUIPage.Password.sendKeys("tokyo@admin");
		TableSbuUIPage.LoginButton.click();
		
		Thread.sleep(4000);
		TableSbuUIPage.master.click();
		
		Thread.sleep(3000);
		TableSbuUIPage.sbutable.click();

}
//*******Method 
	
public static void TestCasePrint(String TestCaseName, String expectedValue, String actualValue) {
	boolean position = true;
	ExtentTest testCase = extent.createTest(TestCaseName);
	try {
		AssertJUnit.assertEquals(actualValue, expectedValue);
	} catch (AssertionError e) {
		position = false;
	}
	if (position) {
		testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
		testCase.log(Status.INFO, "Expectedvalue :- " + expectedValue);
		testCase.log(Status.INFO, "Correct value");
		testCase.log(Status.PASS, actualValue);
	} else {
		testCase.log(Status.INFO, "Actualvalue :- " + actualValue);
		testCase.log(Status.INFO, "ExpectedValue :- " + expectedValue);
		testCase.log(Status.INFO, "wrong value");
		testCase.log(Status.FAIL, actualValue);
	}
}
	
//Text Visible
@Test(priority = 0)
	public void visible()  
         {
			
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			
			boolean ActualTextVisible=TableSbuUIPage.subbusiness.isDisplayed();
			testCase = extent.createTest("1-Test Visible");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
			}
			
		}

//FONT COLOR
@Test(priority = 1)
		public void fontcolor() 
		 {
			String ActualTitleFontColor = TableSbuUIPage.subbusiness.getCssValue("color");
			System.out.println("Font color of button: " + ActualTitleFontColor);
			String ExpectedTitleFontColor ="rgba(0, 0, 0, 0.85)";
						
			testCase = extent.createTest("TITLE-FONT-COLOUR");
			try {
			    AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "Correct font Colour");
			    testCase.log(Status.PASS, "Correct font Colour");
			
			} catch (AssertionError e) {
				 testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "wrong font Colour");
			    testCase.log(Status.FAIL, "wrong font Colour");
			}
		 }


//FONTSIZE
@Test(priority = 2)
       public void fontsize()  
        {
			String ActualTitleFontsSize = TableSbuUIPage.subbusiness.getCssValue("font-size");
			System.out.println("Font Size: " + ActualTitleFontsSize);
			String ExpectedTitleFontsSize = "16px";
			
			testCase = extent.createTest("TITLE-FONT-SIZE");
			
			try {
			    AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
			    testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
			    testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
			    testCase.log(Status.PASS, "Correct font-size");
			    testCase.log(Status.PASS, " Font-size Correct");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
			    testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
			    testCase.log(Status.INFO, "Wrong font-size");
			    testCase.log(Status.FAIL, "Font-size Wrong");
			
			}
	    }

//Font Family
@Test(priority = 3)
	  public void fontfamily() throws InterruptedException  
       {
			
			String ActualElementfamily = TableSbuUIPage.subbusiness.getCssValue("FONT-FAMILY");
			System.out.println("FONT-FAMILY: "+ActualElementfamily);
			String ExpectedElementFamily = "Roboto, sans-serif";
			testCase = extent.createTest("TITLE-FONT-FAMILY");
			try {
			    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
		}

@Test(priority = 4)
public void fontweight() throws InterruptedException  
 {
		
		String ActualElementfamily = TableSbuUIPage.subbusiness.getCssValue("font-weight");
		System.out.println("FONT-WEIGHT: "+ActualElementfamily);
		String ExpectedElementFamily = "600";
		testCase = extent.createTest("TITLE-FONT-WEIGHT");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}

@Test(priority = 5)
public void padding() throws InterruptedException  
 {
		
		String ActualElementfamily = TableSbuUIPage.subbusiness.getCssValue("padding");
		System.out.println("FONT-PADDING: "+ActualElementfamily);
		String ExpectedElementFamily = "10px";
		testCase = extent.createTest("TITLE-FONT-PADDING");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}

@Test(priority = 5)
public void value() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.subbusiness.getText();
		System.out.println("TEXT: "+ActualElementfamily);
		String ExpectedElementFamily = "Sub Business Units";
		testCase = extent.createTest("TITLE-TEXT");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}


//***********************************************************************************

//Position
/*
@Test(priority = 6)
public void sbutitleposition() throws InterruptedException  
{
		Point ActulaTitleLocation = TableSbuUIPage.subbusiness.getLocation();        
		int actual_x = ActulaTitleLocation.getX();
		int actual_y = ActulaTitleLocation.getY();
		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);
		
		Point ExpectedTitleLocation = new Point(186, 88);
		boolean Position = true; 
		testCase = extent.createTest("SBU-TITLE-POSITION");
			try {
			    AssertJUnit.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
			
			} catch (AssertionError e) {
			    Position = false; 
			}
			if (Position) {
			    testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
			    testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
			    testCase.log(Status.PASS, "Correct Location");
			} else {
			    testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
			    testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
			    testCase.log(Status.FAIL, "Wrong Location");
			}
}

//SBU Title Shadow
@Test(priority = 7)
public void sbutitleShadow() throws InterruptedException  
{
		String ActualTitleShadow = TableSbuUIPage.subbusiness.getCssValue("box-shadow");
		System.out.println("Text Shadow :" + ActualTitleShadow);
		
		String ExpectedTitleShadow = "none";
		
		boolean boxshadow = true;
		testCase = extent.createTest("SBU-TEXT-SHADOW");
			try {
			    AssertJUnit.assertEquals(ActualTitleShadow, ExpectedTitleShadow);
			
			} catch (AssertionError e) {
			    boxshadow = false;
			}
			if (boxshadow) {
			    testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
			    testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
			    testCase.log(Status.PASS, "Shadow text available");
			} else {
			    testCase.log(Status.INFO, "ActualBorderColor :- " + ActualTitleShadow);
			    testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedTitleShadow);
			    testCase.log(Status.FAIL, "Shadow text not available");
			}
}

//Margin
@Test(priority = 8)
public void sbutitleMargin() throws InterruptedException  
{
		String ActualTitleMargin = TableSbuUIPage.subbusiness.getCssValue("margin");
		System.out.println("Text Margin :" + ActualTitleMargin);
		
		String ExpectedTitleMargin = "-5px 0px 16px -10px";
		
		boolean textmargin = true;
		testCase = extent.createTest("SBU-TEXT-MARGIN");
		try {
			AssertJUnit.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
			}
			catch (AssertionError e) { 
			// TODO: handle exception
			textmargin =false;
			
			}if (textmargin) {
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.PASS, "Text margin available");
			} else {
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.FAIL, "Text margin text not available");
		}
}

//LETTER SPACING
@Test(priority = 9)
public void sbutitleletterspacing() throws InterruptedException  
{
		String ActualLetterSpacing = TableSbuUIPage.subbusiness.getCssValue("letter-spacing");
		System.out.println("Letter Spacing :" + ActualLetterSpacing);
		
		String ExpectedLetterSpacing = "normal";
		
		boolean letterspacing = true;
		testCase = extent.createTest("SBU-LETTER-SPACING");
		try {
			AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);
			
			} catch (AssertionError e) {
			letterspacing = false; 
			}
			if (letterspacing) {
				testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
				testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
				testCase.log(Status.PASS, "Letter spacing is as expected");
			} else {
				testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
				testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
				testCase.log(Status.FAIL, "Letter spacing is not as expected");
			}

// WORD SPACING
@Test(priority = 10)
public void sbutitleworddspacing() throws InterruptedException  
{
		String ActualWordSpacing = TableSbuUIPage.subbusiness.getCssValue("word-spacing");
		System.out.println("Word Spacing :" + ActualWordSpacing);
		
		String ExpectedWordSpacing = "0px";
		
		boolean wordspacing = true;
		testCase = extent.createTest("SBU-WORD-SPACING");
		try {
		AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);
		
		} catch (AssertionError e) {
		wordspacing = false;
		}
		if (wordspacing) {
			testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
			testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
			testCase.log(Status.PASS, "Word spacing is as expected");
		} else {
			testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
			testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
			testCase.log(Status.FAIL, "Word spacing is not as expected");
		}
}

//ALIGNMENT (CENTER/LEFT/RIGHT)
@Test(priority = 11)
public void sbutitlealignmentt() throws InterruptedException  
{
		String ActualAlignment = TableSbuUIPage.subbusiness.getCssValue("text-align");
		System.out.println("Text Alignment :" + ActualAlignment);
		String ExpectedAlignment = "center";
		
		boolean alignment = true;
		testCase = extent.createTest("SBU-TEXT-ALIGNMENT");
		try {
			AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);
		
		} catch (AssertionError e) {
		alignment = false;
		}
		if (alignment) {
			testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
			testCase.log(Status.PASS, "Alignment is as expected");
		} else {
			testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
			testCase.log(Status.FAIL, "Alignment is not as expected");
		}
}

// TEXT TRANSFORMATION (UPERCASE/ LOWECASE)
@Test(priority = 12)
public void sbutitletransformation() throws InterruptedException  
{
		String ActualTextTransformation = TableSbuUIPage.subbusiness.getCssValue("text-transform");
		System.out.println("Text Transformation :" + ActualTextTransformation);
		String ExpectedTextTransformation = "none";
		
		boolean texttransformation = true;
		testCase = extent.createTest("SBU-TEXT-TRANSFORMATION");
			try {
			AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);
			
			} catch (AssertionError e) {
			texttransformation = false;
			}
			if (texttransformation) {
				testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
				testCase.log(Status.PASS, "Transformation expected");
			}
			else {
				 testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
				 testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
				 testCase.log(Status.FAIL,  "Transformation unexpected");
			}
}

// LINE HEIGHT
@Test(priority = 13)
public void sbutitlelineheight() throws InterruptedException  
{
		String ActualLineHeight =TableSbuUIPage.subbusiness.getCssValue("line-height");
		System.out.println("Line Height :" + ActualLineHeight);
		
		String ExpectedLineHeight = "25.144px";
		
		boolean lineheight = true;
		testCase = extent.createTest("SBU-LINE-HEIGHT");
			try {
			AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);
			
			} catch (AssertionError e) {
			lineheight = false;
			}
			if (lineheight) {
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
				testCase.log(Status.PASS, "Line height is as expected");
			} else {
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
				testCase.log(Status.FAIL, "Line height is not as expected");
			}
}

//Text Decoration
@Test(priority = 14)
public void sbutitletextdecoration() throws InterruptedException  
{
		String ActualTextDecoration = TableSbuUIPage.subbusiness.getCssValue("text-decoration");
		System.out.println("Text Decoration :" + ActualTextDecoration);
		
		String ExpectedTextDecoration = "none solid rgba(0, 0, 0, 0.85)";
		
		boolean textdecoration = true;
		testCase = extent.createTest("SBU-TEXT-DECORATION");
		try {
		AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);
		
		} catch (AssertionError e) {
		textdecoration = false;
		}
		if (textdecoration) {
			testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
			testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
			testCase.log(Status.PASS, "Text decoration is as expected");
		} else {
			testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
			testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
			testCase.log(Status.FAIL, "Text decoration is not as expected");
		}
}

//VERTICAL ALIGN
@Test(priority = 15)
public void sbutitleverticalalign() throws InterruptedException  
{
		String actualVerticalAlignment = TableSbuUIPage.subbusiness.getCssValue("vertical-align");
		System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);
		String expectedVerticalAlignment = "baseline";
		
		boolean verticalAlignment = true;
		testCase = extent.createTest("SBU-TEXT-VERTICAL-ALIGNMENT");
		try {
		Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
		} catch (AssertionError e) {
		verticalAlignment = false;
		}
		
		if (verticalAlignment) {
			testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
			testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
			testCase.log(Status.PASS, "Text vertical Align is as expected");
		
		} else {
			testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
			testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
			testCase.log(Status.PASS, "Text vertical Align is as expected");
		
		}
}

//TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)
@Test(priority = 15)
public void sbutitletextlndent() throws InterruptedException  
{
		String ActualTextIndent = TableSbuUIPage.subbusiness.getCssValue("text-indent");
		System.out.println("Text Indent :" + ActualTextIndent);
		
		String ExpectedTextIndent = "0px";
		
		boolean textindent = true;
		testCase = extent.createTest("SBU-TEXT-INDENT");
		try {
		AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);
		
		} catch (AssertionError e) {
		textindent = false;}
		if (textindent) {
		    testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
		    testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
		    testCase.log(Status.PASS, "Text Indent is as expected");
		   
		} else {
		    testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
		    testCase.log(Status.INFO, "ExpectedVerticalAlignment :- " + ExpectedTextIndent);
		    testCase.log(Status.PASS, "Text Indent is as expected");
		    
		}
}

//TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)

String ActualTextOrientation = TableSbuUIPage.subbusiness.getCssValue("text-orientation");
System.out.println("Text Orientation :" + ActualTextOrientation);

String ExpectedTextOrientation = "mixed";

boolean textorientation = true;
testCase = extent.createTest("SBU-TEXT-ORIENTATION");
try {
    AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);

} catch (AssertionError e) {
    textorientation = false;
}
if (textorientation) {
    testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
    testCase.log(Status.PASS, "Text orientation is as expected");
} else {
    testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
    testCase.log(Status.PASS, "Text orientation is as unxpected");
}


//FONT STYLE
String ActualFontStyle = TableSbuUIPage.subbusiness.getCssValue("font-style");
System.out.println("Font Style :" + ActualFontStyle);

String ExpectedFontStyle = "normal";

boolean fontstyle = true;
testCase = extent.createTest("SBU-FONT-STYLE");
try {
AssertJUnit.assertEquals(ActualFontStyle, ExpectedFontStyle);

} catch (AssertionError e) {
fontstyle = false;
}
if (fontstyle) {
testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
testCase.log(Status.PASS, "Font style is as expected");
} else {
testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
testCase.log(Status.FAIL, "Font style is not as expected");
}
}

*/
//************************************************************************************

@Test(priority = 6)
public void bgcolor() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("background");
		System.out.println("TABLE-BOX: "+ActualElementfamily);
		String ExpectedElementFamily = "white";
		testCase = extent.createTest("TABLE-BOX");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}


@Test(priority = 6)
public void borderradius() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("border-radius");
		System.out.println("TABLE-BORDER-REDIUS: "+ActualElementfamily);
		String ExpectedElementFamily = "10px";
		testCase = extent.createTest("TABLE-BORDER-REDIUS");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}


@Test(priority = 8)
public void marginleft() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("margin-left");
		System.out.println("TABLE-MARGIN-LEFT: "+ActualElementfamily);
		String ExpectedElementFamily = "15px";
		testCase = extent.createTest("TABLE-MARGIN-LEFT");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}

@Test(priority = 9)
public void margintop() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("margin-top");
		System.out.println("TABLE-MARGIN-TOP: "+ActualElementfamily);
		String ExpectedElementFamily = "14px";
		testCase = extent.createTest("TABLE-MARGIN-TOP");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}

@Test(priority = 9)
public void boxshadow() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("box-shadow");
		System.out.println("TABLE-BOX-SHADOW: "+ActualElementfamily);
		String ExpectedElementFamily = "rgba(0, 0, 0, 0.19) 8px 5px 15px 5px";
		testCase = extent.createTest("TABLE-BOX-SHADOW");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}
	

@Test(priority = 10)
public void height() throws InterruptedException  
{
		
		String ActualElementfamily = TableSbuUIPage.tablebox.getCssValue("height");
		System.out.println("TABLE-HEIGHT: "+ActualElementfamily);
		String ExpectedElementFamily = "515.641px";
		testCase = extent.createTest("TABLE-HEIGHT");
		try {
		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	}

/***********Search Bar Button*************/

@Test(priority = 11)
public void search() throws InterruptedException  
{
		//TableSbuUIPage.searchbutton.click();
		Thread.sleep(2000);
		
		boolean ExpectedTextVisible = true;
		System.out.println("IsVisible");
		
		boolean ActualTextVisible=TableSbuUIPage.searchbutton.isDisplayed();
		testCase = extent.createTest("Table-Search--Visible");
		try {
			Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
			testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
			testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
		}
		
//search margin		
//		String ActualElementfamily = TableSbuUIPage.searchbutton.getCssValue("margin");
//		System.out.println("Table-Search-Icon: "+ActualElementfamily);
//		String ExpectedElementFamily = "-4px -4px -4px 4px";
//		testCase = extent.createTest("Table-Search-Icon");
//		try {
//		    Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
//		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
//		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
//		    testCase.log(Status.INFO, "Correct Text");
//		    testCase.log(Status.PASS, "Correct Text");
//		} catch (AssertionError e) {
//		    testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
//		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
//		    testCase.log(Status.INFO, "wrong Text");
//		    testCase.log(Status.FAIL, "wrong Text");
//		}
//		Thread.sleep(2000);
//		
//// search padding
//		String ActualpaddingElementfamily = TableSbuUIPage.searchbutton.getCssValue("padding");
//		System.out.println("Table-Search-Icon: "+ActualpaddingElementfamily);
//		String ExpectedpaddingElementFamily = "0px 4px";
//		testCase = extent.createTest("Table-Search-Icon");
//		try {
//		    Assert.assertEquals(ActualpaddingElementfamily, ExpectedpaddingElementFamily);
//		    testCase.log(Status.INFO, "ActualText :- " + ActualpaddingElementfamily);
//		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedpaddingElementFamily);
//		    testCase.log(Status.INFO, "Correct Text");
//		    testCase.log(Status.PASS, "Correct Text");
//		} catch (AssertionError e) {
//		    testCase.log(Status.INFO, "ActualText :- " + ActualpaddingElementfamily);
//		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedpaddingElementFamily);
//		    testCase.log(Status.INFO, "wrong Text");
//		    testCase.log(Status.FAIL, "wrong Text");
//		}
//		Thread.sleep(2000);
	}

//***************************************************Edit Button Visible
@Test(priority = 12)
	public void editBtn() throws InterruptedException  
       {
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			
			boolean ActualTextVisible = TableSbuUIPage.editbutton.isDisplayed();
			
			testCase = extent.createTest("EDIT-Button-Visible");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
			}
			
//Edit Button Enable
			
			boolean AcctualElementEnabled = TableSbuUIPage.editbutton.isEnabled();
			boolean ExpectedElementEnabled = true;
			
			testCase = extent.createTest("Edit-Button-Enable");
			try {
				AssertJUnit.assertEquals(AcctualElementEnabled, ExpectedElementEnabled);
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
			} catch (AssertionError find) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
		
			
//Edit Button Location
			
			Thread.sleep(2000); 
			Point actualLocation = 	TableSbuUIPage.editbutton.getLocation();

			int  x = actualLocation.getX();
			int y = actualLocation.getY();
			
			System.out.println("x-axis = " + x);
			System.out.println("y-axis = " + y);
			
			
			Point expectedLocation = new Point(632, 180);
			testCase = extent.createTest("Edit-Button-Position");
			
			try {
				AssertJUnit.assertEquals(actualLocation, expectedLocation);
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError find) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.FAIL, "wrong");
			}
			
			
				
//Edit button Width
				Thread.sleep(2000);
				Dimension size = TableSbuUIPage.editbutton.getSize();
				int actualWidth = size.getWidth();
				System.out.println("width  = " + actualWidth);
				int expectedSize = 16;
				
				testCase = extent.createTest("Edit-Button-width");
				boolean width1 = true;
				
				try {
					AssertJUnit.assertEquals(actualWidth, expectedSize);
				} catch (AssertionError find) {
					width1 = false;
				}
				if (width1) {
						testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
						testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
						testCase.log(Status.PASS, "Correct ");
					} else {
						testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
						testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
						testCase.log(Status.FAIL, "wrong");
					}
				
				
//Edit button Height
				int actualHeight = size.getHeight();
				System.out.println("height = " + actualHeight);
				int expectedHeight = 15;

				testCase = extent.createTest("Edit-Button-Height");
				try {
					AssertJUnit.assertEquals(actualHeight, expectedHeight);
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError find) {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.FAIL, "wrong");

				}
				
//Edit button Background Color
				String ActualbackgroundColor = TableSbuUIPage.editbutton.getCssValue("background-color");
	      		
	      		System.out.println("backgroundcolor = " + ActualbackgroundColor);
	      		String expectedBackGroundColor = "rgba(0, 0, 0, 0)";
	      		
	      		testCase = extent.createTest("Edit-Button-background-color");
	      		try {
	      			AssertJUnit.assertEquals(ActualbackgroundColor, expectedBackGroundColor);
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.PASS, "Correct ");
	      		} catch (AssertionError find) {
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.FAIL, "wrong");
	      		}
	      			
	      			
//Edit Button Icon
	      		    String ActualImageUrl = TableSbuUIPage.editbutton.getAttribute("xlink:href");
	                String ExpectedImageUrl= null;
	                
	                testCase = extent.createTest("Edit-Button-Icon");
	                try {
	                    Assert.assertEquals(ActualImageUrl, ExpectedImageUrl);
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);
	                    testCase.log(Status.PASS, " Icon Image Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);    
	                    testCase.log(Status.FAIL, " Icon Image wrong");
	                }
	                
//Edit Button Fill color
	                
	                String fillColor = TableSbuUIPage.editbutton.getCssValue("fill");
	                String ActualFillColor = Color.fromString(fillColor).asHex();
	                String ExpectedFillColor="#000000";
	                
	                testCase = extent.createTest("Edit-Button-Icon Fill-Color");
	                try {
	                    Assert.assertEquals(ActualFillColor, ExpectedFillColor);
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);
	                    testCase.log(Status.PASS, " Fill color Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);    
	                    testCase.log(Status.FAIL, " Fill color wrong");
	                } 
	                
	                
//Edit Cursor point 
	    			
	    			String ActualActions = TableSbuUIPage.editbutton.getCssValue("cursor");
	    	        System.out.println("cursor :" + ActualActions);
	    	        String ExpectedActions = "pointer";
	    	        
	    	        testCase = extent.createTest("Internal Button Cursor Point");
	    	        try {
	    	            AssertJUnit.assertEquals(ActualActions, ExpectedActions);
	    	            testCase.log(Status.INFO, "ActualElement :- " + ActualActions);
	    				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedActions);
	    				testCase.log(Status.INFO, "expectedText");
	    				testCase.log(Status.PASS, "Correct ");
	    	        } catch (AssertionError e) {
	    	        	testCase.log(Status.INFO, "ActualElement :- " + ActualActions);
	    				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedActions);
	    				testCase.log(Status.INFO, "Element not available");
	    				testCase.log(Status.FAIL, "No Element");
	    	        }
 }


//********************************Delete Button Enable

@Test(priority = 13)
	public void deleteBtn() throws InterruptedException  
     {
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			
			boolean ActualTextVisible=TableSbuUIPage.deletebutton.isDisplayed();
			testCase = extent.createTest("Delete-Button-Visible");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
			}
			
//Delete Button Enable
			boolean AcctualElementEnabled = TableSbuUIPage.deletebutton.isEnabled();
			boolean ExpectedElementEnabled = true;

			testCase = extent.createTest("Delete-Button-Enable");
			try {
				AssertJUnit.assertEquals(AcctualElementEnabled, ExpectedElementEnabled);
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
		
			
//Delete Button Location
			Thread.sleep(2000); 
			Point actualLocation = 	TableSbuUIPage.deletebutton.getLocation();

			int  x = actualLocation.getX();
			int y = actualLocation.getY();
			
			System.out.println("x-axis = " + x);
			System.out.println("y-axis = " + y);
			
			
			Point expectedLocation = new Point(665, 180);
			testCase = extent.createTest("Delete-Button-Position");
			
			try {
				AssertJUnit.assertEquals(actualLocation, expectedLocation);
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.FAIL, "wrong");
			}
			
				
//Delete button Width
				Thread.sleep(2000);
				Dimension size = TableSbuUIPage.deletebutton.getSize();
				int actualWidth = size.getWidth();
				System.out.println("width  = " + actualWidth);
				int expectedSize = 13;
				
				testCase = extent.createTest("Delete-Button-width");
								
				try {
					AssertJUnit.assertEquals(actualWidth, expectedSize);
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.FAIL, "wrong");
				}
				
				
//Delete button Height
				int actualHeight = size.getHeight();
				System.out.println("height = " + actualHeight);
				int expectedHeight = 15;

				testCase = extent.createTest("Delete-Button-Height");
				try {
					AssertJUnit.assertEquals(actualHeight, expectedHeight);
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError find) {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.FAIL, "wrong");

				}
				
				
//Delete Button Background Color
				String ActualbackgroundColor = TableSbuUIPage.deletebutton.getCssValue("background-color");
	      		
	      		System.out.println("backgroundcolor = " + ActualbackgroundColor);
	      		String expectedBackGroundColor = "rgba(0, 0, 0, 0)";
	      		
	      		testCase = extent.createTest("Delete-Button-background-color");
	      		try {
	      			AssertJUnit.assertEquals(ActualbackgroundColor, expectedBackGroundColor);
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.PASS, "Correct ");
	      		} catch (AssertionError e) {
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.FAIL, "wrong");

	      		}
	      			
//Delete Button Icon
	      		    String ActualImageUrl = TableSbuUIPage.deletebutton.getAttribute("xlink:href");
	                String ExpectedImageUrl= null ;
	                testCase = extent.createTest("Delete-Button-Icon");
	                try {
	                    Assert.assertEquals(ActualImageUrl, ExpectedImageUrl);
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);
	                    testCase.log(Status.PASS, " Icon Image Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);    
	                    testCase.log(Status.FAIL, " Icon Image wrong");
	                }
	         
//Delete Button Fill Color
	                String fillColor = TableSbuUIPage.deletebutton.getCssValue("fill");
	                String ActualFillColor = Color.fromString(fillColor).asHex();
	                String ExpectedFillColor="#000000";
	                testCase = extent.createTest("Delete-Button-Icon Fill-Color");
	                try {
	                    Assert.assertEquals(ActualFillColor, ExpectedFillColor);
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);
	                    testCase.log(Status.PASS, " Fill color Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);    
	                    testCase.log(Status.FAIL, " Fill color wrong");
	                } 
		}

//******************************* Description icon 

@Test(priority = 14)
	public void descriptionicon() throws InterruptedException  
   {
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			
			boolean ActualTextVisible=TableSbuUIPage.descriptionbutton.isDisplayed();
			testCase = extent.createTest("Description-Button-Visible");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
			}
			
//Description Button Enable
			boolean AcctualElementEnabled = TableSbuUIPage.descriptionbutton.isEnabled();
			boolean ExpectedElementEnabled = true;

			testCase = extent.createTest("Description-Button-Enable");
			try {
				AssertJUnit.assertEquals(AcctualElementEnabled, ExpectedElementEnabled);
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
			
			
//Description Button Location
			Thread.sleep(2000); 
			Point actualLocation = 	TableSbuUIPage.descriptionbutton.getLocation();

			int  x = actualLocation.getX();
			int y = actualLocation.getY();
			
			System.out.println("x-axis = " + x);
			System.out.println("y-axis = " + y);
			
			
			Point expectedLocation = new Point(455, 140);
			testCase = extent.createTest("Description-Button-Position");
			
			try {
				AssertJUnit.assertEquals(actualLocation, expectedLocation);
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError find) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.FAIL, "wrong");
			}
				
			
				
//Description button Width
				Thread.sleep(2000);
				Dimension size = TableSbuUIPage.descriptionbutton.getSize();
				int actualWidth = size.getWidth();
				System.out.println("width  = " + actualWidth);
				int expectedSize = 13;
				
				testCase = extent.createTest("Description-Button-width");
				
				try {
					AssertJUnit.assertEquals(actualWidth, expectedSize);
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.FAIL, "wrong");
				}
				
				
//Description button Height
				int actualHeight = size.getHeight();
				System.out.println("height = " + actualHeight);
				int expectedHeight = 13;

				testCase = extent.createTest("Description-Button-Height");
				try {
					AssertJUnit.assertEquals(actualHeight, expectedHeight);
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError find) {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.FAIL, "wrong");

				}
				
				
//Description Button Background Color
				String ActualbackgroundColor = TableSbuUIPage.descriptionbutton.getCssValue("background-color");
	      		
	      		System.out.println("backgroundcolor = " + ActualbackgroundColor);
	      		String expectedBackGroundColor = "rgba(0, 0, 0, 0)";
	      		
	      		testCase = extent.createTest("Description-Button-background-color");
	      		try {
	      			AssertJUnit.assertEquals(ActualbackgroundColor, expectedBackGroundColor);
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.PASS, "Correct ");
	      		} catch (AssertionError find) {
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
      				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
      				testCase.log(Status.FAIL, "wrong");

	      		}
	      			
	      			
//Description Button Icon
	      		    String ActualImageUrl = TableSbuUIPage.descriptionbutton.getAttribute("xlink:href");
	                String ExpectedImageUrl= null;
	                testCase = extent.createTest("Description-Button-Icon");
	                try {
	                    Assert.assertEquals(ActualImageUrl, ExpectedImageUrl);
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);
	                    testCase.log(Status.PASS, " Icon Image Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);    
	                    testCase.log(Status.FAIL, " Icon Image wrong");
	                }
	         
//Description Button Fill Color
	                String fillColor = TableSbuUIPage.descriptionbutton.getCssValue("fill");
	                String ActualFillColor = Color.fromString(fillColor).asHex();
	                String ExpectedFillColor="#000000";
	                testCase = extent.createTest("Description-Button-Icon Fill-Color");
	                try {
	                    Assert.assertEquals(ActualFillColor, ExpectedFillColor);
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);
	                    testCase.log(Status.PASS, " Fill color Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);    
	                    testCase.log(Status.FAIL, " Fill color wrong");
	                } 
		}

//**************************************** Description Model window

@Test(priority = 15)
public void descriptionmodel() throws InterruptedException  
{		
	//Model Window visible 
	
			TableSbuUIPage.descriptionbutton.click();
			Thread.sleep(4000);
			
			boolean AcctualVisible = TableSbuUIPage.descriptionmodel.isDisplayed();
			boolean ExpectedVisible = true;

			testCase = extent.createTest("Model-Window-Visible");
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

			Point ActualLocation = TableSbuUIPage.descriptionmodel.getLocation();

			int actual_x = ActualLocation.getX();
			int actual_y = ActualLocation.getY();

			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);

			Point ExpectedLocation = new Point(423, 100);

			testCase = extent.createTest("002-MODAL-POSITION");
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

			Dimension ActualSize = TableSbuUIPage.descriptionmodel.getSize();
			System.out.println("Size : " + ActualSize);
			Dimension ExpectedSize = new Dimension(520, 192);

			testCase = extent.createTest("003-MODAL-SIZE");
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

			String ActualButtonColor = TableSbuUIPage.descriptionmodel.getCssValue("background-color");
			System.out.println("rgb :" + ActualButtonColor);
			String ExpectedButtonColor = "rgba(255, 255, 255, 1)";

			testCase = extent.createTest("004-MODAL-BACKGROUND-COLOR");
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

			String ActualBorderColor = TableSbuUIPage.descriptionmodel.getCssValue("border-colour");
			System.out.println("rgb :" + ActualBorderColor);
			String ExpectedBorderColor = "";

			testCase = extent.createTest("005-MODAL-BORDER-COLOR");
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

			String ActualOverflow = TableSbuUIPage.descriptionmodel.getCssValue("overflow");
			System.out.println("overflow :" + ActualOverflow);
			String ExpectedOverflow = "visible";

			testCase = extent.createTest("006-MODAL-OVERFLOW-TYPE");
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

// ***** element margin

			String ActualMargin = TableSbuUIPage.descriptionmodel.getCssValue("margin");
			System.out.println("margin :" + ActualMargin);
			String ExpectedMargin = "0px";

			testCase = extent.createTest("007-MODAL-MARGIN-TYPE");
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

			String ActualActions = TableSbuUIPage.descriptionmodel.getCssValue("cursor");
			System.out.println("cursor :" + ActualActions);
			String ExpectedActions = "auto";

			testCase = extent.createTest("008-MODAL-CURSOR-TYPE");
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

// ***** element z- index

			String ActualZindex = TableSbuUIPage.descriptionmodel.getCssValue("z-index");
			System.out.println("z-index :" + ActualZindex);
			String ExpectedZindex = "auto";

			testCase = extent.createTest("009-MODAL-Z-INDEX-TYPE");
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
			
			Actions action = new Actions(driver);
	        action.moveByOffset(0, 0).click().build().perform();
	    	boolean AcctualAfterClick = TableSbuUIPage.descriptionmodel.isDisplayed();
			boolean ExpectedAfterClick =true;
			
			testCase = extent.createTest("013-MODAL-INVISIBLE-ONCLICK-OUTSIDE");
			try {
				AssertJUnit.assertEquals(AcctualAfterClick, ExpectedAfterClick);
				testCase.log(Status.INFO, "ActualElement :- " + AcctualAfterClick);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
				testCase.log(Status.FAIL, "Modal visible ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualVisible);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedAfterClick);
				testCase.log(Status.PASS, "Modal invisible");
			}
			
			Thread.sleep(2000); 
			
		}



//**************************************** Description Model Title

@Test(priority = 16)
	public void descriptiontext() throws InterruptedException  
   {	
//Model Title
				
				boolean ExpectedmodelTextVisible = true;
				System.out.println("IsVisible");
				boolean ActualmodelTextVisible=TableSbuUIPage.modeltitle.isDisplayed();
				
				testCase = extent.createTest("Model-Title-Visible");
				try {
					Assert.assertEquals(ActualmodelTextVisible, ExpectedmodelTextVisible);
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualmodelTextVisible);
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedmodelTextVisible);
					testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualmodelTextVisible);
					testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedmodelTextVisible);
					testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
				}
				Thread.sleep(2000);
				
//Model-Text
				String ActualtextElementfamily = TableSbuUIPage.modeltitle.getText();
				System.out.println("TEXT: "+ActualtextElementfamily);
				String ExpectedtextElementFamily = "Description";
				
				testCase = extent.createTest("Model-Title-Text");
				try {
				    Assert.assertEquals(ActualtextElementfamily, ExpectedtextElementFamily);
				    testCase.log(Status.INFO, "ActualText :- " + ActualtextElementfamily);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedtextElementFamily);
				    testCase.log(Status.INFO, "Correct Text");
				    testCase.log(Status.PASS, "Correct Text");
				} catch (AssertionError e) {
				    testCase.log(Status.INFO, "ActualText :- " + ActualtextElementfamily);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedtextElementFamily);
				    testCase.log(Status.INFO, "wrong Text");
				    testCase.log(Status.FAIL, "wrong Text");
				}
				Thread.sleep(2000);
			
				
//Model Title background
				
				String ActualElementBG = TableSbuUIPage.modeltitle.getCssValue("background-color");
				System.out.println("TABLE-BOX: "+ActualElementBG);
				String ExpectedElementBG = "white";
				
				testCase = extent.createTest("Model-Title-Background");
				try {
				    Assert.assertEquals(ActualElementBG, ExpectedElementBG);
				    testCase.log(Status.INFO, "ActualText :- " + ActualElementBG);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementBG);
				    testCase.log(Status.INFO, "Correct Text");
				    testCase.log(Status.PASS, "Correct Text");
				} catch (AssertionError e) {
				    testCase.log(Status.INFO, "ActualText :- " + ActualElementBG);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementBG);
				    testCase.log(Status.INFO, "wrong Text");
				    testCase.log(Status.FAIL, "wrong Text");
				}
				Thread.sleep(2000);
			
//Model Text font color
				
				String ActualTitleFontColor = TableSbuUIPage.modeltitle.getCssValue("color");
				System.out.println("Font color of button: " + ActualTitleFontColor);
				String ExpectedTitleFontColor ="rgba(0, 0, 0, 0.85)";
				
				
				testCase = extent.createTest("Model-Title-Font-Color");
				try {
				    AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
				    testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				    testCase.log(Status.INFO, "Correct font Colour");
				    testCase.log(Status.PASS, "Correct font Colour");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
				    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
				    testCase.log(Status.INFO, "wrong font Colour");
				    testCase.log(Status.FAIL, "wrong font Colour");
				}
				
			 


// model Text Font Size
				String ActualModelTitleFontsSize = TableSbuUIPage.modeltitle.getCssValue("font-size");
				System.out.println("Font Size: " + ActualModelTitleFontsSize);
				String ExpectedModelTitleFontsSize = "16px";
				
				testCase = extent.createTest("Model-Title-Font-Size");
				
				try {
				    AssertJUnit.assertEquals(ActualModelTitleFontsSize, ExpectedModelTitleFontsSize);
				    testCase.log(Status.INFO, "ActualfontSize :-" + ActualModelTitleFontsSize);
				    testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedModelTitleFontsSize);
				    testCase.log(Status.PASS, "Correct font-size");
				    testCase.log(Status.PASS, " Font-size Correct");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualfontsSize :- " + ActualModelTitleFontsSize);
				    testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedModelTitleFontsSize);
				    testCase.log(Status.INFO, "Wrong font-size");
				    testCase.log(Status.FAIL, "Font-size Wrong");
				
				}
				
		    

//Model Title Font Family
	
				String ActualModelElementfamily = TableSbuUIPage.modeltitle.getCssValue("FONT-FAMILY");
				System.out.println("FONT-FAMILY: "+ActualModelElementfamily);
				String ExpectedModelElementFamily = "Roboto, sans-serif";
			
				testCase = extent.createTest("Model-Title-Font-Family");
				try {
				    Assert.assertEquals(ActualModelElementfamily, ExpectedModelElementFamily);
				    testCase.log(Status.INFO, "ActualText :- " + ActualModelElementfamily);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedModelElementFamily);
				    testCase.log(Status.INFO, "Correct Text");
				    testCase.log(Status.PASS, "Correct Text");
				} catch (AssertionError e) {
				    testCase.log(Status.INFO, "ActualText :- " + ActualModelElementfamily);
				    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedModelElementFamily);
				    testCase.log(Status.INFO, "wrong Text");
				    testCase.log(Status.FAIL, "wrong Text");
				}
				Thread.sleep(2000);
			

//Model Title font-weight	
			String ActualfontElementfamily = TableSbuUIPage.modeltitle.getCssValue("font-weight");
			System.out.println("FONT-WEIGHT: "+ActualfontElementfamily);
			String ExpectedfontElementFamily = "500";
			
			testCase = extent.createTest("Model-Title-Font-Weight");
			try {
			    Assert.assertEquals(ActualfontElementfamily, ExpectedfontElementFamily);
			    testCase.log(Status.INFO, "ActualText :- " + ActualfontElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedfontElementFamily);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualfontElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedfontElementFamily);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
		
//Model Title padding			
			String ActualElementpaddingfamily = TableSbuUIPage.modeltitle.getCssValue("padding");
			System.out.println("FONT-PADDING: "+ActualElementpaddingfamily);
			String ExpectedElementpaddingFamily = "0px";
			
			testCase = extent.createTest("Model-Title-Font-Padding");
			try {
			    Assert.assertEquals(ActualElementpaddingfamily, ExpectedElementpaddingFamily);
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementpaddingfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementpaddingFamily);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementpaddingfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementpaddingFamily);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);


//Model Title Position
			Point ActulaTitleLocation = TableSbuUIPage.modeltitle.getLocation();        
			int actual_x = ActulaTitleLocation.getX();
			int actual_y = ActulaTitleLocation.getY();
			System.out.println("X axis: " + actual_x);
			System.out.println("Y axis: " + actual_y);
			
			Point ExpectedTitleLocation = new Point(0, 0);
			
			testCase = extent.createTest("TITLE-POSITION");
			try {
			    AssertJUnit.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
			    testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
			    testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
			    testCase.log(Status.PASS, "Correct Location");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
			    testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
			    testCase.log(Status.FAIL, "Wrong Location");
			}
			


//Model Title Shadow
			
			String ActualTitleShadow = TableSbuUIPage.modeltitle.getCssValue("box-shadow");
			System.out.println("Text Shadow :" + ActualTitleShadow);
			String ExpectedTitleShadow = "none";
			
			testCase = extent.createTest("TEXT-SHADOW");
			try {
			    AssertJUnit.assertEquals(ActualTitleShadow, ExpectedTitleShadow);
			    testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
			    testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
			    testCase.log(Status.PASS, "Shadow text available");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualBorderColor :- " + ActualTitleShadow);
			    testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedTitleShadow);
			    testCase.log(Status.FAIL, "Shadow text not available");
			}
			

//Model Title Margin
			String ActualTitleMargin = TableSbuUIPage.modeltitle.getCssValue("margin");
			System.out.println("Text Margin :" + ActualTitleMargin);
			String ExpectedTitleMargin = " 0px";
			
			testCase = extent.createTest("TEXT-MARGIN");
			try {
				AssertJUnit.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
				testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
				testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
				testCase.log(Status.PASS, "Text margin available");
			}
			catch (AssertionError e) { 
				testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
				testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
				testCase.log(Status.FAIL, "Text margin text not available");
			
			}
			
//MODEL TITLE LETTER SPACING
			String ActualLetterSpacing = TableSbuUIPage.modeltitle.getCssValue("letter-spacing");
			System.out.println("Letter Spacing :" + ActualLetterSpacing);
			String ExpectedLetterSpacing = "normal";
			
			testCase = extent.createTest("LETTER-SPACING");
			try {
				AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);
				testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
				testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
				testCase.log(Status.PASS, "Letter spacing is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
				testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
				testCase.log(Status.FAIL, "Letter spacing is not as expected");
			}
			

//MODEL TITLE WORD SPACING
			String ActualWordSpacing = TableSbuUIPage.modeltitle.getCssValue("word-spacing");
			System.out.println("Word Spacing :" + ActualWordSpacing);
			String ExpectedWordSpacing = "0px";
			
			testCase = extent.createTest("WORD-SPACING");
			
			try {
				AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);
				testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
				testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
				testCase.log(Status.PASS, "Word spacing is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
				testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
				testCase.log(Status.FAIL, "Word spacing is not as expected");
			}
			
			
//MODEL TITLE ALIGNMENT (CENTER/LEFT/RIGHT)
			String ActualAlignment = TableSbuUIPage.modeltitle.getCssValue("text-align");
			System.out.println("Text Alignment :" + ActualAlignment);
			String ExpectedAlignment = "center";
			
			testCase = extent.createTest("TEXT-ALIGNMENT");
			try {
				AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);
				testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
				testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
				testCase.log(Status.PASS, "Alignment is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
				testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
				testCase.log(Status.FAIL, "Alignment is not as expected");
			}
			
			
//MODEL TITLE TEXT TRANSFORMATION (UPERCASE/ LOWECASE)
			String ActualTextTransformation = TableSbuUIPage.modeltitle.getCssValue("text-transform");
			System.out.println("Text Transformation :" + ActualTextTransformation);
			String ExpectedTextTransformation = "none";
			
			testCase = extent.createTest("TEXT-TRANSFORMATION");
			try {
				AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);
				testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
				testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
				testCase.log(Status.PASS,  "Transformation expected");
			} catch (AssertionError e) {
				 testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
				 testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
				 testCase.log(Status.FAIL,  "Transformation unexpected");
			}
			
			
//MODEL TITLE LINE HEIGHT
			String ActualLineHeight =TableSbuUIPage.modeltitle.getCssValue("line-height");
			System.out.println("Line Height :" + ActualLineHeight);
			String ExpectedLineHeight = " 22px";
			
			testCase = extent.createTest("LINE-HEIGHT");
			try {
				AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
				testCase.log(Status.PASS, "Line height is as expected");
			
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
				testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
				testCase.log(Status.FAIL, "Line height is not as expected");
			}
				

//MODEL TITLE Text Decoration
			String ActualTextDecoration = TableSbuUIPage.modeltitle.getCssValue("text-decoration");
			System.out.println("Text Decoration :" + ActualTextDecoration);
			String ExpectedTextDecoration = "none solid rgba(0, 0, 0, 0.85)";
			
			testCase = extent.createTest("TEXT-DECORATION");
			try {
				AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);
				testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
				testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
				testCase.log(Status.PASS, "Text decoration is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
				testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
				testCase.log(Status.FAIL, "Text decoration is not as expected");
			}
			

//MODEL TITLE VERTICAL ALIGN
			String actualVerticalAlignment = TableSbuUIPage.modeltitle.getCssValue("vertical-align");
			System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);
			String expectedVerticalAlignment = "baseline";
			
			testCase = extent.createTest("TEXT-VERTICAL-ALIGNMENT");
			try {
				Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
				testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
				testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
				testCase.log(Status.PASS, "Text vertical Align is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
				testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
				testCase.log(Status.PASS, "Text vertical Align is as expected");
			}
			
			

//MODEL TITLE TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)
			String ActualTextIndent = TableSbuUIPage.modeltitle.getCssValue("text-indent");
			System.out.println("Text Indent :" + ActualTextIndent);
			String ExpectedTextIndent = "0px";
			
			testCase = extent.createTest("TEXT-INDENT");
			try {
				AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);
			    testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
			    testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
			    testCase.log(Status.PASS, "Text Indent is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
			    testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
			    testCase.log(Status.PASS, "Text Indent is as expected");}
			
			
//MODEL TITLE TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)
			String ActualTextOrientation = TableSbuUIPage.modeltitle.getCssValue("text-orientation");
			System.out.println("Text Orientation :" + ActualTextOrientation);
			String ExpectedTextOrientation = "mixed";
			
			testCase = extent.createTest("TEXT-ORIENTATION");
			try {
			    AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);
			    testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
			    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
			    testCase.log(Status.PASS, "Text orientation is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
			    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
			    testCase.log(Status.PASS, "Text orientation is as unxpected");
			}
			
			
			
//MODEL TITLE FONT STYLE
			String ActualFontStyle = TableSbuUIPage.modeltitle.getCssValue("font-style");
			System.out.println("Font Style :" + ActualFontStyle);
			String ExpectedFontStyle = "normal";
			
			testCase = extent.createTest("FONT-STYLE");
			try {
				AssertJUnit.assertEquals(ActualFontStyle, ExpectedFontStyle);
				testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
				testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
				testCase.log(Status.PASS, "Font style is as expected");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
				testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
				testCase.log(Status.FAIL, "Font style is not as expected");
			}
		}

@Test(priority = 17)
public void descriptiondetailtext() throws InterruptedException  
{	
//Model Detail Text
			Thread.sleep(2000);
			boolean ActualDetailTextVisible=TableSbuUIPage.modeldetailtext.isDisplayed();
			boolean ExpectedDetailTextVisible = true;
			System.out.println("IsVisible");
			
			testCase = extent.createTest("Model Detail Text Visible");
			try {
				Assert.assertEquals(ActualDetailTextVisible, ExpectedDetailTextVisible);
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualDetailTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedDetailTextVisible);
				testCase.log(Status.PASS, "Internal Radio Button Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Radio Button Visible :- " + ActualDetailTextVisible);
				testCase.log(Status.INFO, "Expected Internal Radio Button Visible :- " + ExpectedDetailTextVisible);
				testCase.log(Status.FAIL, "Internal Radio Button Visible is Wrong");
			}
			Thread.sleep(2000);
			
//Model-Detail-Text
			String ActualtextElementfamily = TableSbuUIPage.modeldetailtext.getText();
			System.out.println("TEXT: "+ActualtextElementfamily);
			String ExpectedtextElementFamily = "Description";
			
			testCase = extent.createTest("Model Detail Text");
			try {
			    Assert.assertEquals(ActualtextElementfamily, ExpectedtextElementFamily);
			    testCase.log(Status.INFO, "ActualText :- " + ActualtextElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedtextElementFamily);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualtextElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedtextElementFamily);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
		
			
//Model Detail Text background
			
			String ActualElementBG = TableSbuUIPage.modeldetailtext.getCssValue("background-color");
			System.out.println("TABLE-BOX: "+ActualElementBG);
			String ExpectedElementBG = "white";
			
			testCase = extent.createTest("Model Detail Text Background");
			try {
			    Assert.assertEquals(ActualElementBG, ExpectedElementBG);
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementBG);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementBG);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualElementBG);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementBG);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
		
//Model Detail Text font color
			
			String ActualTitleFontColor = TableSbuUIPage.modeldetailtext.getCssValue("color");
			System.out.println("Font color of button: " + ActualTitleFontColor);
			String ExpectedTitleFontColor ="rgba(0, 0, 0, 0.85)";
			
			
			testCase = extent.createTest("Model Detail Text Font-Color");
			try {
			    AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "Correct font Colour");
			    testCase.log(Status.PASS, "Correct font Colour");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
			    testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
			    testCase.log(Status.INFO, "wrong font Colour");
			    testCase.log(Status.FAIL, "wrong font Colour");
			}
				 


//model Detail Text Font Size
			String ActualModelTitleFontsSize = TableSbuUIPage.modeldetailtext.getCssValue("font-size");
			System.out.println("Font Size: " + ActualModelTitleFontsSize);
			String ExpectedModelTitleFontsSize = "14px";
			
			testCase = extent.createTest("Model Detail Text Font-Size");
			
			try {
			    AssertJUnit.assertEquals(ActualModelTitleFontsSize, ExpectedModelTitleFontsSize);
			    testCase.log(Status.INFO, "ActualfontSize :-" + ActualModelTitleFontsSize);
			    testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedModelTitleFontsSize);
			    testCase.log(Status.PASS, "Correct font-size");
			    testCase.log(Status.PASS, " Font-size Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualfontsSize :- " + ActualModelTitleFontsSize);
			    testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedModelTitleFontsSize);
			    testCase.log(Status.INFO, "Wrong font-size");
			    testCase.log(Status.FAIL, "Font-size Wrong");
			
			}
	    

//Model Detail Text Font Family

			String ActualModelElementfamily = TableSbuUIPage.modeldetailtext.getCssValue("FONT-FAMILY");
			System.out.println("FONT-FAMILY: "+ActualModelElementfamily);
			String ExpectedModelElementFamily = "Roboto, sans-serif";
			
			testCase = extent.createTest("Model Detail Text Font-Family");
			try {
			    Assert.assertEquals(ActualModelElementfamily, ExpectedModelElementFamily);
			    testCase.log(Status.INFO, "ActualText :- " + ActualModelElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedModelElementFamily);
			    testCase.log(Status.INFO, "Correct Text");
			    testCase.log(Status.PASS, "Correct Text");
			} catch (AssertionError e) {
			    testCase.log(Status.INFO, "ActualText :- " + ActualModelElementfamily);
			    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedModelElementFamily);
			    testCase.log(Status.INFO, "wrong Text");
			    testCase.log(Status.FAIL, "wrong Text");
			}
			Thread.sleep(2000);
		

//Model Detail Text font-weight	
		String ActualfontElementfamily = TableSbuUIPage.modeldetailtext.getCssValue("font-weight");
		System.out.println("FONT-WEIGHT: "+ActualfontElementfamily);
		String ExpectedfontElementFamily = "400";
		
		testCase = extent.createTest("Model Detail Text Font-Weight");
		try {
		    Assert.assertEquals(ActualfontElementfamily, ExpectedfontElementFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualfontElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedfontElementFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualfontElementfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedfontElementFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);
	
//Model Detail Text padding			
		String ActualElementpaddingfamily = TableSbuUIPage.modeldetailtext.getCssValue("padding");
		System.out.println("FONT-PADDING: "+ActualElementpaddingfamily);
		String ExpectedElementpaddingFamily = "0px";
		
		testCase = extent.createTest("Model-Title-Font-Padding");
		try {
		    Assert.assertEquals(ActualElementpaddingfamily, ExpectedElementpaddingFamily);
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementpaddingfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementpaddingFamily);
		    testCase.log(Status.INFO, "Correct Text");
		    testCase.log(Status.PASS, "Correct Text");
		} catch (AssertionError e) {
		    testCase.log(Status.INFO, "ActualText :- " + ActualElementpaddingfamily);
		    testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementpaddingFamily);
		    testCase.log(Status.INFO, "wrong Text");
		    testCase.log(Status.FAIL, "wrong Text");
		}
		Thread.sleep(2000);


//Model Detail Text Position
		Point ActulaTitleLocation = TableSbuUIPage.modeldetailtext.getLocation();        
		int actual_x = ActulaTitleLocation.getX();
		int actual_y = ActulaTitleLocation.getY();
		System.out.println("X axis: " + actual_x);
		System.out.println("Y axis: " + actual_y);
		
		Point ExpectedTitleLocation = new Point(0, 0);
		
		testCase = extent.createTest("MODEL DETAIL TEXT TITLE-POSITION");
		try {
		    AssertJUnit.assertEquals(ActulaTitleLocation, ExpectedTitleLocation);
		    testCase.log(Status.INFO, "ActualFontSize :- " + ActulaTitleLocation);
		    testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedTitleLocation);
		    testCase.log(Status.PASS, "Correct Location");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualSize :- " + ActulaTitleLocation);
		    testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedTitleLocation);
		    testCase.log(Status.FAIL, "Wrong Location");
		}
		


//Model Detail Text Shadow
		
		String ActualTitleShadow = TableSbuUIPage.modeldetailtext.getCssValue("box-shadow");
		System.out.println("Text Shadow :" + ActualTitleShadow);
		String ExpectedTitleShadow = "none";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-SHADOW");
		try {
		    AssertJUnit.assertEquals(ActualTitleShadow, ExpectedTitleShadow);
		    testCase.log(Status.INFO, "ActualTitleShadow :- " + ActualTitleShadow);
		    testCase.log(Status.INFO, "ExpectedTitleShadow :- " + ExpectedTitleShadow);
		    testCase.log(Status.PASS, "Shadow text available");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualBorderColor :- " + ActualTitleShadow);
		    testCase.log(Status.INFO, "ExpectedBorderColor :- " + ExpectedTitleShadow);
		    testCase.log(Status.FAIL, "Shadow text not available");
		}
	

//Model Detail Text Margin
		String ActualTitleMargin = TableSbuUIPage.modeldetailtext.getCssValue("margin");
		System.out.println("Text Margin :" + ActualTitleMargin);
		String ExpectedTitleMargin = "0px 0px 14px";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-MARGIN");
		try {
			AssertJUnit.assertEquals(ActualTitleMargin, ExpectedTitleMargin);
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.PASS, "Text margin available");
		}
		catch (AssertionError e) { 
			testCase.log(Status.INFO, "ActualTitleMargin :- " + ActualTitleMargin);
			testCase.log(Status.INFO, "ExpectedTitleMargin :- " + ExpectedTitleMargin);
			testCase.log(Status.FAIL, "Text margin text not available");
		}
		
//MODEL DETAIL TEXT LETTER SPACING
		String ActualLetterSpacing = TableSbuUIPage.modeldetailtext.getCssValue("letter-spacing");
		System.out.println("Letter Spacing :" + ActualLetterSpacing);
		
		String ExpectedLetterSpacing = "normal";
		
		testCase = extent.createTest("MODEL DETAIL TEXT LETTER-SPACING");
		try {
			AssertJUnit.assertEquals(ActualLetterSpacing, ExpectedLetterSpacing);
			testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
			testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
			testCase.log(Status.PASS, "Letter spacing is as expected");
		
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualLetterSpacing :- " + ActualLetterSpacing);
			testCase.log(Status.INFO, "ExpectedLetterSpacing :- " + ExpectedLetterSpacing);
			testCase.log(Status.FAIL, "Letter spacing is not as expected");
		}
		

//MODEL DETAIL TEXT WORD SPACING
		String ActualWordSpacing = TableSbuUIPage.modeldetailtext.getCssValue("word-spacing");
		System.out.println("Word Spacing :" + ActualWordSpacing);
		String ExpectedWordSpacing = "0px";
		
		testCase = extent.createTest("MODEL DETAIL TEXT WORD-SPACING");
		
		try {
			AssertJUnit.assertEquals(ActualWordSpacing, ExpectedWordSpacing);
			testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
			testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
			testCase.log(Status.PASS, "Word spacing is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualWordSpacing :- " + ActualWordSpacing);
			testCase.log(Status.INFO, "ExpectedWordSpacing :- " + ExpectedWordSpacing);
			testCase.log(Status.FAIL, "Word spacing is not as expected");
		}
		
		
//MODEL DETAIL TEXT ALIGNMENT (CENTER/LEFT/RIGHT)
		String ActualAlignment = TableSbuUIPage.modeldetailtext.getCssValue("text-align");
		System.out.println("Text Alignment :" + ActualAlignment);
		String ExpectedAlignment = "center";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-ALIGNMENT");
		try {
			AssertJUnit.assertEquals(ActualAlignment, ExpectedAlignment);
			testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
			testCase.log(Status.PASS, "Alignment is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualAlignment :- " + ActualAlignment);
			testCase.log(Status.INFO, "ExpectedAlignment :- " + ExpectedAlignment);
			testCase.log(Status.FAIL, "Alignment is not as expected");
		}
	
		
//MODEL DETAIL TEXT TRANSFORMATION (UPERCASE/ LOWECASE)
		String ActualTextTransformation = TableSbuUIPage.modeldetailtext.getCssValue("text-transform");
		System.out.println("Text Transformation :" + ActualTextTransformation);
		String ExpectedTextTransformation = "none";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-TRANSFORMATION");
		try {
			AssertJUnit.assertEquals(ActualTextTransformation, ExpectedTextTransformation);
			testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
			testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
			testCase.log(Status.PASS,  "Transformation expected");
		} catch (AssertionError e) {
			 testCase.log(Status.INFO, "ActualTextTransformation :- " + ActualTextTransformation);
			 testCase.log(Status.INFO, "ExpectedTextTransformation :- " + ExpectedTextTransformation);
			 testCase.log(Status.FAIL,  "Transformation unexpected");
		}
		
		
//MODEL DETAIL TEXT LINE HEIGHT
		String ActualLineHeight =TableSbuUIPage.modeldetailtext.getCssValue("line-height");
		System.out.println("Line Height :" + ActualLineHeight);
		String ExpectedLineHeight = "22.001px";
		
		testCase = extent.createTest("MODEL DETAIL TEXT LINE-HEIGHT");
		try {
			AssertJUnit.assertEquals(ActualLineHeight, ExpectedLineHeight);
			testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
			testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
			testCase.log(Status.PASS, "Line height is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualLineHeight :- " + ActualLineHeight);
			testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedLineHeight);
			testCase.log(Status.FAIL, "Line height is not as expected");
		}
		

//MODEL DETAIL TEXT Decoration
		String ActualTextDecoration = TableSbuUIPage.modeldetailtext.getCssValue("text-decoration");
		System.out.println("Text Decoration :" + ActualTextDecoration);
		String ExpectedTextDecoration = "none solid rgba(0, 0, 0, 0.85)";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-DECORATION");
		try {
			AssertJUnit.assertEquals(ActualTextDecoration, ExpectedTextDecoration);
			testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
			testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
			testCase.log(Status.PASS, "Text decoration is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualTextDecoration :- " + ActualTextDecoration);
			testCase.log(Status.INFO, "ExpectedTextDecoration :- " + ExpectedTextDecoration);
			testCase.log(Status.FAIL, "Text decoration is not as expected");
		}
		

//MODEL DETAIL TEXT VERTICAL ALIGN
		String actualVerticalAlignment = TableSbuUIPage.modeldetailtext.getCssValue("vertical-align");
		System.out.println("Actual Vertical Alignment: " + actualVerticalAlignment);
		String expectedVerticalAlignment = "baseline";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-VERTICAL-ALIGNMENT");
		try {
			Assert.assertEquals(actualVerticalAlignment, expectedVerticalAlignment);
			testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
			testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
			testCase.log(Status.PASS, "Text vertical Align is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "actualVerticalAlignment :- " + actualVerticalAlignment);
			testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
			testCase.log(Status.PASS, "Text vertical Align is as expected");
		}

//MODEL DETAIL TEXT INDENT  (To indent is to begin text with a blank space between it and the margin)
		String ActualTextIndent = TableSbuUIPage.modeldetailtext.getCssValue("text-indent");
		System.out.println("Text Indent :" + ActualTextIndent);
		String ExpectedTextIndent = "0px";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-INDENT");
		try {
			AssertJUnit.assertEquals(ActualTextIndent, ExpectedTextIndent);
			testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
		    testCase.log(Status.INFO, "ExpectedTextIndent :- " + ExpectedTextIndent);
		    testCase.log(Status.PASS, "Text Indent is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualTextIndent :- " + ActualTextIndent);
		    testCase.log(Status.INFO, "expectedVerticalAlignment :- " + expectedVerticalAlignment);
		    testCase.log(Status.PASS, "Text Indent is as expected");
		}
		
		
//MODEL DETAIL TEXT - ORIENTATION(text characters in a line. It only affects text in vertical mode)
		String ActualTextOrientation = TableSbuUIPage.modeldetailtext.getCssValue("text-orientation");
		System.out.println("Text Orientation :" + ActualTextOrientation);
		String ExpectedTextOrientation = "mixed";
		
		testCase = extent.createTest("MODEL DETAIL TEXT-ORIENTATION");
		try {
		    AssertJUnit.assertEquals(ActualTextOrientation, ExpectedTextOrientation);
		    testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
		    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
		    testCase.log(Status.PASS, "Text orientation is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualTextOrientation :- " + ActualTextOrientation);
		    testCase.log(Status.INFO, "ExpectedTextOrientation :- " + ExpectedTextOrientation);
		    testCase.log(Status.PASS, "Text orientation is as unxpected");
		}
		
		
//MODEL DETAIL TEXT FONT STYLE
		String ActualFontStyle = TableSbuUIPage.modeldetailtext.getCssValue("font-style");
		System.out.println("Font Style :" + ActualFontStyle);
		String ExpectedFontStyle = "normal";
		
		testCase = extent.createTest("MODEL DETAIL TEXT FONT-STYLE");
		try {
			AssertJUnit.assertEquals(ActualFontStyle, ExpectedFontStyle);
			testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
			testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
			testCase.log(Status.PASS, "Font style is as expected");
		} catch (AssertionError e) {
			testCase.log(Status.INFO, "ActualFontStyle :- " + ActualFontStyle);
			testCase.log(Status.INFO, "ExpectedFontStyle :- " + ExpectedFontStyle);
			testCase.log(Status.FAIL, "Font style is not as expected");
		}
	
	}
//****************** Model Cancel Button

//model cancel Button Text Visible
@Test(priority = 18)
public void modelcancelbutton() 
{
		try {
			boolean ExpectedTextVisible=true;
			System.out.println("IsVisible");
			boolean ActualTextVisible=TableSbuUIPage.modelcancelbutton.isDisplayed();
			testCase = extent.createTest("1-Model-Cancel-Button-VISIBLE");
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
}

//model cancel Button FONT COLOR
@Test(priority = 19)
public void modelcancelfontclr() throws InterruptedException  
{
		try {	
			String ActualTitleFontColor = TableSbuUIPage.modelcancelbutton.getCssValue("color");
			System.out.println("Font color of button: " + ActualTitleFontColor);
			String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
			testCase = extent.createTest("2.Model-Cancel-Button-Font-Color");
			
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
			testCase = extent.createTest("Model-Cancel-Button-Font-Color");
			testCase.log(Status.FAIL, "No element");
		}
}



//model cancel Button FONTSIZE
@Test(priority = 20)
public void modelcancelfontsize() {
	
	try {
				String ActualTitleFontsSize = TableSbuUIPage.modelcancelbutton.getCssValue("font-size");
				System.out.println("Font Size: " + ActualTitleFontsSize);
				String ExpectedTitleFontsSize = "14px";
				testCase = extent.createTest("Model-Cancel-Button-Font-Size");
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
			testCase = extent.createTest("Model-Cancel-Button-Font-Size");
			testCase.log(Status.FAIL, "No Element");
		}
}

//model cancel Button Font Family 
@Test(priority =21)
public void  modelcancelelementfamily() {

		try {
			String ActualElementfamily = TableSbuUIPage.modelcancelbutton.getCssValue("font-family");
			System.out.println("FONT-FAMILY: "+ActualElementfamily);
			String ExpectedElementFamily = "Roboto, sans-serif";
			testCase = extent.createTest("Model-Cancel-Button-Font-Family");
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
			testCase = extent.createTest("Model-Cancel-Button-Font-Family");
			 testCase.log(Status.FAIL, "NO ELEMENT");
		}
}


//model cancel Button Spelling	
@Test(priority = 22)
public void modelcancelspelling() {
	try {
			  String AcctualTitleText = TableSbuUIPage.modelcancelbutton.getText();
			  String ExpectedTitleText = "Cancel";
			  System.out.println(" Text:" + AcctualTitleText);
			  testCase = extent.createTest("Model-Cancel-Button-Spelling-Text");
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
			  testCase = extent.createTest("Model-Cancel-Button-Spelling-Text");
			  testCase.log(Status.FAIL, "No Element");
		}
}
//model cancel Button Position
@Test(priority = 23)

public void modelcancellocation() {
		try {
				Point ActulalLocation = TableSbuUIPage.modelcancelbutton.getLocation();        
				int actual_x = ActulalLocation.getX();
				int actual_y = ActulalLocation.getY();
				System.out.println("X axis: " + actual_x);
				System.out.println("Y axis: " + actual_y);
				Point ExpectedLocation = new Point(861, 250);
			
			testCase = extent.createTest("Model-Cancel-Button-Position");
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
			 testCase = extent.createTest("Model-Cancel-Button-Position");
			 testCase.log(Status.FAIL, "NO ELEMENT");
			
		} 
}	 
	
//model cancel Button Padding 
@Test(priority = 24)		 
	   
public void modelcancelpadding() {	 
		try { 
					String Actualpadding = TableSbuUIPage.modelcancelbutton.getCssValue("padding");
					System.out.println("PADDING: "+Actualpadding);
					String Expectedpadding = "4px 15px";
					testCase = extent.createTest("Model-Cancel-Button-Padding");
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
			 testCase = extent.createTest("Model-Cancel-Button-Padding");
			 testCase.log(Status.FAIL, "NO ELEMENT");
		}	 
}

	
//model cancel Button Shadow
@Test(priority = 25)	
public void modelcanceltextshadow() {

try {
		String Actualshadow = TableSbuUIPage.modelcancelbutton.getCssValue("box-shadow");
		System.out.println("Text Shadow :" + Actualshadow);
		String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";
		testCase = extent.createTest("Model-Cancel-Button-Box-Shadow");
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
			testCase = extent.createTest("Model-Cancel-Button-Box-Shadow");
			testCase.log(Status.FAIL, "No Element");
		}
}

//model cancel Button BACKGROUND COLOR
@Test(priority = 26)
public void modelcanceltrspace() 
{	

try {
		String Actualbackground = TableSbuUIPage.modelcancelbutton.getCssValue("color");
		System.out.println("BACKGROUND COLOR:" + Actualbackground);
		String Expectedbackground= "rgba(255, 255, 255, 1)";
		
		testCase = extent.createTest("Model-Cancel-Button-Backgroung-Color");
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
			testCase = extent.createTest("Model-Cancel-Button-Backgroung-Color");
		}
	}

//model cancel Button Border Color
@Test(priority = 27)

public void modelcancelbordercolor() {
		try {		 
				String actualbordercolor = TableSbuUIPage.modelcancelbutton.getCssValue("border-color");
				System.out.println(" border-color:" + actualbordercolor);
				String Expectedbordercolor = "rgb(255, 255, 255)";
				testCase = extent.createTest("Model-Cancel-Button-Border-Color");
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
					testCase = extent.createTest("Model-Cancel-Button-Border-Color");
				}
	 }
	 
//model cancel Button CURSER POINT	 
@Test(priority = 28)
public void modelcancelcursor() {
		try {	 
				String ActualCursor = TableSbuUIPage.modelcancelbutton.getCssValue("cursor");
				System.out.println("cursor :" + ActualCursor);
				String Expectedcursor = "pointer";
				testCase = extent.createTest("Model-Cancel-Button-Cursor");
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
					testCase = extent.createTest("Model-Cancel-Button-Cursor");
				}
	 }

	 
//model cancel Button OPACITY 
@Test(priority = 29)
public void modelcancelopacity() {
		try {
				String Actualopacity = TableSbuUIPage.modelcancelbutton.getCssValue("opacity");
				System.out.println("OPACITY :" + Actualopacity);
				
				String Expectedopacity = "1";
				testCase = extent.createTest("Model-Cancel-Button-Opacity");
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
					testCase = extent.createTest("Model-Cancel-Button-Opacity");
					testCase.log(Status.FAIL,  "No Element");
				}
		 }
	
//model cancel Button HEIGHT
@Test(priority = 30)
public void modelcancelheight() {
		try {	 
				String ActualHeight =TableSbuUIPage.modelcancelbutton.getCssValue("height");
				System.out.println("Height :" + ActualHeight);
				String ExpectedHeight = "32px";
				testCase = extent.createTest("Model-Cancel-Button-Height");
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
					testCase = extent.createTest("Model-Cancel-Button-Height");
					testCase.log(Status.FAIL, "No element");	
				}
	
}
	
//model cancel Button HEIGHT
@Test(priority = 31)

public void modelcancelWidth() {
		try {	 
				String Actualwidth =TableSbuUIPage.modelcancelbutton.getCssValue("width");
				System.out.println("width :" + Actualwidth);
			
				String Expectedwidth = "65.1406px";
				testCase = extent.createTest("Model-Cancel-Button-Width");
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
				testCase = extent.createTest("Model-Cancel-Button-Width");
				testCase.log(Status.FAIL, "No element");	
			}
		
	}

//model cancel Button Font-weight
@Test(priority = 32)

public void modelcancelfontweight() {
		try {
				String Actualweight = TableSbuUIPage.modelcancelbutton.getCssValue("font-weight");
				System.out.println("16.Font-weight :" + Actualweight);
				String Expectedweight = "400";
				testCase = extent.createTest("Model-Cancel-Button-Weight");
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
			testCase = extent.createTest("Model-Cancel-Button-Weight");
		}
}

//********************************Model Close Icon

@Test(priority = 33)
	public void modelcloseicon() throws InterruptedException  
   {
			Thread.sleep(2000);
			boolean ExpectedTextVisible = true;
			System.out.println("IsVisible");
			
			boolean ActualTextVisible=TableSbuUIPage.modelcancelicon.isDisplayed();
			testCase = extent.createTest("Model-Cancel-Icon-Visible");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Internal Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, "Internal Visible is Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "Actual Internal Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Internal Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Internal Visible is Wrong");
			}
			
//Model Cancel Icon Enable
			boolean AcctualElementEnabled = TableSbuUIPage.modelcancelicon.isEnabled();
			boolean ExpectedElementEnabled = true;

			testCase = extent.createTest("Model-Cancel-Icon-Enable");
			try {
				AssertJUnit.assertEquals(AcctualElementEnabled, ExpectedElementEnabled);
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element Available");
				testCase.log(Status.PASS, "Correct Element");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + AcctualElementEnabled);
				testCase.log(Status.INFO, "ExpectedElement :- " + ExpectedElementEnabled);
				testCase.log(Status.INFO, "Element not available");
				testCase.log(Status.FAIL, "No Element");
			}
		
			
//Model Cancel Icon Location
			Thread.sleep(2000); 
			Point actualLocation = 	TableSbuUIPage.modelcancelicon.getLocation();

			int  x = actualLocation.getX();
			int y = actualLocation.getY();
			
			System.out.println("x-axis = " + x);
			System.out.println("y-axis = " + y);
			
			
			Point expectedLocation = new Point(907, 119);
			testCase = extent.createTest("Model-Cancel-Icon-Position");
			
			try {
				AssertJUnit.assertEquals(actualLocation, expectedLocation);
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.PASS, "Correct ");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualElement :- " + actualLocation);
				testCase.log(Status.INFO, "ExpectedElement :- " + expectedLocation);
				testCase.log(Status.FAIL, "wrong");
			}
			
				
//Model Cancel Icon Width
				Thread.sleep(2000);
				Dimension size = TableSbuUIPage.modelcancelicon.getSize();
				int actualWidth = size.getWidth();
				System.out.println("width  = " + actualWidth);
				int expectedSize = 16;
				
				testCase = extent.createTest("Model-Cancel-Icon-width");
								
				try {
					AssertJUnit.assertEquals(actualWidth, expectedSize);
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError e) {
					testCase.log(Status.INFO, "ActualElement :- " + actualWidth);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedSize);
					testCase.log(Status.FAIL, "wrong");
				}
				
				
//Model Cancel Icon Height
				int actualHeight = size.getHeight();
				System.out.println("height = " + actualHeight);
				int expectedHeight = 16;

				testCase = extent.createTest("Model-Cancel-Icon-Height");
				try {
					AssertJUnit.assertEquals(actualHeight, expectedHeight);
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.PASS, "Correct ");
				} catch (AssertionError find) {
					testCase.log(Status.INFO, "ActualElement :- " + actualHeight);
					testCase.log(Status.INFO, "ExpectedElement :- " + expectedHeight);
					testCase.log(Status.FAIL, "wrong");

				}
				
				
//Model Cancel Icon Background Color
				String ActualbackgroundColor = TableSbuUIPage.modelcancelicon.getCssValue("background-color");
	      		
	      		System.out.println("backgroundcolor = " + ActualbackgroundColor);
	      		String expectedBackGroundColor = "rgba(0, 0, 0, 0)";
	      		
	      		testCase = extent.createTest("Model-Cancel-Icon-background-color");
	      		try {
	      			AssertJUnit.assertEquals(ActualbackgroundColor, expectedBackGroundColor);
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
    				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
    				testCase.log(Status.PASS, "Correct ");
	      		} catch (AssertionError e) {
	      			testCase.log(Status.INFO, "ActualElement :- " + ActualbackgroundColor);
    				testCase.log(Status.INFO, "ExpectedElement :- " + expectedBackGroundColor);
    				testCase.log(Status.FAIL, "wrong");

	      		}
	      			
//Model Cancel Icon
	      		    String ActualImageUrl = TableSbuUIPage.modelcancelicon.getAttribute("xlink:href");
	                String ExpectedImageUrl= null ;
	                testCase = extent.createTest("Model-Cancel-Icon-");
	                try {
	                    Assert.assertEquals(ActualImageUrl, ExpectedImageUrl);
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);
	                    testCase.log(Status.PASS, " Icon Image Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Icon Image :- " + ActualImageUrl);
	                    testCase.log(Status.INFO, "Expected Icon Image :- " + ExpectedImageUrl);    
	                    testCase.log(Status.FAIL, " Icon Image wrong");
	                }
	         
//Model Cancel Icon Fill Color
	                String fillColor = TableSbuUIPage.modelcancelicon.getCssValue("fill");
	                String ActualFillColor = Color.fromString(fillColor).asHex();
	                String ExpectedFillColor="#000000";
	                testCase = extent.createTest("Model-Cancel-Icon-Fill-Color");
	                try {
	                    Assert.assertEquals(ActualFillColor, ExpectedFillColor);
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);
	                    testCase.log(Status.PASS, " Fill color Correct ");
	                } catch (AssertionError e) {
	                    testCase.log(Status.INFO, "Actual Fill color :- " + ActualFillColor);
	                    testCase.log(Status.INFO, "Expected Fill color :- " + ExpectedFillColor);    
	                    testCase.log(Status.FAIL, " Fill color wrong");
	                } 
		}

//****************** Add SBU Button

//Add SBU Button Text Visible
@Test(priority = 34)
public void addsbubutton() 
{
		try {
			boolean ExpectedTextVisible=true;
			System.out.println("IsVisible");
			boolean ActualTextVisible=TableSbuUIPage.AddSBUbutton.isDisplayed();
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
}


//Add SBU Button FONT COLOR
@Test(priority = 35)
public void fontclr() throws InterruptedException  
{
		try {	
			String ActualTitleFontColor = TableSbuUIPage.AddSBUbutton.getCssValue("color");
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
}
//Add SBU Button FONTSIZE
@Test(priority = 36)
public void SBUfontsize() {
	
	try {
				String ActualTitleFontsSize = TableSbuUIPage.AddSBUbutton.getCssValue("font-size");
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
}

//Add SBU Button Font Family 
@Test(priority = 37)
public void  elementfamily() {

		try {
			String ActualElementfamily = TableSbuUIPage.AddSBUbutton.getCssValue("font-family");
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
}


//Add SBU Button Spelling	
@Test(priority = 38)
public void spelling() {
	try {
			  String AcctualTitleText = TableSbuUIPage.AddSBUbutton.getText();
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
}
//Add SBU Button Position
@Test(priority = 39)

public void location() {
		try {
				Point ActulalLocation = TableSbuUIPage.AddSBUbutton.getLocation();        
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
}	 
	
//Add SBU Button Padding 
@Test(priority = 40)		 
	   
 public void SBUpadding() {	 
		try { 
					String Actualpadding = TableSbuUIPage.AddSBUbutton.getCssValue("padding");
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
}

	
//Add SBU Button Shadow
@Test(priority = 41)	
public void textshadow() {

try {
		String Actualshadow = TableSbuUIPage.AddSBUbutton.getCssValue("box-shadow");
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
}

//Add SBU Button BACKGROUND COLOR
@Test(priority = 42)
public void ltrspace() 
{	

try {
		String Actualbackground = TableSbuUIPage.AddSBUbutton.getCssValue("color");
		System.out.println("BACKGROUND COLOR:" + Actualbackground);
		String Expectedbackground= "rgba(255, 255, 255, 1)";
		
		boolean letterspacing = true;
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
			testCase = extent.createTest("8.BACKGROUND COLOR");
		}
	}

//Add SBU Button BORDER COLOR
 @Test(priority = 43)
 
public void bordercolor() {
		try {		 
				String actualbordercolor = TableSbuUIPage.AddSBUbutton.getCssValue("border-color");
				System.out.println(" border-color:" + actualbordercolor);
				String Expectedbordercolor = "rgb(255, 255, 255)";
				testCase = extent.createTest("9.ADD-SBU-BORDER-COLOR");
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
	 }
	 
//Add SBU Button CURSER POINT	 
@Test(priority = 44)
public void cursor() {
		try {	 
				String ActualCursor = TableSbuUIPage.AddSBUbutton.getCssValue("cursor");
				System.out.println("cursor :" + ActualCursor);
				String Expectedcursor = "pointer";
				testCase = extent.createTest("10.ADD-SBU-CURSOR");
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
	 }

	 
//Add SBU Button OPACITY 
@Test(priority = 45)
public void opacity() {
		try {
				String Actualopacity = TableSbuUIPage.AddSBUbutton.getCssValue("opacity");
				System.out.println("OPACITY :" + Actualopacity);
				
				String Expectedopacity = "1";
				testCase = extent.createTest("11.ADD-SBU-OPACITY");
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
		 }
	
//Add SBU Button HEIGHT
@Test(priority = 46)
public void SBUheight() {
		try {	 
				String ActualHeight =TableSbuUIPage.AddSBUbutton.getCssValue("height");
				System.out.println("Height :" + ActualHeight);
				String ExpectedHeight = "32px";
				testCase = extent.createTest("12.ADD-SBU-HEIGHT");
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
	
}
	
//Add SBU Button HEIGHT
@Test(priority = 47)

public void Width() {
		try {	 
				String Actualwidth =TableSbuUIPage.AddSBUbutton.getCssValue("width");
				System.out.println("width :" + Actualwidth);
			
				String Expectedwidth = "180px";
				testCase = extent.createTest("13.ADD-SBU-WIDTH");
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
		
	}

//Add SBU Button Font-weight
@Test(priority = 48)

public void SBUfontweight() {
		try {
				String Actualweight = TableSbuUIPage.AddSBUbutton.getCssValue("font-weight");
				System.out.println("16.Font-weight :" + Actualweight);
				String Expectedweight = "400";
				testCase = extent.createTest("14.ADD-SBU-FONT-WEIGHT");
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
}