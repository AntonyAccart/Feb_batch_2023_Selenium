package week5day5ass;

public class Students {

	public void getStudentinfo(int stuid) {
		System.out.println("stuid:" + stuid);

	}

	public void getStudentinfo(String stuName) {
		System.out.println("stuname:" + stuName);
	}

	public void getStudentinfo(long stuMobNumber, String stuMailId) {
		System.out.println("stu mob number:" +stuMobNumber + " stu mail id " + stuMailId);
	}

	

	public static void main(String[] args) {
		Students emp = new Students();
		emp.getStudentinfo(3);
		emp.getStudentinfo("antony");
		emp.getStudentinfo(9990, "antony@gmail.com");

	}
}
