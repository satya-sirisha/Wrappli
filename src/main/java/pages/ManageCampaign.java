package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generiLib.Baseclass;
import generiLib.Webdriverinteractions;

public class ManageCampaign extends Baseclass{
	
	WebDriver driver;
	public ManageCampaign(WebDriver driver1) {
		this.driver=driver1;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='form1']/div[4]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input")WebElement Submit;
	@FindBy(how=How.XPATH,using="//*[@id='Headerpad']//following::input[2]")WebElement  sub;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$Editcampaign")WebElement Edit;
	@FindBy(how=How.XPATH,using="//*[@id='Headerpad']//following::input[5]")WebElement Popup_ok;
	
	@FindBy(how=How.XPATH,using="ContentPlaceHolder1_CampaignStatus")WebElement Text1;
	@FindBy(how=How.XPATH,using="//*[@id='Headerpad']")WebElement Text2;
	
	
	
	public void SubmitCampaign() throws InterruptedException {
	//System.out.println(Text1.getText());
		
		
		//System.out.println("the text is"+Text2.getText());
//		WebDriverWait wait =new WebDriverWait(driver, 120);
//		WebElement availability =wait.until(ExpectedConditions.visibilityOf(Submit));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", Submit);
		//sub.click();
		
        
//	WebDriverWait wait = new WebDriverWait(Webdriverinteractions.Getcurrentdriver(), 120);
//    WebElement Availability=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='form1']/div[4]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input")));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("arguments[0].scrollIntoView(true);", Availability);
//	    Availability.click();
	
//		WebElement availability1 =wait.until(ExpectedConditions.visibilityOf(Popup_ok));
//		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();",Popup_ok);
		try {
		WebDriverWait wait1 = new WebDriverWait(driver, 2);
	    wait1.until(ExpectedConditions.visibilityOf(Popup_ok));
	    Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    alert.accept();
	   
		
	} catch (Exception e) {
	    //exception handling
	}
	}
	
	public void EditCampaign() {
		Click(Edit);
	}
}
