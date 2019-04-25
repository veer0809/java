package emp;

public class Employee {
	
	private String name;
	private int id;
	private float salary;
	
	
	
	
	public employee(String name, int id, float salary) {
	
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}

}
