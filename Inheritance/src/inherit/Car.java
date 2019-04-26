package inherit;

public class Car extends Vehicle {

	String gear;

	Car(String name, String color, int speed, String gear) {

		super(name, color, speed);
		this.gear = gear;

	}

	void printResult() {
		super.printResult();
		System.out.println("The gear type of vehicle is: " + gear);
	}

}
