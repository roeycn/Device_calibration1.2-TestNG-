package com.mv4d.oxalis;


// set classpath=D:\Eclipse_enviromen\workspace\Device_calibration1.1(TestNG)\bin;D:\Eclipse_enviromen\workspace\Device_calibration1.1(TestNG)\lib\*
// java org.testng.TestNG testng.xml


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import Activities.MainScreen;

public class TestCase5Camera10Frames extends com.mv4d.oxalis.BeforeAfterTest {
	
//static WebDriver driver;
MainScreen objMainScreen;			
WebDriverWait wait;
WebElement bOkFailDialog;


@Test
public void testCase1() throws InterruptedException, IOException   {
	  
       System.out.println("Starting Test...");
		
         // wait till oxalis lunch (splash screen is over..)	
		Thread.sleep(15000);			
								
		//Create Activity object
		objMainScreen = new MainScreen(driver);
		//Verify button text
		String buttonText = objMainScreen.getCheckBox();
		System.out.println("buttonText = " + buttonText);	
	    // Assert.assertTrue(buttonText.toLowerCase().contains("   "));	
	
		if (buttonText==null){
			System.out.println("Finishing test- it seems like splash screen is freeze and the app doesnt start");
			Assert.fail();
			//appiumStop();
		}
		
		
		
		objMainScreen.setCameraClibMode();
		//objMainScreen.clickIrColorButton();
		//objMainScreen.clickIrColorButton();	
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);
		for (int i=0 ; i<10 ; i++){
		objMainScreen.clickTakeCalibCapture_button();
		Thread.sleep(3000);
		}
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);
  }



}
