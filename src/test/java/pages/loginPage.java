package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	protected WebDriver driver;
	
	private By txt_username = By.id("username");
	
	private By txt_password = By.id("password");
	
	private By btn_login = By.id("submit");
	
	private By btn_logout = By.xpath("/html/body/div/div/section/div/div/article/div[2]/div/div/div/a");
	
	
	public loginPage(WebDriver driver) {
		
		this.driver = driver;
		
		if(!driver.getTitle().equals("Test Login | Practice Test Automation")) {
			
			
			// O throw new IllegalStateException é geralmente utilizado em casos em que um método é invocado num momento indevido, ou seja,
			// o que o método deveria fazer não deveria ser executado nesse momento específico.
			// Não é bem isso, o IllegalStateException sinaliza que um método foi invocado em um tempo ilegal ou inadequado. Em outras palavras, 
			//o ambiente Java ou o aplicativo Java não está em um estado apropriado para a operação solicitada
			throw new IllegalStateException("This is not Login Page. The Current page is" 
					+driver.getCurrentUrl());
		}
		
	}
	
	
	public void enterUsername(String username){
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password){
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogOutIsDisplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

}




