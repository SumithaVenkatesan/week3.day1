package week3.day1;


// understanding constructor

public class EmployeeDetails {
	static int empId;
	String empName;
	
	public EmployeeDetails(int empId, String empName) {
		this.empId= empId;
		this.empName=empName;
		System.out.println("In Parameterized constructor");
		
	}
	public EmployeeDetails() {
		empId=1002;
		empName="Sumitha";
		System.out.println("In default constructor");
	}
	
	public static void getEmployeeDetails() {
		System.out.println(empId);
	}
	
	public static void main(String[] args) {
		//EmployeeDetails emp=new EmployeeDetails(1001);
		
		EmployeeDetails emp1=new EmployeeDetails();
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		
		EmployeeDetails emp=new EmployeeDetails(101, "Jai");
		System.out.println(emp.empId);
		System.out.println(emp.empName);

		EmployeeDetails.getEmployeeDetails();
	}

}
