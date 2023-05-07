package assignment2salesforce;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccounts {
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
	WebElement oppo = driver.findElement(By.xpath("//span[text()='Accounts'][1]"));
	driver.executeScript("arguments[0].click()", oppo);
	driver.findElement(By.linkText("New")).click();

	driver.findElement(By.className("forceActionLink")).click();
	WebElement name = driver.findElement(By.xpath("//input[@name='Name']"));
	name.sendKeys("Antony");
	
	driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-combobox__input-value')])[3]")).click();
	driver.findElement(By.xpath("//span[@title='Public']")).click();

	driver.findElement(By.xpath("//button[text()='Save']")).click();
	String nameEntered = "Antony";
	String text = driver.findElement(By.xpath("//input[@name='Name']")).getText();
	System.out.println("Output:" + text);
	if (nameEntered.equals(text)) {
		System.out.println("account created");
	} else {
		System.out.println("account not created");
	}

}
}