package base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ProjectMethod {
	
	public ChromeDriver driver;
	public Properties prop;
	public String excelFileName;
	

	@DataProvider(name="fetchdata")
	public void sendData() throws IOException
	{
		
		
		
	
	}

}
