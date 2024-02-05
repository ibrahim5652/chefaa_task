package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(name = "q")
	WebElement searchfield;
	@FindBy(name = "btnK")
	WebElement searchclick;
	
	public void srch (String text) {
		searchfield.sendKeys(text);
		searchclick.click();
		
	}	
	
}


