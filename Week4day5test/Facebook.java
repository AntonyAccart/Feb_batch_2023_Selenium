package Week4day5test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("antony");
		driver.findElement(By.name("lastname")).sendKeys("accart");
		driver.findElement(By.name("reg_email__")).sendKeys("ant@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("111112");
	WebElement datedd=driver.findElement(By.id("day"));
	Select date= new Select(datedd);
	date.selectByIndex(9);
	WebElement monthdd=driver.findElement(By.id("month"));
	Select month= new Select(monthdd);
	date.selectByIndex(9);
	WebElement yeardd=driver.findElement(By.id("year"));
	Select year= new Select(yeardd);
	year.selectByIndex(9);
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.close();
	}

}
