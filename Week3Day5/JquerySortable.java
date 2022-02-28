package Week3Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySortable {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		WebElement move = driver.findElement(By.xpath("//ul[@id='sortable']//li[2]"));
		WebElement target = driver.findElement(By.xpath("//ul[@id='sortable']//li[5]"));
		Actions act = new Actions(driver);
		act.clickAndHold(move).moveByOffset(0, 100).release(target).perform();
		driver.switchTo().defaultContent();
   }
}