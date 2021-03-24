package Page;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	private WebDriver driver;
	
	@Test
	public void loginvalido() {
		
		//acessar site
		System.setProperty("webdriver.com.driver", "C:\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com");
		   
		//inserir username
		   driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  
		//inserir password
		   driver.findElement(By.id("password")).sendKeys("secret_sauce");
		   
		//clicar botão login
		   driver.findElement(By.id("login-button")).click();	

		//fecharbrowser
		   driver.quit();
	}

	@Test
	public void login_invalido() {
			
	    //acessar site
		   System.setProperty("webdriver.com.driver", "C:\\chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.saucedemo.com");
				   
		//inserir username
		    driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
				  
		//inserir password
		     driver.findElement(By.id("password")).sendKeys("secret_sauce");
				   
		//clicar botão login
		     driver.findElement(By.id("login-button")).click();	
		     
		//fecharbrowser
			   driver.quit();
	}
	
	
}
