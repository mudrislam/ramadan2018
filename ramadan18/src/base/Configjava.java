package base;

//import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import utils.Webdriverfunctions;

@SuppressWarnings("unused")
public class Configjava extends Webdriverfunctions{
	{System.setProperty("webdriver.chrome.driver","/uers/muhammedrislam/autotools/drivers/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().fullscreen();
	driver.get ("http://facebook.com");

	
	
	}
	{System.setProperty("webdriver.gecko.driver","/uers/muhammedrislam/autotools/drivers/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().window().fullscreen();
	driver.get ("http://facebook.com");
	}


	
	public String Browser="ff";

	@BeforeTest
	
	
	public void initDrivers() throws InterruptedException{
		
		
		if (Browser=="ch") {
		System.setProperty("webdriver.chrome.driver","/uers/muhammedrislam/autotools/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get ("http://facebook.com");
		Thread.sleep(550);
		}
		else if(Browser=="ff") {
			System.setProperty("webdriver.gecko.driver","/uers/muhammedrislam/autotools/drivers/geckodriver");
			driver = new FirefoxDriver();
			driver.get ("http://facebook.com");
			Thread.sleep(550);
			
		}

	}
}




	
	
	
	

