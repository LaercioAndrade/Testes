package Steps;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompraTeste {

   @Test
   public void realizarlogin() {
	System.setProperty("webdriver.com.driver", "C:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com");
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();

	  //selecionar_item
	  driver.findElement(By.id("item_4_title_link")).click();

	  //adicionar_item_ao_carrinho
	  driver.findElement(By.className("btn_primary")).click();
	  
	  //clicar_no_carrinho
	  driver.findElement(By.className("shopping_cart_container")).click();
	  
	  //clicar_no_botão_checkout
	  driver.findElement(By.className("btn_action")).click();
	  
	  //firstName
	  driver.findElement(By.id("first-name")).sendKeys("Laércio");
	  
	  //lastName
	  driver.findElement(By.id("last-name")).sendKeys("Gonçalves de Andrade");
	  
	  //CEP
	  driver.findElement(By.id("postal-code")).sendKeys("08382-557");
	  
	  //button_continue
	  driver.findElement(By.className("btn_primary")).click();
	  
	  //button_finish
	  driver.findElement(By.className("btn_action")).click();
	  
	  //fechar_web
	  driver.quit();
	  
	  
	}

}
