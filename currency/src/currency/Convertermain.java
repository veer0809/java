package currency;
import java.util.*;
public class Convertermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter c = new Converter();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.rtd\t2.dtr");
		int choice = scan.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("enter the value of val1");
			c.val1= scan.nextFloat();
			
			c.rtd();
			break;
			
			
			case 2:
				System.out.println("enter the value of val1");
				c.val1= scan.nextFloat();
				
				c.dtr();
				break;
			default :
				System.out.println("Invalid option");
			
	}

	}
}
	
