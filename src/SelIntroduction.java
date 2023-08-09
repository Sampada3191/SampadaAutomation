


import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Webdriver\\chromedriver\\New Chrome\\chromedriver_win32\\chromedriver.exe");
 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		System.out.println("TEsting selenium");
		System.out.println("TEsting selenium1");
		System.out.println("TEsting selenium2");
	
		
		
		
		
		
		

	}

}
