package week1day1ass;

public class Mobile {

	String mobileBrandName = "vivo";
	char mobileLogo = 'v';
	short noOfMobilePiece = 2;
	int modelNumber = 20;
	long mobileImeiNumber = 00000000l;
	float mobilePrice = 29999.59f;
	boolean isDamaged = false;
	
   	public static void main(String[] args) {
   		Mobile myMobile = new Mobile();
		System.out.println("Brand name" + myMobile.mobileBrandName);
		System.out.println("Logo " + myMobile.mobileLogo);
		System.out.println("Number of available pieces = " + myMobile.noOfMobilePiece);
		System.out.println("Model number " + myMobile.modelNumber);
		System.out.println("Imei Number " +myMobile.mobileImeiNumber);
		System.out.println("Mobile Price " + myMobile.mobilePrice);
		System.out.println("Is the mobile is damaged?  " + myMobile.isDamaged);
   	}
}
