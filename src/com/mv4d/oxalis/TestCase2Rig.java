package com.mv4d.oxalis;


// set classpath=D:\Eclipse_enviromen\workspace\Device_calibration1.1(TestNG)\bin;D:\Eclipse_enviromen\workspace\Device_calibration1.1(TestNG)\lib\*
// java org.testng.TestNG testng.xml

import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import Activities.MainScreen;

public class TestCase2Rig extends com.mv4d.oxalis.BeforeAfterTest {
	
//static WebDriver driver;
MainScreen objMainScreen;			
WebDriverWait wait;
WebElement bOkFailDialog;
	
@Test
public void testCase2() throws MalformedURLException ,InterruptedException {
	  
         System.out.println("Starting Test...");	
         // wait till oxalis lunch (splash screen is over..)	
		Thread.sleep(10000);										
		//Create Activity object
		objMainScreen = new MainScreen(driver);
		//Verify button text
		String buttonText = objMainScreen.getCheckBox();	
		if (buttonText==null){
			System.out.println("Finishing test- it seems like splash screen is freeze and the app doesnt start");
			Assert.fail();
		}
		objMainScreen.setRigCalibMode();
		//objMainScreen.clickIrColorButton();
		//objMainScreen.clickIrColorButton();	
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);
		objMainScreen.clickTakeCalibCapture_button();
		Thread.sleep(3000);
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);	
  }

}
