package week2day3ass;



public class EmployeeDetails
{
	public void employeeName(String empName, int empId)
	{
		System.out.println(empName+empId);
	}
	public void employeeAddress(String empAddress)
	{
		System.out.println(empAddress);
	}
	public void employeeSalary(double empSalary)
	{
		System.out.println(empSalary);
	}
    public void employeePhoneNumber(long mobNum)
    {
    	System.out.println(mobNum);
    }
    public static void main(String[] args) {
    	EmployeeDetails emp = new EmployeeDetails();
    	emp.employeeName("antony", 20);
    	emp.employeeAddress("chennai");
    	emp.employeeSalary(2300.34);
    	emp.employeePhoneNumber(99909933l);
    	
	}
}
