package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectMethod;

public class appLauncher extends ProjectMethod{
	

	public appLauncher(ChromeDriver driver)
	{
		
		this.driver =driver;
	}
	
	public appLauncher clickSales()
	{
		
	driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']").click();
	driver.findElementByXPath("//*[@class='slds-icon-waffle']").click();
	driver.findElementByXPath("//button[text()='View All' and @class='slds-button']").click();
	driver.findElementByXPath("//p[contains(text(),'Service Console')]").click();
	return new appLauncher(driver);
	
	}
}
