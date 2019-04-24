package empp;
import java.util.*;
public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp m = new Emp();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the name");
		m.name = scan.next();
		
		System.out.println("Enter the id");
		m.id = scan.nextInt();
		
		System.out.println("enter the basic salary");
		m.basicsalary = scan.nextFloat();
		
		m.calsal();
		String salary;
		System.out.println("The salary is: " + m.salary);
		
		
	}

}
