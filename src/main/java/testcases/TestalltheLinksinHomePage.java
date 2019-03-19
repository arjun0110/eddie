package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TestalltheLinksinHomePage  extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Verify all the links in home page";
		testDescription="Verify whether all the links are opening properly in homepage";
		testNodes="Links";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC025";

		
	}
	
	@Test(dataProvider="fetchData")
	public void twoproductstocart(String brand) throws InterruptedException  {
		
		
			new HomePage()
			.urlcheck();
			

}
}
