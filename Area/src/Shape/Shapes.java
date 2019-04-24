package Shape;

public class Shapes {
	
	float r;
	float s;
	float b;
	float h;
	float result;
	
		void rad() {
			result= (3.14f*r*r);
			printResult();
		}
		
		void sqr() {
			
			result= s*s;
			printResult();
			
		}
		
		void tri() {
			result= (0.5f*b*h);
			printResult();
		}
		
		void printResult() {
		System.out.println("The area is : " + result);
		}
		

}
