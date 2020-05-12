package ch05;

public class Apple2 {
	float mass;
	float diameter = 1.0f;
	int x, y;

	public void printDetails(){
		System.out.println("  mass: "+mass);
		System.out.println(" diameter: " +diameter);
		System.out.println(" position: (" + x + "," + y +")");
	}
}
