package tests;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generiLib.Constants;
import generiLib.Webdriverinteractions;
import pages.CampaignPlanner;
import pages.CampaignView;
import pages.LoginPage;
import pages.ManageCampaign;

public class Testcase1 {
	Webdriverinteractions webinteractions;
	LoginPage loginpage;
	CampaignPlanner campaignplanner;
	CampaignView campaignview;
	ManageCampaign managecampaign;

	@BeforeMethod
	public void setup() {
		webinteractions = new Webdriverinteractions();
		Webdriverinteractions.Getcurrentdriver();
        webinteractions.Geturl(Constants.url);
		webinteractions.maximize();
		webinteractions.pageloadtimeout();
		//Login function
		loginpage = new LoginPage(Webdriverinteractions.Getcurrentdriver());
		loginpage=PageFactory.initElements(Webdriverinteractions.Getcurrentdriver(), LoginPage.class);
		loginpage.logintest("Paykel","Wrappli2017");
	}
	
	
	@Test(priority=1,description="This testcase verifies weather user is able to create planner and save it ")
	public void loginTest() throws InterruptedException {
		
	//creating campaignPlanner and save
		campaignplanner=new CampaignPlanner(Webdriverinteractions.Getcurrentdriver());
		campaignplanner=PageFactory.initElements(Webdriverinteractions.Getcurrentdriver(), CampaignPlanner.class);
		campaignplanner.CampaignPlanner_create("testabcd18", "test1234", "Decal","Perth");
		campaignplanner.Campaignpalnner_Save();
//		campaignplanner.CampagnPlanner_Getquote();
//		campaignplanner.CampaignPlanner_GetquoteNO("test789");
//	}
//		
//		@Test(priority=2,description="This testcase verifies weather user is able to open saved planner and submit it")
//	
//		public void SubmitQuote() {
		//open saved campaign planner 
		webinteractions.pageloadtimeout();
		campaignview=new CampaignView(Webdriverinteractions.Getcurrentdriver());
		campaignview=PageFactory.initElements(Webdriverinteractions.Getcurrentdriver(), CampaignView.class);
		campaignview.Campaignviewtest("testabcd18");
		
	//Save campaign planner
		managecampaign=new ManageCampaign(Webdriverinteractions.Getcurrentdriver());
		managecampaign=PageFactory.initElements(Webdriverinteractions.Getcurrentdriver(), ManageCampaign.class);
		System.out.println(Webdriverinteractions.Getcurrentdriver().getCurrentUrl());
		managecampaign.SubmitCampaign();
		
	}
}
