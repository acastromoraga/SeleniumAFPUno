package introduccion;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\driver\\edgeDriver\\msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
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
