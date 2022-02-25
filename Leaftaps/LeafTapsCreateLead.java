package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Create Lead")).click();
String homePageTitle=driver.getTitle();
System.out.println(homePageTitle);
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Niresh Kumar");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
WebElement createLeadForm_dataSourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select Element = new Select (createLeadForm_dataSourceId);
Element.selectByIndex(4);
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("17/8/1987");
WebElement createLeadForm_industryEnumId = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select Ele = new Select (createLeadForm_industryEnumId);
Ele.selectByIndex(3);
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
String title2="View Lead | opentaps CRM";
	}

}
