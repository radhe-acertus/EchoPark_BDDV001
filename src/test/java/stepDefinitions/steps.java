package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class steps {
	
	public WebDriver driver;
	
	public LoginPage lp;
	
	@Given("User launched web browser")
	public void user_launched_web_browser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
	    
	}
	
	@When("User opens EchoPark URL {string}")
	public void user_opens_EchoPark_URL(String url) {
	   
		driver.get(url);
		driver.manage().window().maximize();
	}



	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		
		lp.setUserName(email);
		lp.setPassword(password);
	    
	}

	@Then("Clicks on Login button")
	public void clicks_on_Login_button() {
		
		lp.clicklogin();
	    
	}

	@Then("Page Titile should be {string}")
	public void page_Titile_should_be(String exp_title) {
		
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title))
		{
			System.out.println(act_title);
			Assert.assertTrue(true);
		}
		
		else 
		{
			Assert.assertTrue(false);
		}
	  
	}

	@Then("User clicks on Logout button")
	public void user_clicks_on_Logout_button() {
		
		lp.Click_LogOut();
	
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String exp_title) {
		
		String act_title=driver.getTitle();
		
		if(act_title.equals(exp_title))
		{
			System.out.println(act_title);
			Assert.assertTrue(true);
			
		}
		
		else
		{
			Assert.assertTrue(false);
		}
	
	}

	@Then("User closes the browser")
	public void user_closes_the_browser() {
		
		driver.quit();

	}

}
