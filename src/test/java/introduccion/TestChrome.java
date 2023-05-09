package introduccion;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//iframe_body
		//ctl12$TxtIdPersona
		//ctl12$TxtClave
		//driver.switchTo().frame("iframe_body");
		//driver.findElement(By.name("ctl12$TxtIdPersona")).sendKeys("Cgarcia");
		//driver.findElement(By.name("ctl12$TxtClave")).sendKeys("Desarrollo17");
		//driver.findElement(By.id("login-botones")).click();
		String nombrePag =  driver.getTitle();
		System.out.println(nombrePag);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		//driver.quit();
				
		
	}

}
