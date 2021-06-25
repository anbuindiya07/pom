package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectMethod;

public class Loginpage extends ProjectMethod{
	
	
	public Loginpage(ChromeDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public Loginpage enterUserdetails(String username , String password)
	
	{
		
		driver.findElementByXPath("//input[@id='username']").sendKeys(username);
		driver.findElementByXPath("//input[@type='password']").sendKeys(password);
		return this;
	}
	
	public Loginpage clickLoginbtn()
	
	{
		
		driver.findElementByXPath("//input[@type='submit']").click();
		return new Loginpage(driver);
	}

	

}
