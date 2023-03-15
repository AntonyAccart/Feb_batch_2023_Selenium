package week4day2ass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
	
	Select state=new Select(statedd);
	 state.selectByVisibleText("New York");
	 
	 driver.findElement(By.name("submitButton")).click();
	 
	
	
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("N/A");
	driver.findElement(By.className("smallSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	
	
}
}