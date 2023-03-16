package week4day3ass;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class AcmeTest {
	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
//	//driver.findElement(By.xpath("//button[@type='submit']")).click();
////	String title = driver.getTitle();
////			System.out.println(title);
//			//driver.findElement((By.xpath("//a[contains(@href,'https://acme-test.uipath.com/logout')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//String expectedResult = "ACME System 1 -  Dashboard";
		String actualResult = driver.getTitle();
		System.out.println(actualResult);

		driver.findElement(By.linkText("Log Out")).click();
		driver.close();

	}
}
