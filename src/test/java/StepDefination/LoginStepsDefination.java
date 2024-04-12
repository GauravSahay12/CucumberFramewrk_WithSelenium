package StepDefination;

import java.time.Duration;

import org.junit.runner.RunWith;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginStepsDefination {
	static WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver= new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
	   driver.get("https://www.saucedemo.com/v1/");
			   }

	@When("User enter valid username and passwrd")
	public void user_enter_valid_username_and_passwrd() {
	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.cssSelector("input[id=user-name]")).sendKeys("standard_user");
	driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");
	
	}

	@And("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("input[id=login-button]")).click();
		 
	}

	@Then("User should be navigate to homepage")
	public void user_should_be_navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		//Here we navigate to another page where new element is found
		
	  Assert.assertTrue(driver.findElements(By.xpath("//div[@id='header_container']/div[1]")).size()>0,"User navigate to homepage");
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //driver.close();
		driver.quit();
	}




}
