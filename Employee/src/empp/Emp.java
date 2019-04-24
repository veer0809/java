package empp;

public class Emp {
	
	String name;
	int id;
	float salary;
	float hra;
	float da;
	float basicsalary;

	void calsal() {
		
		hra= (35*basicsalary)/100;
		da = (15*basicsalary)/100;
		salary = basicsalary+hra+da;
		
	}
	
	
	}
