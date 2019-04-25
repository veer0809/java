package emp;
import java.util.*;
public class Employeemain {

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner scan = new Scanner (System.in);
		
		Employee e1 = new Employee();

		e1.setId(1);
		e1.setName("Veer");
		e1.setSalary(50000);

		e1.print();

		
	}

}
