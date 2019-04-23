package calc;

public class Nmain {
	
	float a;
	float b;
	float result;
	
	void sum() {
		
		result=a+b;
		printResult();
	}
	
	void sub() {
		
		result=a-b;
		printResult();
	}
	
	void mul() {
		result=a*b;
		printResult();
	}
	
	void div() {
		result=a/b;
		printResult();
	}
	void printResult() {
		System.out.println("Result is= " + result);
	}
}
