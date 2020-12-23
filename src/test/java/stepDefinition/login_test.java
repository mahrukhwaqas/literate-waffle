package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_test {
WebDriver driver;


@Given("^I am on the login page \\.$")
public void i_am_on_the_login_page()  {
	System.setProperty("webdriver.chrome.driver", "/Users/mahrukh/Desktop/selenium/chromedriver");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	driver.get("https://login.salesforce.com/");

}

@Given("^I enter valid user name$")
public void i_enter_valid_user_name()  {
	driver.findElement(By.id("username")).sendKeys("test.user@gmail.com.test");
}

@Given("^and password$")
public void and_password()  {
	driver.findElement(By.id("password")).sendKeys("Pa55word"); 
}

@When("^I click the login button$")
public void i_click_the_login_button()  {
	driver.findElement(By.id("Login")).click();
}

@Then("^I should see the dashboard$")
public void i_should_see_the_dashboard()   {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Assert.assertTrue(driver.findElement(By.id("phHeaderLogoImage")).isDisplayed());
}
}
	
	

