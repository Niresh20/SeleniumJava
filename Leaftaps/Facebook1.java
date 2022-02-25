package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("niresh7hca@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
