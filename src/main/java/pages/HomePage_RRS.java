package pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage_RRS extends ProjectMethods{
	
	public HomePage_RRS() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//*[@class='active_rrs']")
	private WebElement rrs;
	
	public HomePage_RRS verifyrrs()
	{
		refresh();
		try {
			pageScrollUp();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(rrs);
		highLighterMethod(driver, rrs);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='default_kids']")
	private WebElement rrskid;
	
	@FindBy(how=How.XPATH,using="//*[@id='KanaLiveChatButton2']")
	private WebElement chat;
	
	public HomePage_RRS verifyrrskids()
	{
		refresh();
		verifyDisplayed(rrskid);
		highLighterMethod(driver, rrskid);
		verifyDisplayed(chat);
		highLighterMethod(driver, chat);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[contains(text(),'Stores')]")
	private WebElement stores;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-mens']/p")
	private WebElement men;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rrsglobalnav-womens\"]/p")
	private WebElement women;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/kids/index.jsp?cm_sp=nav-_-kids-_-kids']")
	private WebElement kids;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/accessories/?cm_sp=nav-_-accessories-_-accessories']")
	private WebElement accessories;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"rrsglobalnav-nutrition\"]/a")
	private WebElement nutrition;
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsglobalnav-brands']/a")
	private WebElement brand;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/outlet/?cm_sp=nav-_-sale-_-sale']")
	private WebElement sale;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/product/shoe-dog.jsp?cm_sp=nav-_-shoedog-_-shoefinder']")
	private WebElement fitfinder;
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/products/RAC55/']")
	private WebElement vip;
	
	public HomePage_RRS verifymenu()
	{
		
		verifyDisplayed(men);
		highLighterMethod(driver, men);
		

		verifyDisplayed(women);
		highLighterMethod(driver, women);

		verifyDisplayed(kids);
		highLighterMethod(driver, kids);

		verifyDisplayed(accessories);
		highLighterMethod(driver, accessories);

		verifyDisplayed(nutrition);
		highLighterMethod(driver, nutrition);

		verifyDisplayed(brand);
		highLighterMethod(driver, brand);

		verifyDisplayed(sale);
		highLighterMethod(driver, sale);

		verifyDisplayed(fitfinder);
		highLighterMethod(driver, fitfinder);

		verifyDisplayed(vip);
		highLighterMethod(driver, vip);
		
		return this;
	}
	
	public HomePage_RRS verifystores()
	{
		
		verifyDisplayed(stores);
		highLighterMethod(driver, stores);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='cart']")
	private WebElement cart;
	
	public HomePage_RRS verifycart()
	{
		
		verifyDisplayed(cart);
		highLighterMethod(driver, cart);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'My Account')]")
	private WebElement acc;
	
	public HomePage_RRS verifyaccount()
	{
		
		verifyDisplayed(acc);
		highLighterMethod(driver, acc);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='call-time']")
	private WebElement call;
	
	public HomePage_RRS verifycontact()
	{
		
		verifyDisplayed(call);
		highLighterMethod(driver, call);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;
	
	public HomePage_RRS verifysearchbutton()
	{
		verifyDisplayed(searchbutton);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'FIT FINDER')]")
	private WebElement FIRELE;
	
	public FitFinder clickFitFinder()
	{
		refresh();
		click(FIRELE);
		return new FitFinder();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'searchForm')]")
	private WebElement searchfieldkids;
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@href,'/rrs/brand/?cm_sp=nav-_-brands-_-brands')]")
	private WebElement brands;
	
	public HomePage_RRS searchbrands()
	{
		refresh();
		mouseHover(brands);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'R Gear, Shop Now')]")
	private WebElement rgear;
	
	public Searchresults rgearbrand()
	{
		click(rgear);
		return new Searchresults();
	}

	
	public Searchresults entersearchkey(String xpath,String data)
	{


		refresh();
		
		smallWait();
		verifyDisplayed(searchfield);
		
		explicitWaitsend(xpath,data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/input")
	private WebElement mail;
	
	@FindBy(how=How.XPATH,using="//*[@class='klaviyo_inline_fieldset']/button")
	private WebElement clicksubs;
	
	
	public Searchresults entersearchkeykids(String xpath,String data)
	{

		type(mail,"u.RJUNKUMr@gmail.com");
		click(clicksubs);
	
				
		smallWait();
	
		
		explicitWaitsend(xpath,data);
		
		clickenter();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Searchresults();
		
	}
	
	public Searchresults entersearchkeyandscrolltobottom(String data)
	{


		refresh();
		type(searchfield, data);
		
		click(searchbutton);
		scrollBottom();
		return new Searchresults();
		
	}

	@FindBy(how=How.XPATH,using="//div[@class='login-section']/ul/li/a")
	private WebElement myaccountlink;
	
	public MyAccounts clickmyaccount()
	{
		refresh();
		click(myaccountlink);
		return new MyAccounts();
	}


	public Login clickaccount()
	{
		refresh();
		highLighterMethod(driver, myaccountlink);
		click(myaccountlink);
		return new Login();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'coop dual column')]")
	private WebElement shopnowlink;
	
	public ShopNow clickshopNow()
	{
		refresh();
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(shopnowlink);
		return new ShopNow();
	}
			
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfields;
	@FindBy(how=How.XPATH,using="//*[contains(@value,'SEARCH')]")
	private WebElement sbutton;	
	public ViewCart enterprodname(String name)
	{
		
		type(searchfields,name);
		click(sbutton);
		return new ViewCart();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'storelocator2')]")
	private WebElement clickStores;
	
	public Stores storelink()
	{
		refresh();
		click(clickStores);
		return new Stores();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'chat-btn-header2')]")
	private WebElement clickchat;
	
	public Stores chatlink()
	{
		refresh();
		click(clickchat);
		return new Stores();
	}
	@FindBy(how=How.XPATH,using="//*[@class='default_kids']")
	private WebElement rrskids;
	
	public HomePage_RRS clickkidslink()
	{
		refresh();
		click(rrskids);
		return this;
	}
	
	public UserCreatedConfirmation clickkidslinks()
	{
		refresh();
		click(rrskids);
		return new UserCreatedConfirmation();
	}
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/products/RAC55/']")
	private WebElement viplink;
	
	public HomePage_RRS vipfamily()
	{
		refresh();
		click(viplink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='btn-copy']")
	private WebElement joinbutton;
	
	public Productdetails clickjoin()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(joinbutton);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Productdetails();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='rrsmenubar2']/li[3]")
	private WebElement kidsbrand;
	
	public HomePage_RRS mousehoverbrands()
	{
		
		mouseHoverclick(kidsbrand);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@title='Asics']")
	private WebElement asics;
	
	public Searchresults clickasics()
	{
		
		click(asics);
		return new Searchresults();
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbuttons;

	
	public Searchresults entersearch(String data)
	{


		refresh();
		FluentWait();
		
		verifyDisplayed(searchfield);
		highLighterMethod(driver, searchfield);
		
		type(searchfield, data);
		
		click(searchbuttons);
		return new Searchresults();
		
	}
	
	
	
	
	

}