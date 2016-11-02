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

public class TestCase1Camera extends com.mv4d.oxalis.BeforeAfterTest {
	
//static WebDriver driver;
MainScreen objMainScreen;			
WebDriverWait wait;
WebElement bOkFailDialog;



// using extends BeforeAfterTest class
/*  
@BeforeTest
public void beforeTest() throws MalformedURLException {
File classpathRoot = new File(System.getProperty("user.dir"));
File appDir = new File(classpathRoot, "/Apps/App1");
File app = new File(appDir, "DeviceCalibration.apk");
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
capabilities.setCapability("deviceName", "MantisQA");

// Samsung s6 -(s6_isr_p001) id 04157df4e01f6614
capabilities.setCapability("udid", "04157df4e01f6614");	
capabilities.setCapability("platformVersion", "5.0.2");
  
// Samsung s6 - id 04157df4e01f3d16
//  capabilities.setCapability("udid", "04157df4e01f3d16");	
//  capabilities.setCapability("platformVersion", "5.0.2");

capabilities.setCapability("platformName", "Android");
capabilities.setCapability("app", app.getAbsolutePath());
capabilities.setCapability("appPackage", "com.mv4d.devicecalib");
capabilities.setCapability("appActivity", "main.SplashActivity");

//How long (in seconds) Appium will wait for a new command 
// from the client before assuming the client quit and ending the session
capabilities.setCapability("newCommandTimeout", "320");

// DONT INSTALL THE APK each time.
//Appium program -> android settings -> no reset checked ... 
//https://discuss.appium.io/t/why-it-install-app-everytime-if-app-already-there-in-device/3574/5
capabilities.setCapability("noReset", true);
capabilities.setCapability("fullReset", false);

driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
wait = new WebDriverWait(driver, 10);
}
*/

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
		
//		Option 2 - Verify Element Present or Not On App's Screen
		
		  //There is element with name EPI on screen.
		  //So iselementpresent will be set to true.
	//    Boolean iselementpresent = driver.findElementsByName("EPI").size() != 0;
		  //iselementpresent will be true so assertion will pass and so test method will pass too.
	//	  System.out.println("EPI element bollean is set to:" +iselementpresent);
	//	  Assert.assertTrue(iselementpresent,"Targeted element App is not present on screen");
		
		
		objMainScreen.setCameraClibMode();
		//objMainScreen.clickIrColorButton();
		//objMainScreen.clickIrColorButton();	
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);
		objMainScreen.clickTakeCalibCapture_button();
		Thread.sleep(3000);
		objMainScreen.clickStartStop_calib_button();
		Thread.sleep(3000);
  }

/*
@Test
public void testCase2() throws MalformedURLException ,InterruptedException {
	  
       System.out.println("Starting Test2...");

  }
*/


/*
@AfterTest
public void afterTest() throws InterruptedException {
// End of Program
System.out.println("Test is Finished");
Thread.sleep(2000);
driver.quit();
}
*/


}
