package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition 
{
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
	    
	}

	@Then("click on Image")
	public void click_on_image()
	{
	   
	}

	@Then("click on logout button")
	public void click_on_logout_button() 
	{
	
	}

}
