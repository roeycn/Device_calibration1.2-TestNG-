package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainScreen {

	WebDriver driver;	
	WebDriverWait wait;
	String Dialog;
//	wait = new WebDriverWait(driver, 10);

	
	// Modes (Radio Buttons)
	By cameraClibMode = By.id("com.mv4d.devicecalib:id/cameraClibMode");
	By rigCalibMode = By.id("com.mv4d.devicecalib:id/rigCalibMode");
	By epiCalibMode = By.id("com.mv4d.devicecalib:id/epiCalibMode");
	By freeRecMode = By.id("com.mv4d.devicecalib:id/freeRecMode");
	
	// Buttons
	By startStopButton = By.id("com.mv4d.devicecalib:id/startStop_calib_button");
	By takeCalibCaptureButton = By.id("com.mv4d.devicecalib:id/takeCalibCapture_button");
	By irColorButton = By.id("com.mv4d.devicecalib:id/ir_color_button");
	By autoManualButton = By.id("com.mv4d.devicecalib:id/auto_manual_button");
	By aboutButton = By.id("com.mv4d.devicecalib:id/about_button");
	
	// Dialog
	By aboutDialog = By.id("android:id/message");
	
	// Manual
	
	
	
		
	
public  MainScreen(WebDriver driver){
this.driver = driver;

}

/*
public  MainScreen(WebDriverWait driver){
this.wait = driver;
}
*/

	
//Set cameraClibMode check box 
public void setCameraClibMode(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(cameraClibMode));
	//wait.until(ExpectedConditions.elementToBeClickable(cameraClibMode));	
	driver.findElement(cameraClibMode).click();
	System.out.println("cameraClibMode - check box set");	
	}catch (Exception c){
	System.out.println("cameraClibMode -> No Element found");
	Assert.fail();
	}
}	

public void setRigCalibMode(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(rigCalibMode));	
	driver.findElement(rigCalibMode).click();
	System.out.println("rigCalibMode - check box set");	
	}catch (Exception c){
	System.out.println("rigCalibMode -> No Element found");
	Assert.fail();
	}
}	


public void setEpiCalibMode(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(epiCalibMode));	
	driver.findElement(epiCalibMode).click();
	System.out.println("epiCalibMode - check box set");	
	}catch (Exception c){
	System.out.println("epiCalibMode -> No Element found");
	Assert.fail();
	}
}

public void setFreeRecMode(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(freeRecMode));	
	driver.findElement(freeRecMode).click();
	System.out.println("freeRecMode - check box set");	
	}catch (Exception c){
	System.out.println("freeRecMode -> No Element found");
	Assert.fail();
	}
}

	
//Get the title of the checkBox
public String getCheckBox(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(cameraClibMode));	
	System.out.println("taking the title of the checkBox");	
	return driver.findElement(cameraClibMode).getText();	
	}catch (Exception c){
	System.out.println("cameraClibMode -> No Element found");
	return null;
	}
}	

//Click startStop_calib_button
public void clickStartStop_calib_button(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(startStopButton));
	driver.findElement(startStopButton).click();
	System.out.println("startStop_calib_button has been clicked");		
	}catch (Exception c){
	System.out.println("startStopButton -> No Element found");
	}
}


//Click takeCalibCapture_button
public void clickTakeCalibCapture_button(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(takeCalibCaptureButton));
	driver.findElement(takeCalibCaptureButton).click();
	System.out.println("takeCalibCapture_button has been clicked");		
	}catch (Exception e){
	System.out.println("takeCalibCaptureButton -> No Element found");
	}
}


//Click IrColorButton
public void clickIrColorButton(){
try {
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(irColorButton));
	driver.findElement(irColorButton).click();
	System.out.println("ir_color_button has been clicked");	
	}catch (Exception e) {
		System.out.println("irColorButton -> No Element found");
	}
}

//Click AutoManualButton
public void clickAutoManualButton(){
try {
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(autoManualButton));
	driver.findElement(autoManualButton).click();
	System.out.println("auto_Manual_Button has been clicked");	
	}catch (Exception e) {
		System.out.println("auto_Manual_Button -> No Element found");
	}
}

//Click About_Button
public void clickAbout_Button(){
try{
	(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(aboutButton));
	driver.findElement(aboutButton).click();
	System.out.println("about_Button has been clicked");		
	}catch (Exception e){
	System.out.println("about_Button -> No Element found");
	}
}

//Get About Dialog Text
public String get_About_Dialog(){
try{
	Dialog = driver.findElement(aboutDialog).getText();
//	System.out.println("about dialog data =  " +Dialog);		
	}catch (Exception e){
	System.out.println("about dialog -> No Element found");
	}
return Dialog;

}






//scroll element 
	/**
	 *   
			  //get initial third row location
				WebElement row = (WebElement) driver.findElementByName("20");
			    Point location1 = row.getLocation();
			    Point center = getCenter(row);
			    //perform swipe gesture
			    driver.swipe(center.getX(), center.getY(), center.getX(), center.getY()+300, 0);
			    Thread.sleep(500);
			    driver.swipe(center.getX(), center.getY(), center.getX(), center.getY()-300, 0);
			    Thread.sleep(500);
			    //get new row coordinates
			    Point location2 = row.getLocation();
			    assertEquals(location1.getX(), location2.getX());
			    assertNotSame(location1.getY(), location2.getY());
			    
			    
			  private static Point getCenter(WebElement element) {
		      Point upperLeft = element.getLocation();
		      org.openqa.selenium.Dimension dimensions = element.getSize();
		      return new Point(upperLeft.getX() + dimensions.getWidth()/2, upperLeft.getY() + dimensions.getHeight()/2);
		    }
	 */






public void Test1() throws InterruptedException{

	//Set check box
	this.setCameraClibMode();
	Thread.sleep(2000);
	//Click startStop_calib_button
	this.clickStartStop_calib_button();
	Thread.sleep(2000);
	//Click takeCalibCapture_button
	this.clickTakeCalibCapture_button(); 
	Thread.sleep(2000);
	//Click startStop_calib_button
	this.clickStartStop_calib_button();
	Thread.sleep(2000);
	}	
	
	
	

	
	
	
}
