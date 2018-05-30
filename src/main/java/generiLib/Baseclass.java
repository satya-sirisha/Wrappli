package generiLib;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import utilities.ReadbyFile;

public class Baseclass extends  Webdriverinteractions{
	public void Click(WebElement element) {
		element.click();
		
	}
	public void Sendkeys(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public void SelectByText(WebElement element,String value) {
	Select sel =new Select(element);
	sel.selectByVisibleText(value);

}
	
	public void Datepicker(WebElement element1,WebElement element2,List<WebElement>allelements) {
		String Startdate =ReadbyFile.getdesiredproperty(Constants.date);
		String[] splitter=Startdate.split("-")	;
		String Startday =splitter[0];
		String Startmnth_year =splitter[1];
		element1.click();
		if(element2.getText().equalsIgnoreCase(Startmnth_year)) {
			for (int i = 0; i < allelements.size(); i++) {
		System.out.println(allelements.get(i).getText());
		if((allelements.get(i).getText()).equalsIgnoreCase(Startday)){
			allelements.get(i).click();
		}
			}
		}
		
	}
	
	public void slidebar(WebElement element) {
		Dimension dim =element.getSize();
		System.out.println(dim);
		int x = dim.getWidth();
		System.out.println(x);
		Actions act = new Actions(Webdriverinteractions.Getcurrentdriver());
		act.clickAndHold(element).moveByOffset(x-200,0).release().build().perform();
		
	}
	
	public void Popup(WebElement element) {
		pageloadtimeout();
	   Alert a = Webdriverinteractions.Getcurrentdriver().switchTo().alert();
		a.accept();
		
	}
	
	public void scrolling() {
		JavascriptExecutor jse = (JavascriptExecutor)Webdriverinteractions.Getcurrentdriver();
		jse.executeScript("scroll(0,400)");
	}
}