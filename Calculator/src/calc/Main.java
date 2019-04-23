package calc;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nmain c = new Nmain();
		Scanner scan = new Scanner(System.in);
		System.out.println("1.sum\t2.Sub\t3.mul\t4.div");
		int choice = scan.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("enter the value of a and b");
			c.a= scan.nextFloat();
			c.b= scan.nextFloat();
			c.sum();
			break;
			
		case 2:
			System.out.println("Enter the value of and b");
			c.a= scan.nextFloat();
			c.b= scan.nextFloat();
			c.sub();
			break;
			
		case 3:
			System.out.println("Enter the value of a and b");
			c.a = scan.nextFloat();
			c.b =scan.nextFloat();
			c.mul();
			break;
			
		case 4:
			System.out.println("enter the value of a and b");
			c.a =scan.nextFloat();
			c.b =scan.nextFloat();
			c.div();
			break;
			
		default :
			System.out.println("Invalid option");
			
			
			
					}
		
			
	}

}
