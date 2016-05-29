
public class Employee implements Comparable<Employee>{
	private long employeeid;
	private String lastname;
	public Employee(long employeeid, String lastname){
		this.employeeid = employeeid;
		this.lastname = lastname;
	}
	public int compareTo(Employee other) {
		if(employeeid > other.employeeid)
			return 1;
		if(employeeid < other.employeeid)
			return -1;
		return 0;
	}
	public String toString(){
		return "id: " + employeeid + ", name: " + lastname;
	}
}
