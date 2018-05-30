package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import generiLib.Baseclass;

public class CampaignView extends Baseclass{
	WebDriver driver;
	
	public CampaignView(WebDriver driver1) {
		this.driver=driver1;
	}
	@FindBy(how=How.XPATH,using="//*[@id='form1']/div[4]/div[3]/div[1]/div[2]/ul/li[7]/div/a/span")WebElement campaignview;
	@FindBy(how=How.XPATH,using="//*[@id='ddlCampaign_chzn']/div/div/input")WebElement Search_Campaign;
	@FindBy(how=How.XPATH,using="//*[@id='ddlCampaign_chzn']/div/div/input/u1")WebElement Select_campaign;
//	@FindBy(how=How.XPATH,using=".//*[@id='ddlCampaign_chzn']/a/span")WebElement campaignview;
//	@FindBy(how=How.XPATH,using=".//*[@id='ddlCampaign_chzn']/a/span")WebElement campaignview;
//	@FindBy(how=How.XPATH,using=".//*[@id='ddlCampaign_chzn']/a/span")WebElement campaignview;
	
	
	
	public void Campaignviewtest(String val1) {
		Click(campaignview);
//	List<WebElement>allelements = new ArrayList<WebElement>();
	//SelectedElement sel = new SelectedElement(Search_Campaign);
//	sel.selectByVisibleText("testabcd");
		Sendkeys(Search_Campaign, val1);
		Search_Campaign.sendKeys(Keys.DOWN);
		Search_Campaign.sendKeys(Keys.ENTER);
	}

}
