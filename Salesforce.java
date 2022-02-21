package week1.day1;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.name("UserFirstName")).sendKeys("Niresh Kumar");
driver.findElement(By.name("UserLastName")).sendKeys("M");
driver.findElement(By.name("UserEmail")).sendKeys("nireshkumar.madhanagopal@gmail.com");
driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
driver.findElement(By.name("UserPhone")).sendKeys("9499962740");
WebElement UserTitle=driver.findElement(By.name("UserTitle"));
Select element = new Select(UserTitle);
element.selectByIndex(3);
WebElement CompanyEmployees = driver.findElement(By.name("CompanyEmployees"));
Select ele = new Select(CompanyEmployees);
ele.selectByIndex(2);
	}

}
