package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_parent {
	
	//we will have constructor:
	//constructor is a special method which initializes the value, its always same name as class, and doesn't have return value
	//we will have browser initialization
	//we  will have method for launching our url
	
	//Apache POI - interface
	//fileinputstream class is responsible to read value from config file
	//fileoutputstream class is for writing data/value inside config file
	//properties class, given by java, will help us to distribute value in test case
	
	public static Properties metaprop;
	public static WebDriver driver;
	
	public Base_parent () {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\dec16\\config\\dec16config.properties");
			
			metaprop = new Properties() ;
			metaprop.load(files);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	   public void metaBrowserinit () {
		   
		   String metaBrowser = metaprop.getProperty("Browser1");
		   
		   if (metaBrowser.equalsIgnoreCase("Chrome")) {
			   
			   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\WebDriver\\chromedriver.exe" );
			   driver = new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.manage().deleteAllCookies();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Test_data.implicitlywait));
			   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Test_data.pageloadtime));  
		   }
		   
		   else if (metaBrowser.equalsIgnoreCase("Firefox")) {
			   
		   }
	   }
	
	
	   public static void metaLaunchURL(String URL) {
		   
		   driver.get(metaprop.getProperty("URL1"));
		   
		   
	   }
	
	
	
}
