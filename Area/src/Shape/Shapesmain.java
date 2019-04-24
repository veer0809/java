package Shape;
import java.util.*;
public class Shapesmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes s = new Shapes();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.rad\t2.sqr\t3.tri");
		int choice = scan.nextInt();
		
		switch (choice)
		{
		case 1 :
			System.out.println("Enter the value of radius");
			s.r = scan.nextFloat();
			s.rad();
			break;
			
		case 2:
			System.out.println("Enter the value of side");
			s.s =scan.nextFloat();
			s.sqr();
			break;
			
		case 3:
			System.out.println("Enter the value of height and breadth");
			s.b = scan.nextFloat();
			s.h = scan.nextFloat();
			s.tri();
			break;
			
		default:
			
			System.out.println("Invalid option");
			
		}
			
		
		

	}

}
