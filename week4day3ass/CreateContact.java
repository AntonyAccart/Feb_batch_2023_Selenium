package week4day3ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("aa");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ANTONY");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ACCART");
	 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ANTONY");
	 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CS");
	 driver.findElement(By.id("createLeadForm_description")).sendKeys("NIL");
	 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("antonyaccart@gmail.com");
	 
	 WebElement statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	 Select state = new Select(statedd);
		state.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

driver.findElement(By.xpath("//span[text()='Create Contact']")).click();
driver.findElement(By.xpath("//input[@name='firstName'][1]")).sendKeys("dd");
driver.findElement(By.xpath("//input[@name='lastName'][1]")).sendKeys("ee");
driver.findElement(By.xpath("//button[text()='Create Contact']")).click();
driver.findElement(By.xpath("//a[text()='Edit']")).click();

driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("very important");
driver.findElement(By.xpath("//input[@value='Update']']")).click();
String actualResult = driver.getTitle();
System.out.println(actualResult);

}

}
