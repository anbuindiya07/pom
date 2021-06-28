package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectMethod {
	
	public ChromeDriver driver;
	
	
	@BeforeMethod
	
	public void Navigatetoopportunities() throws Exception
	
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElementByXPath("//input[@id='username']").sendKeys("makaia@testleaf.com");
		driver.findElementByXPath("//input[@type='password']").sendKeys("India@123");
		driver.findElementByXPath("//input[@type='submit']").click();
		Thread.sleep(30000);

		//driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']").click();
		driver.findElementByXPath("//*[@class='slds-icon-waffle']").click();
		Thread.sleep(30000);
		
	}

	@AfterMethod
	public void Closesalesfore()
	{
		driver.close();
	}
	}

		
		
	