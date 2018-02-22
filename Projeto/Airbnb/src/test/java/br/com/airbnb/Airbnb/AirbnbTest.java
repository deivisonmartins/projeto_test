package br.com.airbnb.Airbnb;

import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;

public class AirbnbTest {
	
	private FirefoxDriver driver;
	
	@Before
    public void inicializa(){
		
    	// plugin executavel
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.opera.driver", "operadriver");

		// inicializa o firefox
		this.driver = new FirefoxDriver();
		//this.driver = new ChromeDriver(); 
		//this.driver = new OperaDriver();

		// acessa a aplicacao
		this.driver.get("https://www.airbnb.com.br/");
		
		// maximalizar a tela
		this.driver.manage().window().maximize();
    }

}
