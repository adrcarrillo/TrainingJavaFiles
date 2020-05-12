package ch05;

public class PrintAppleDetails {
	public static void main (String[] args) {
		Apple3 a1 = new Apple3();
		System.out.println("Apple a1:");
		System.out.println("mass: " + a1.mass); //call variable
		System.out.println("diameter: " + a1.diameter); //Call variable
		System.out.println("position: (" + a1.x + ", " + a1.y +")"); //Call variable

		System.out.println("Test1: "+a1.az1()); //call method
		System.out.println("Test2: "+a1.az2(1)); // call method with argument
		a1.az3(); // call void method
	}
}


