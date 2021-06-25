package Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectMethod;

public class EditOpportunity extends ProjectMethod{

	
	public EditOpportunity(ChromeDriver driver)
	{
		
		this.driver =driver;
	}
	
	
	public EditOpportunity searchOppByName(String oppname)
	{
		
		WebElement objentername= driver.findElementByXPath("(//input[@type='text'])[2]");
		objentername.sendKeys(oppname);
		objentername.sendKeys(Keys.ENTER);
		return this;
	}
	
	public EditOpportunity clickEditBtn()
	
	{
		WebElement table= driver.findElementByXPath("(//table[@role='grid'])[2]//tr[1]/th/span/a");
		table.click();
		driver.findElementByXPath("//*[@class='slds-button slds-button_icon-border-filled']").click();
		driver.findElementByXPath("//a[@name='Edit']").click();
		return this;
	}
	
	public EditOpportunity selectDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    LocalDate localDate = LocalDate.now().plusDays(1);
		WebElement closedate = driver.findElementByXPath("//input[@name='CloseDate']");
		closedate.clear();
		closedate.sendKeys(dtf.format(localDate));
		return this;
	}
}
