package resourceCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/Airbnb.feature", glue={"br.com.airbnb.Airbnb"})
public class AirbnbResource { 
}
	
