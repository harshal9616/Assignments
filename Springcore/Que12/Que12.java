package que12;

public class Que12 {

	int empid;
	String empname;
	String department;
	float salary;
	public Que12(int empid, String empname, String department, float salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.department = department;
		this.salary = salary;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + empid + ", ename=" + empname + ", department=" + department + ", salary=" + salary + "]";
	}
}
