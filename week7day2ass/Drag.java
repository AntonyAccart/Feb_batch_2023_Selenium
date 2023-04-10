package week7day2ass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Drag {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--start-maximized");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("https://leafground.com/drag.xhtml");
	WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
	Actions action = new Actions(driver);
	action.dragAndDropBy(drag, 200, 80).perform();
	action.dragAndDropBy(drag, 200, 10).perform();
	WebElement dragging = driver.findElement(By.xpath("//p[text()='Drag to target']"));
	WebElement dropping = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
	action.dragAndDrop(dragging, dropping).perform();
}
}