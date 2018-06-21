package Package_Test.Project_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws InterruptedException 
     */
    public void testApp() throws InterruptedException
    {
    	System.setProperty("webdriver.gecko.driver", "/home/faichi/Desktop/Selenium/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/home/faichi/Desktop/Selenium/output.txt");
		
		WebDriver w=new FirefoxDriver();
		w.get("http://www.google.co.in");
		Thread.sleep(2000);
		w.quit();
    }
}
