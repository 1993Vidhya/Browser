package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessage
{
	
		public static void main(String[] args) 
		{
					
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/");//get browser
		driver.getTitle();// get browser title
		System.out.println(driver.getTitle());//get title
		driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());//get url		
		   
		   
		   driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		   driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce1"); 
		   driver.findElement(By.id("login-button")).click();
		   
		   // printing error 
		   System.out.println( driver.findElement(By.cssSelector("h3[data-test='error']")).getText());	
		   driver.close();

		}
		}