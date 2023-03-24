package week5day5ass;

import week5day5ass.Axisbank;

public class Axisbank extends Bankinfo {

	public void deposit()
	{System.out.println("Deposite updated:1000");
	}
	public static void main(String[] args) {
		Axisbank axis=new Axisbank();
		
		axis.saving();
		
		axis.fixed();
		axis.deposit();
	}

}
