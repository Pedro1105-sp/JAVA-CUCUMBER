package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.loginPage;

public class LoginDemoSteps_POM {
	
	WebDriver driver = null;
	loginPage login;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - browser is open");
		
		System.out.println("======= I am inside LoginDemoSteps_POM ======");
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/pedro.candido/Desktop/PEDRO/ESTUDOS-QA/JAVA-SELENIUM/CucumberJava/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
		login = new loginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		login.checkLogOutIsDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
	}


}
