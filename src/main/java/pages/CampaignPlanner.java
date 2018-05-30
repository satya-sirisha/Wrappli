package pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import generiLib.Baseclass;
import generiLib.Webdriverinteractions;

public class CampaignPlanner extends Baseclass{
	
	WebDriver driver;
	
	public CampaignPlanner(WebDriver driver1) {
		this.driver=driver1;
	}
	
	
	
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$txtCampName") WebElement CampaignName;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$txtDesc") WebElement CampaignDescription;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$WrapType") WebElement Type;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$DateTextbox") WebElement Datepicker;
	@FindBy(how=How.XPATH,using="//div[@class='datepicker-days']/table/thead/tr/th[@class='datepicker-switch']")WebElement StartMnth_year;
	@FindBy(how=How.XPATH,using=" //div[@class='datepicker-days']/table/tbody/tr/td[@class='day']")List<WebElement> allDates;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$ddlMetro") WebElement City;
	@FindBy(how=How.XPATH,using="//*[@id=\"ContentPlaceHolder1_l2\"]/div[1]/div/span/span[1]/span[1]/span[1]")WebElement SourceCarsSlidebar;
	@FindBy(how=How.XPATH,using="//*[@id=\"ContentPlaceHolder1_l2\"]/div[3]/div/span[1]/span[1]/span[1]/span[2]")WebElement MonthsSlidebar;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$btnSave")WebElement Save;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$Button5")WebElement Getquote;
	@FindBy(how=How.ID,using="btnyes")WebElement Getquote_Yes;
	@FindBy(how=How.XPATH,using="//*[@id=\"myModal\"]/div/div/div[2]/center/button[2]")WebElement Getquote_No;
	@FindBy(how=How.NAME,using="ctl00$ContentPlaceHolder1$massage2")WebElement Dislike_notes;
	@FindBy(how=How.ID,using="htmlbtnsendfordislike")WebElement Dislike_click;
	@FindBy(how=How.XPATH,using="//*[@id=\"sendmessage\"]/div/div/div/a")WebElement Dislike_popup;
	
	
	
	public void CampaignPlanner_create(String val1,String val2,String val3,String val4) throws InterruptedException {
		
		Sendkeys(CampaignName, val1);
		Sendkeys(CampaignDescription, val2);
		SelectByText(Type, val3);
		Thread.sleep(4000);
		//Selecting date from Calendar
		Datepicker(Datepicker, StartMnth_year, allDates);
		//if(StartMnth_year.getText().equalsIgnoreCase(Startmnth_year)) {
//			for (int i = 0; i < allDates.size(); i++) {
//		System.out.println(allDates.get(i).getText());
//		if((allDates.get(i).getText()).equalsIgnoreCase(Startday)){
//			allDates.get(i).click();
//		}
//			}
//		}
		
		//Selecting the city
		SelectByText(City, val4);
		Thread.sleep(4000);
		//selecting number of cars
		slidebar(SourceCarsSlidebar);
		Thread.sleep(3000);
		//selecting number of months
		slidebar(MonthsSlidebar);
		}
	//Save CampainPlanner
	public void Campaignpalnner_Save() throws InterruptedException {
		Click(Save);
		Thread.sleep(3000);
}
  //Get Quote
	public void CampagnPlanner_Getquote() {
		Click(Getquote);
		}
	//Accept quote
	public void CampaignPlanner_GetquoteYes() {
		Click(Getquote_Yes);
	}
	//Reject quote and give reasons
	public void CampaignPlanner_GetquoteNO(String value) {
		scrolling();
		Click(Getquote_No);
		Sendkeys(Dislike_notes, value);
		Click(Dislike_click);
		Popup(Dislike_popup);
		
	}
	}
