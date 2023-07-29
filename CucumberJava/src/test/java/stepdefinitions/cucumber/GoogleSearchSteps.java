package stepdefinitions.cucumber;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver=null;	
	Logger log = Logger.getLogger("GoogleSearchSteps.class");
	
	@Given("Browser is open")
	public void Browser_is_open() {
		
		String ProjectPath=System.getProperty("user.dir");

		System.setProperty("driver.chrome.driver",""+ProjectPath+""+"/Drivers/chromedriver.exe" );
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		
		log.info("Browser is open");
		
	}
	
	@And("user navigates to google search page")
	public void user_navigates_to_google_search_page() {
		driver.navigate().to("https://www.google.com/");
		log.info("user navigated to google page");
	}


	@When("user enter some text in search box")
	public void user_enter_some_text_in_search_box() {
		String text = "rahul";
		driver.findElement(By.name("q")).sendKeys(text);
		log.info("user entered "+text+" in search box");
	}

	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.name("btnK")).click();
		log.info("user clicked on search Btn");
	}

	@Then("user get the result")
	public void user_get_the_result() {
		String title = driver.getTitle();
		log.info("user landed on this title page :"+ title);
		
	}
	
	@And("user closes the browser")
	public void user_closes_the_browser() {
		driver.close();
		driver.quit();
		log.info("browser closed");
	}




}
