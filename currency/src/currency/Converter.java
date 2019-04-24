package currency;

public class Converter {
	
	float val1;
	
	float result;
	
	void rtd() {
	
		result=(val1/75);
		printResult();
	}
	
	void dtr() {
		
		result=(val1*75);
		printResult();
	}
	
	void printResult() {
		
		System.out.println("The converted value is " + result);
	}
		
	
	

}
