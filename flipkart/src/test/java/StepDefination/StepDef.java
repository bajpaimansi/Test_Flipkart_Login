package StepDefination;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef{
	  WebDriver driver;
	 
	  @Given("^Flipkart Website is loaded$") public void
	  flipkart_Website_is_loaded() throws Throwable 
	  {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/"); 
	  }
	 
	 
	 @When("^User enters Username and Password and login$") 
	 public void user_enters_Username_and_Password() throws Throwable 
	 {
		 driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("Mansi") ; 
		 driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("password"); 
		 driver.findElement(By.xpath("//*[@type='submit' and @class='_2AkmmA _1Lctnl _7UHT_c']")).click();
	}
	 @Then("^Login should not be sucessful and Verify error message$")
	 public void login_should_not_be_sucessful_and_Verify_error_message() throws Throwable 
	 {
		 assertEquals("Please enter valid Email ID/Mobile number",driver.findElement(By.xpath("//span[2]/span")).getText());
		 
	 }
	 
	/*
	 * @Given("^Flipkart Website is loaded$") public void
	 * flipkart_Website_is_loaded() throws Throwable { // Write code here that turns
	 * the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @Then("^Login should not be sucessful and Verify error message$") public void
	 * login_should_not_be_sucessful_and_Verify_error_message() throws Throwable {
	 * // Write code here that turns the phrase above into concrete actions throw
	 * new PendingException(); }
	 */


}

