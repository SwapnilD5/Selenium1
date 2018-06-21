package Package_Test.Project_Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions
	(  features = "/home/faichi/workspace/Project_Test/test",
	glue = "/home/faichi/workspace/Project_Test/src/test/java/Package_Test/Project_Test/",
	dryRun = true,
	format ={"pretty" , "html:/home/faichi/workspace/Project_Test/src/test/java/Package_Test/Project_Test/"})

	public class abcd {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
