package org.eBanking.TestCase;


import org.eBanking.Utilities.ReadConfigFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;


public class BaseClass {
	
	public static WebDriver driver;
	ReadConfigFile readConfig=new ReadConfigFile();
	public String userName=readConfig.getUserName();
	public String password=readConfig.getPassword();
	public String url=readConfig.getUrl();	
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)	
	{		
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());	
			System.out.println("Starting - chrome-->"+readConfig.getChromePath());
			driver=new ChromeDriver();			
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", readConfig.getFirefoxPath());		
			System.out.println("Starting - firefox->"+readConfig.getFirefoxPath());
			driver=new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", readConfig.getIePath());
			System.out.println("Starting - ie-->"+readConfig.getIePath());
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@AfterClass
	public void closedown()
	{
		driver.quit();
	}
	
	
}
