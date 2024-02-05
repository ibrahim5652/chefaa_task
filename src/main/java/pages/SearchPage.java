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
	WebElement searchfieldElement;
	@FindBy(name = "btnK")
	WebElement searchclickElement;
	
	public void srch() {
		searchfieldElement.sendKeys("istqb");
		searchclickElement.click();
		
	}
	
}

