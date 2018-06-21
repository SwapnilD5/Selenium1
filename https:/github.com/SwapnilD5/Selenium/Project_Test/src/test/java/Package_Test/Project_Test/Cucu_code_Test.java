package Package_Test.Project_Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions
(  features = {"/home/faichi/workspace/Project_Test/test1/abc.feature"},
glue = {"/home/faichi/workspace/Project_Test/src/test/java/Package_Test/Project_Test/Step_Defination_Login.java"},
format ={"pretty" , "html:/home/faichi/workspace/Project_Test/src/test/java/Package_Test/Project_Test/"})
public class Cucu_code_Test {
}