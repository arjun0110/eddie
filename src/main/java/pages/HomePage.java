package pages;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	

	private static String[] links = null;
	private static int linksCount = 0;
	
	public HomePage urlcheck() throws InterruptedException
	{
		
		List<WebElement> linksize = driver.findElements(By.tagName("a")); 
		linksCount = linksize.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
		{
		links[i] = linksize.get(i).getAttribute("href");
		System.out.println(linksize.get(i).getAttribute("href"));
		} 
		
		// navigate to each Link on the webpage
		for(int i=0;i<linksCount;i++)
		{
		driver.navigate().to(links[i]);
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
		takeSnap();

		return this;
	}

}
