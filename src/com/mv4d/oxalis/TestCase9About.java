package com.mv4d.oxalis;

import io.appium.java_client.android.AndroidKeyCode;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import Activities.MainScreen;

public class TestCase9About extends com.mv4d.oxalis.BeforeAfterTest {
	
//static WebDriver driver;
MainScreen objMainScreen;			
WebDriverWait wait;
WebElement bOkFailDialog;
	
@Test
public void testCase5() throws MalformedURLException ,InterruptedException {
	  
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
		
		
		objMainScreen.clickAbout_Button();	
		Thread.sleep(5000);	
		String aboutDialogText = objMainScreen.get_About_Dialog();
		Thread.sleep(5000);
 
		//back button
         System.out.println("press back button");
		 driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK) ;
		 Thread.sleep(3000);
		 
		 System.out.println("about dialog data =  "+"\n"+aboutDialogText);
		 
		 PrintWriter out;
		try {
			out = new PrintWriter("D:/Roey/Device_calibration/Device_calibration1.5(About)/Results/About/AboutDialog.txt");
			out.println(aboutDialogText);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
  }

}
