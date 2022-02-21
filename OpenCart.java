package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.manage().window().maximize();
driver.findElement(By.id("input-username")).sendKeys("Niresh");
driver.findElement(By.id("input-firstname")).sendKeys("Niresh kumar");
driver.findElement(By.id("input-lastname")).sendKeys("M");
driver.findElement(By.name("email")).sendKeys("nireshkumar.madhanagopal@gmail.com");
WebElement sel= driver.findElement(By.id("input-country"));
Select ele = new Select(sel);
ele.selectByVisibleText("India");
driver.findElement(By.id("input-password")).sendKeys("password@123");
	}

}
