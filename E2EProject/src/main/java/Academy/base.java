package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\naimulla\\eclipse-workspace\\E2EProject\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\naimulla\\eclipse-workspace\\E2EProject\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName=="firefox")
		{

		}
		else if(browserName=="IE")
		{
			
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
