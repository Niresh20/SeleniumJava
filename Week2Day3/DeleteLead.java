package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
	/*
	 * String text= driver.findElement(By.tagName("h2")).getText();
	 * System.out.println(text);
	 */
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Find Leads")).click();
	 driver.findElement(By.xpath("//span[text()='Phone']")).click();
	 driver.findElement(By.name("phoneNumber")).sendKeys("1234567891");
	 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	 //driver.findElement(By.xpath("//div[@id='ext-gen917']")).click();
	 //driver.findElement(By.linkText("14011")).click();
	 //driver.findElement(By.xpath("//a[text()='14011']/parent::div")).click();
	 driver.findElement(By.linkText("Niresh")).click();
	 
}
}
