package introduccion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestFirexfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
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
