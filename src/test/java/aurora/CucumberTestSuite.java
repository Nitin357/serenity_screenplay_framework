package aurora;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        //features = "features/aurora/LS_Quotes.feature",
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber.html"}
)
public class CucumberTestSuite {

}