package Package_Test.Project_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class Step_Defination_Login 
{
	WebDriver w;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "/home/faichi/Desktop/Selenium/geckodriver");

		w=new FirefoxDriver();
		w.get("http://newtours.demoaut.com");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
System.out.println("test1");	  
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		 w.findElement(By.name("userName")).sendKeys(username);
		    w.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Message displayed Login Successfullys$")
	public void message_displayed_Login_Successfullys() throws Throwable {
		System.out.println("test2");	  
	}



}
