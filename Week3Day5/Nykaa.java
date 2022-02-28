package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		Actions a = new Actions(driver);
		WebElement b = driver.findElement(By.linkText("BRANDS"));
		a.moveToElement(b).perform();

		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String page = driver.getTitle();
		System.out.println(page);
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']//div")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("(//a[@class='css-qlopj4'])[1]")).click();
		WebElement dropdown1=  driver.findElement(By.xpath("//select[@class='css-1c1c89s']"));
		Select ele = new Select(dropdown1);
		ele.selectByIndex(2);
		

	}

}