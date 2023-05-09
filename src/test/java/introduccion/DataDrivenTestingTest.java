package introduccion;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingTest {
	
	private WebDriver driver;
	private WriteExcelFile writeFile;
	private ReadExcelfile readFile;
	
	private By searchBoxLocator = By.id("search_query_top");
	private By searchButtonLocator = By.name("submit_search");
	private By resultTextLocator =  By.cssSelector("span.heading-counter");
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		writeFile = new WriteExcelFile();
		readFile = new ReadExcelfile();
		
		driver.get("http://automationpractice.pl/index.php");
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void test() throws IOException {
		
		
		String filePath = "C:\\Users\\AlejandroCastroMorag\\Desktop\\Test.xlsx";
		
		for (int i = 0; i < 3; i++) {
			
			String searchText = readFile.getCellValor(filePath, "Hoja1", i,0);
			
			driver.findElement(searchBoxLocator).clear();
			driver.findElement(searchBoxLocator).sendKeys(searchText);
			driver.findElement(searchButtonLocator).click();
			String resulText = driver.findElement(resultTextLocator).getText();
			
			System.out.println("Resultado de texto de la página: " + resulText);
			
			readFile.readExcel(filePath, "Hoja1");
			writeFile.writeCellValue(filePath, "Hoja1", i,1, resulText);
			
			readFile.readExcel(filePath, "Hoja1");
		}
		
	}

}
