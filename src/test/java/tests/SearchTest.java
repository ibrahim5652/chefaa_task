package tests;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends TestBase {
	
	SearchPage searchobjectPage;
	
	@Test
	public void usersearch() {
		
		searchobjectPage = new SearchPage(driver);
		searchobjectPage.srch();
	}

}
