package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://acme-test.uipath.com/login");
driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.id("password")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.linkText("Log Out")).click();
driver.close();
	}

}
