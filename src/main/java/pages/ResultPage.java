package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends PageBase{

	public ResultPage(WebDriver driver) {
		super(driver);
		
	}
	


	@FindBy(xpath = "(//div[@class='notranslate TbwUpd NJjxre iUh30 ojE3Fb'])[1]")
	public WebElement firstoption;
	
	public void clickresult() {
		 firstoption.click();
	}
}
