package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import generiLib.Baseclass;
import generiLib.Constants;
import utilities.ReadbyFile;

public class LoginPage extends Baseclass {
	
	 WebDriver driver;



	public LoginPage(WebDriver driver1) {
			this.driver= driver1;
		 }
		
	
	@FindBy(how=How.XPATH,using="//*[@id=\"form1\"]/div[3]/div/div[2]/div[1]/h1") WebElement TitleName;
	@FindBy(how=How.XPATH,using="//*[@id=\"txtLogincode\"]") WebElement Username;
	@FindBy(how=How.NAME,using="txtPassword") WebElement Password;
	@FindBy(how=How.NAME,using="btnAdvertiserLogin") WebElement Signin;
	@FindBy(how=How.ID,using="forget-password") WebElement ForgotPassword;
	@FindBy(how=How.XPATH,using="//*[@id=\"form1\"]/div[3]/div/div[2]/div[2]/div/div[2]/div/p/a") WebElement WebsiteLink;
	@FindBy(how=How.XPATH,using="//*[@id=\"form1\"]/div[3]/div/div[2]/div[2]/div/div[2]/div/p") WebElement copyright;
	
	
	
public void logintest(String value1,String value2) {
//	TitleName.isDisplayed();
//	System.out.println(TitleName.getText());
//	copyright.isDisplayed();
//	System.out.println(copyright.getText());
	Sendkeys(Username, value1);
	Sendkeys(Password, value2);
	Click(Signin);
	
}
	
	
	
	
}
