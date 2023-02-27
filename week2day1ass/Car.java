package week2day1ass;

public class Car {
	
public void applyBreak()
{
	System.out.println("Please Apply The Break");}


public void applyGear()
{
	System.out.println("Reduce the gear before applyiy the break");
	
}
 public void switchOnAc()
 {
	 System.out.println("Switch on the AC");
 }
 public void applyAcclerate()
 {
	 System.out.println("Apply Accleration when its green signal");
 }
 public static void main(String[] args) {
	Car myCar=new Car();
	myCar.applyBreak();
	myCar.applyGear();
	myCar.switchOnAc();
	myCar.applyAcclerate();
	
	
	
}
}