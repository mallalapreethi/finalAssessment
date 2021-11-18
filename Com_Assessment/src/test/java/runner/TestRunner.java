package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Selenium\\BDD\\FinalBDD\\src\\test\\java\\Features",
		glue="StepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests{

}
