package test_maven;

import java.util.*;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.RuntimeOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		//features={"/home/faichi/workspace/Project_Test/test1/d_driven.feature","/home/faichi/workspace/Project_Test/test1/f_test.feature"},
		//features={"/home/faichi/workspace/Project_Test/test1/d_driven.feature"},
				features={"/home/faichi/workspace/Project_Test/test1"},
		
		glue={"stepDefinition"},
		plugin ={"pretty" , "html:/home/faichi/workspace/Project_Test/src/test/java/Package_Test/Project_Test/"},
         tags={"@f_test,@d_driven"}
		
)
public class test_main {
	
	
     
}



