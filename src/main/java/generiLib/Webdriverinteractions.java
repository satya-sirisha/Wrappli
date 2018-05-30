package generiLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import utilities.ReadbyFile;

public class Webdriverinteractions {
	 static WebDriver driver;
	 static DesiredCapabilities cap;
	  public static WebDriver getdesiredbrowser(String bname) {
		
		  switch (ReadbyFile.getdesiredproperty(bname).toUpperCase()) {
		case "CHROME":
//			cap=new DesiredCapabilities();
//			cap.setBrowserName("CHROME");
//			cap.setJavascriptEnabled(true);
//			cap.setCapability(CapabilityType.PLATFORM, Platform.WINDOWS);
		System.setProperty("webdriver.chrome.driver","D:\\SIRISHA\\15-12-2017\\com.Adactin.Wrappli\\UpdatedDriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();

		
			break;
			
		case "FIREFOX":
			System.setProperty("user.dir","/Drivers/geckodriver.exe");
			
			  
			   driver = new FirefoxDriver();
			break;
			
		case "IE":
			System.setProperty("user.dir", "Drivers/iedriver.exe");
			driver=new SafariDriver();

		default:
			System.out.println("Not a valid browser");
			break;
		}
		  
	 return driver;
		  
	  }
	 
public static WebDriver Getcurrentdriver() {
	
	if(driver==null) {
		
		driver=getdesiredbrowser(Constants.browser);
	}
	
	return driver;
	
}


public  void Geturl(String name) {
	Getcurrentdriver().get(ReadbyFile.getdesiredproperty(Constants.url));
	
}

public void maximize() {
Getcurrentdriver().manage().window().maximize();
}

public void pageloadtimeout() {
	Getcurrentdriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
}
	  
public void implictwait() {
		Getcurrentdriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

public void quit() {
	Getcurrentdriver().quit();
}

public void close() {
	Getcurrentdriver().close();
}
	  
}
