package que4;

public class Que4 {

	
	int empid;
	String ename;
	String email;
	float salary;
	Que4Department dept;

	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Que4Department getDept() {
		return dept;
	}

	public void setDept(Que4Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee Details";
	} 
	
	public void employeeDetails() {
		
		System.out.println("Employee id : "+empid);
		System.out.println(dept);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee email : "+email);
		System.out.println("Employee salary: "+salary);
	
	}
	
}
