package week2assignement;



public class EmployeeDetails {

	public void empname(String a)
	{
		System.out.println(a);
	}
	public void empnumber(long b)
	{
		System.out.println(b);
	}
	
	public static boolean gender(String gen) {
		//check if condition 
	if (gen== "male") {
	
		return true;
	}
	//if fails else will execute
	else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.empname("antony");
        emp.empnumber(787956565l);
        // check if condition
        if (gender("female")==true) {
        	System.out.println("male");
        }
        //if fails then else will execute
        else {System.out.println("female");
        }
	
}
	
}
