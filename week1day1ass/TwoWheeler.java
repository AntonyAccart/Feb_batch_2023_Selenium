package week1day1ass;

public class TwoWheeler {
int noOfWheels=4;
short noOfMirrors=2;
long chassisNumber=32995539l;
boolean isPunctured=false;
String bikeName="KTM";
double runningKM= 30021.1;
public static void main(String[] args) {
	
	TwoWheeler myBike=new TwoWheeler();
	System.out.println("No of wheeles " +myBike.noOfWheels);
	System.out.println("No of mirrors " +myBike.noOfMirrors);
	System.out.println("Chass Number "+myBike.chassisNumber);
	System.out.println("Is the bike is Punctured " +myBike.isPunctured);
	System.out.println("Bike Name " +myBike.bikeName);
	System.out.println("Toatal Running KM ?" +myBike.runningKM);
}

}
 
