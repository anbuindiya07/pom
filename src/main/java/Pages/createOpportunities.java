package Pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectMethod;

public class createOpportunities extends ProjectMethod{

	public createOpportunities(ChromeDriver driver)
	{
		
		this.driver =driver;
	}
	
	public createOpportunities clickOpportunitiesMenu()
	{
		
		driver.executeScript("arguments[0].click()", driver.findElementByXPath("//a[@title='Opportunities']/span"));
		return this;
	}
	
	public createOpportunities clickNewbutton()
	{
		driver.findElementByXPath("//a[@title='New']").click();
		return this;
	}
	
	public createOpportunities enterOpportunityInformation(String Oppname)
	
	{
		
		WebElement oppname1= driver.findElementByXPath("(//label[text()='Opportunity Name']/following::div[1]/input)");
		oppname1.sendKeys(Oppname);
		String opprtunityname=	driver.findElementByXPath("(//label[text()='Opportunity Name']/following::div[1]/input)").getAttribute("value").toString();
		System.out.println("Entered opprtunity name is: " + opprtunityname);
		
		//Choose close date as Today	
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		driver.findElementByXPath("//input[@name='CloseDate']").sendKeys(dtf.format(localDate));
		
		//Select 'Stage' as Need Analysis
		driver.findElement(By.xpath("(//input[@role='combobox'])[4]")).click();
		driver.findElement(By.xpath("//span[contains(@title,'Needs Analysis')]")).click();
		return this;
		
	}
	
	public createOpportunities clickSaveButton()
		
	{
		driver.findElementByXPath("//button[text()='Save']").click();
		return this;
		
	}
	
	public createOpportunities verifyOppNameMsg()
	{
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement message = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]")));
		String output = message.getText();
		String[] split = output.split(" ");
		System.out.println("The "+split[0]+split[1]+ split[2]+split[3]+" successfully");
		return new createOpportunities(driver);
		
	}
	
}
