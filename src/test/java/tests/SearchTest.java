package tests;

import org.testng.Assert;
import org.testng.annotations.Test;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;





import pages.ResultPage;
import pages.SearchPage;

public class SearchTest extends TestBase {
	
	SearchPage searchobject;
	ResultPage resultobject; 
	
	@Test
	public void usersearch() {
		
		searchobject = new SearchPage(driver);
		searchobject.srch("istqb");
	}
	@Test
	public void checkresult() throws InterruptedException {
		resultobject = new ResultPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("internaional"));
	
		Assert.assertTrue(resultobject.firstoption.getText().contains("International Software Testing Qualifications Board"));
		resultobject.clickresult();
	}
	@Test
	public void clearsearch() {
		searchobject = new SearchPage(driver);
		searchobject.clearsearch();
	
		
		
	}

}
