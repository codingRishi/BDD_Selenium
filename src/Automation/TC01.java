package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TC01 {
	static WebDriver driver;
	@Given("the website http://toolsqa.com/automation-practice-form/ is up and running in chrome")
	public void environmnetSetup()
	{
		System.setProperty("webdriver.chrome.driver", 
				"G:\\Selenium\\Driver\\chromedriver_win32 (9)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-form/");
	}
	
	@When("user clicks on QTP checkbox")
	public void userclick()
	{
		driver.findElement(By.id("tool-0")).click();
	}
	@Then("validate whether Selenium Webdriver is unchecked")
	public void validation1()
	{
		boolean result1  = 
				driver.findElement(By.id("tool-2")).isSelected();
		org.junit.Assert.assertTrue(!result1);
	}
	@And("validate whether Selenium IDE is unchecked")
	public void validation2()
	{
		boolean result1  = 
				driver.findElement(By.id("tool-1")).isSelected();
		org.junit.Assert.assertTrue(!result1);
	}

}
