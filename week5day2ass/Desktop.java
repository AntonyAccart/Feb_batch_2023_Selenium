package week5day2ass;
//derived class
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Size of the desktop is 25inches");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		// calling method from Computer class
		desktop.computerModel(); 
		// calling method from Desktop class

		desktop.desktopSize(); 	}
}