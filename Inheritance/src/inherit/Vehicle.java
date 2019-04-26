package inherit;

public class Vehicle {
	

	
		
		String name;
		String color;
		int speed;
		
		Vehicle(String name, String color, int speed){
		this.name= name;
		this.color= color;
		this.speed= speed;
		}
		
		void printResult() {
			System.out.println("The name of vehicle is: " +name);
			System.out.println("The color of  of vehicle is: " +color);
			System.out.println("The speed of vehicle is: " +speed);

		}

	}



