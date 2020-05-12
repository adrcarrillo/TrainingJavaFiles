package ch05C;

public class PrintAppleDetails4 {
	public static void main (String[] args) {
		Field f = new Field();
		f.setupApples();
		System.out.println("Apple a1:");
		f.a1.printDetails();
		f.a1.moveTo(50,1);
		System.out.println("Apple a2:");
		f.a2.printDetails();
		f.detectCollisions();
	}
}
