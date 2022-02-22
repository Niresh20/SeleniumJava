package Week2Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver= new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/control/login");
     driver.manage().window().maximize();
     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     String text= driver.findElement(By.tagName("h2")).getText();
 	 System.out.println(text);
 	 driver.findElement(By.linkText("CRM/SFA")).click();
	 String homePageTitle=driver.getTitle();
	 System.out.println(homePageTitle);
	 driver.findElement(By.linkText("Contacts")).click();
	 driver.findElement(By.linkText("Create Contact")).click();
	 driver.findElement(By.id("firstNameField")).sendKeys("Niresh Kumar");
	 driver.findElement(By.id("lastNameField")).sendKeys("M");
	 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Niresh");
	 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
	 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECS");
	 driver.findElement(By.id("createContactForm_description")).sendKeys("This is create contact");
	 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("niresh47@gmail.com");
	 WebElement createContactForm_generalStateProvinceGeoId= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	 Select Element= new Select(createContactForm_generalStateProvinceGeoId);
	 Element.selectByVisibleText("New York");
	 driver.findElement(By.name("submitButton")).click();
	 driver.findElement(By.linkText("Edit")).click();
	 driver.findElement(By.id("updateContactForm_description")).clear();
	 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated Contact");
	 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 
	 
	}

}
