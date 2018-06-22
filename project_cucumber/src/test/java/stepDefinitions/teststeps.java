package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class teststeps {
	
	WebDriver w;
	SoftAssert s=new SoftAssert();
	
	
	
@Given("^Mercury Tours Application should get open\\.$")
public void mercury_Tours_Application_should_get_open() throws Throwable {

	System.setProperty("webdriver.gecko.driver", "/home/faichi/Desktop/Selenium/geckodriver");
	
	 w=new FirefoxDriver();	
     w.get("http://demo.testfire.net/bank/login.aspx");
   }

@When("^user enter valid id and password$")
public void user_enter_valid_id_and_password() throws Throwable {
	    w.findElement(By.name("uid")).sendKeys("admin");
	    w.findElement(By.name("passw")).sendKeys("admin");
	    
}

@Then("^home page should get open$")
public void home_page_should_get_open() throws Throwable {
    w.findElement(By.name("btnSubmit")).click();
}

@And("^Verify title$")
public void verify_title() throws Throwable {
	   Thread.sleep(10000);

	Assert.assertEquals(w.getTitle(), "hello");
	w.findElement(By.partialLinkText("Sign")).click();
	}

@Then("^Close application$")
public void close_applicatio() throws Throwable {
	w.quit();
	System.out.println("close application");
}



}
