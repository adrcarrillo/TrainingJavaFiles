package ch05;

public class PrintAppleDetails3 {
	public static void main (String[] args) {
		Apple2 a1 = new Apple2();
		
		System.out.println("Apple a1:");
		a1.printDetails(); //Print void method
		
		a1.mass = 10.0f;
		a1.x = 20;
		a1.y = 42;
		a1.diameter = 2.0f;

		System.out.println("Updated a1:");
		a1.printDetails(); //Print updated method
	}
}


