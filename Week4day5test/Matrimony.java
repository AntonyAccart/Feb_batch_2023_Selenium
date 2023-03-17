package Week4day5test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();

		WebElement profiledd = driver.findElement(By.id("REGISTERED_BY"));
		Select profile = new Select(profiledd);
		profile.selectByIndex(1);

		// driver.findElement(By.id("REGISTERED_BY")).sendKeys("Friend");
		driver.findElement(By.className("hp-regform-txtfield")).sendKeys("antony");
		driver.findElement(By.id("gendermale")).click();
		WebElement daydd = driver.findElement(By.id("DOBDAY"));
		Select day = new Select(daydd);
		day.selectByIndex(2);

		WebElement monthdd = driver.findElement(By.id("DOBMONTH"));
		Select month = new Select(monthdd);
		month.selectByIndex(2);

		WebElement yeardd = driver.findElement(By.id("DOBYEAR"));
		Select year = new Select(yeardd);
		year.selectByIndex(2);

		WebElement religiondd = driver.findElement(By.id("RELIGION"));
		Select religion = new Select(religiondd);
		religion.selectByIndex(1);

		WebElement mothertonguedd = driver.findElement(By.id("MOTHERTONGUE"));
		Select mt = new Select(mothertonguedd);
		mt.selectByIndex(1);

		WebElement castedd = driver.findElement(By.id("CASTE_NORMAL"));
		Select caste = new Select(castedd);
		caste.selectByVisibleText(" Don't wish to specify ");

		WebElement countrydd = driver.findElement(By.id("COUNTRY"));
		Select country = new Select(countrydd);
		country.selectByValue("98");

		driver.findElement(By.id("M_COUNTRYCODE")).sendKeys("91");
		driver.findElement(By.id("MOBILENO")).sendKeys("923456789");
		driver.findElement(By.id("EMAIL")).sendKeys("antony@gmail.com");
		driver.findElement(By.name("PASSWD1")).sendKeys("antony123");

	}
}
