package Week4day5test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Uibank {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver=new ChromeDriver(options);
driver.get("https://uibank.uipath.com/register-account");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("firstName")).sendKeys("antony");
	driver.findElement(By.xpath("//option[@value='mr']")).click();
	driver.findElement(By.id("middleName")).sendKeys("Register form");
	
	driver.findElement(By.id("lastName")).sendKeys("accart");
	driver.findElement(By.xpath("//option[@value='male']")).click();
	WebElement statusdd=driver.findElement(By.id("employmentStatus"));
	Select status= new Select(statusdd);
	status.selectByVisibleText("Full-time");
	driver.findElement(By.id("username")).sendKeys("accart");
	driver.findElement(By.id("email")).sendKeys("accart@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123");
	driver.close();
}
}
