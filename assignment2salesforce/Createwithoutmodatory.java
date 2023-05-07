package assignment2salesforce;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createwithoutmodatory {
	public static void main(String[] args) throws InterruptedException {

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf@1234");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
	WebElement oppo = driver.findElement(By.xpath("//span[text()='Opportunities'][1]"));
	driver.executeScript("arguments[0].click()", oppo);
	driver.findElement(By.linkText("New")).click();
	driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("5/7/2023");
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String errormsg = "We hit a snag.";
	

	String text = driver.findElement(By.xpath("(//h2)[18]")).getText();
	System.out.println("Output:" + text);
	if (errormsg.equals(text)) {
		System.out.println("Please Complete all the required fields");
	}


}
}
