package week2day1ass;

public class Mobile {


	public void sendMessage() {
		System.out.println("Send a Message in group if your leave");
	}
	public void shareDocument() {
		System.out.println("Share your Document");
	}
	
	public void call() {
		System.out.println("Call me once your reach home");
	}
	
	public static void main(String[] args) {
		Mobile myMob=new Mobile();
		myMob.sendMessage();
		myMob.shareDocument();
		myMob.call();
	
		
	}

}