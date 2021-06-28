package Pages;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2E {
	
public static void main(String[] args) throws InterruptedException
	
	{
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	driver.get("https://login.salesforce.com/");
	driver.findElementByXPath("//input[@id='username']").sendKeys("cypress@testleaf.com");
	driver.findElementByXPath("//input[@type='password']").sendKeys("Selbootcamp@123");
	driver.findElementByXPath("//input[@type='submit']").click();
	Thread.sleep(30000);
	
	driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']").click();
	driver.findElementByXPath("//*[@class='slds-icon-waffle']").click();
	Thread.sleep(30000);
	driver.findElementByXPath("//button[text()='View All' and @class='slds-button']").click();
	Thread.sleep(30000);
	driver.findElementByXPath("//p[contains(text(),'Service Console')]").click();
	
	Thread.sleep(30000);
		
		
			
			driver.findElementByXPath("//div[@class='slds-context-bar__icon-action']").click();
			
			List<WebElement> selfiles = driver.findElements(By.xpath("(//li[@role='presentation']//span[text()='Files'])"));
			String expectedoption = "Files"; 
			for(int i = 1; i<=selfiles.size();i++) 
			{ 
				String actualoption =driver.findElement(By.xpath("(//li[@role='presentation']//span[text()='Files'])"+"["+i	+"]")).getText(); 
				if(actualoption.contains(expectedoption)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//span[text()='Files'])"+"["+i+"]")).click();
					System.out.println("the File is selected "); 
					break;
				}
			}			
			//return new SelectFiles(driver);
		
		
			Thread.sleep(30000);
		
			driver.findElementByXPath("//span[@title='Last Modified Date']").click();
			//return new SelectFiles(driver);
			
			Thread.sleep(30000);
		
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement dropdown = 			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'slds-buttonlds-button--icon-x-smallslds-button--icon-borderled')]"))); 
			driver.executeScript("arguments[0].click();",dropdown );
		
			List<WebElement> publiclink = driver.findElements(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"));
			String expectedlink = "Public Link"; 
			for(int i = 1; i<=publiclink.size();i++) 
			{ 
				String actuallink =driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).getText(); 
				if(actuallink.contains(expectedlink)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).click();
					System.out.println("the Public link is Clicked "); 
					break;
				}
			}			
			
			WebElement publictextbox = driver.findElementByXPath("//input[@name='publicLinkURL']");
			System.out.println(publictextbox.isEnabled());
			
			driver.findElementByXPath("//button[@title='Close this window']").click();
			
			//return new SelectFiles(driver);
		
		
			@SuppressWarnings("deprecation")
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			WebElement dropdown1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]"))); 
			driver.executeScript("arguments[0].click();",dropdown1 );
			
			List<WebElement> download = driver.findElements(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"));
			String expectedopt = "Download"; 
			for(int i = 1; i<=download.size();i++) 
			{ 
				String actualopt =driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).getText(); 
				if(actualopt.contains(expectedopt)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).click();
					System.out.println("the file is downloaded "); 
					break;
				}
			}
			
			String downloadFilepath = "C:\\Users\\anbukarasic\\Desktop\\Training";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			chromePrefs.put("download.default_directory", downloadFilepath);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			ChromeDriver driver1 = new ChromeDriver(options);
					
			//return new SelectFiles(driver);
		
			@SuppressWarnings("deprecation")
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			WebElement dropdown2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'slds-button slds-button--icon-x-small slds-button--icon-border-filled')]"))); 
			driver.executeScript("arguments[0].click();",dropdown2 );
			
			List<WebElement> share = driver.findElements(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"));
			String expectedopt1 = "Share"; 
			for(int i = 1; i<=share.size();i++) 
			{ 
				String actualopt =driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).getText(); 
				if(actualopt.contains(expectedopt1)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='menuitem'])"+"["+i+"]")).click();
					System.out.println("the Share option is clicked "); 
					break;
				}
			}
			
			//11. Click on search user and select the Derrick Dsouza
			List<WebElement> firstuser = driver.findElements(By.xpath("(//li[@role='presentation']//a[@role='option'])"));
			String selectfiruser = "Derrick Dsouza"; 
			for(int i = 1; i<=firstuser.size();i++) 
			{ 
				String actualuser =driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='option'])"+"["+i+"]")).getText(); 
				if(actualuser.contains(selectfiruser)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='option'])"+"["+i+"]")).click();
					System.out.println("the Derrick Dsouza is selected "); 
					break;
				}
			}
			
			//12. Verify the Error message "Can't share file with the file owner."
			WebElement errormsg = driver.findElementByXPath("//li[@class='form-element__help']");
			String actualmsg = errormsg.getText();
			System.out.println(actualmsg);
			String	expterrmsg = "Can't share file with the file owner.";
			if (expterrmsg.equals(actualmsg))
			{
				System.out.println("The Expected Error message is received"+expterrmsg);
			}
			else
			{
				System.out.println("The Expected Error message is not received"+actualmsg);
			}	
					
			//13. Remove Derrick Dsouza and Select the second user in the list
			
			driver.findElementByXPath("//span[@class='deleteIcon']").click();
			
			//and Select the second user in the list
			List<WebElement> secuser = driver.findElements(By.xpath("(//li[@role='presentation']//a[@role='option'])"));
			String selectsecuser = "Integration User"; 
			for(int i = 1; i<=secuser.size();i++) 
			{ 
				String actualuser =driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='option'])"+"["+i+"]")).getText(); 
				if(actualuser.contains(selectsecuser)) 
				{ 
					driver.findElement(By.xpath("(//li[@role='presentation']//a[@role='option'])"+"["+i+"]")).click();
					System.out.println("the second user in the list is selected "); 
					break;
				}
			}
			
			//14. Add a message as "Bootcamp_Nupela_<your name>"
			WebElement addmsg = driver.findElementByXPath("//textarea[@class='textArea textarea']");
			String addmsgstr = "Bootcamp_Nupela_Anbukarasi";
			addmsg.sendKeys(addmsgstr);
			
			//Click on Share button	
			driver.findElementByXPath("//button[@class='slds-button slds-button--neutral share uiButton--default uiButton--brand uiButton']").click();
			
			
			//15. Verify "You shared <item> with <shared user>" message
			
			@SuppressWarnings("deprecation")
			WebDriverWait wait3 = new WebDriverWait(driver, 30);
			WebElement message = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]")));
			String output = message.getText();
			String[] split = output.split(" ");
			System.out.println(split[0]+split[1]+ split[2]+split[3]+split[4]+split[5]+split[6]+split[7]);
			
			//return new SelectFiles(driver);
		}	

}	

		




