package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class Step_D
{
	WebDriver w;
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {

System.out.println("Code for pre-condition");
System.setProperty("webdriver.gecko.driver", "/home/faichi/Desktop/Selenium/geckodriver");
System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/home/faichi/Desktop/Selenium/output.txt");
w=new FirefoxDriver();

w.get("http://newtours.demoaut.com/");
	
	}

	@Given("^some other precondition$")
	public void some_other_precondition() throws Throwable {
		 w.findElement(By.name("userName")).sendKeys("test");
		    w.findElement(By.name("password")).sendKeys("test");
	}
	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		Thread.sleep(3000);
		System.out.println("Code for Action"); 
		w.quit();	}



}
