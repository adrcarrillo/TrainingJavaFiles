package ch05;

public class Apple {
	float mass;
	float diameter = 1.0f;
	int x, y;

	public void printDetails(){
		System.out.println("  mass: "+mass);
		System.out.println(" diameter: " +diameter);
		System.out.println(" position: (" + x + "," + y +")");
	}

	public boolean isTouching(Apple other) { //Instances variable as a argument
		double xdiff = x - other.x;
		double ydiff = y - other.y;
		double distance = Math.sqrt(xdiff * xdiff + ydiff * ydiff);
		if (distance < diameter / 2 + other.diameter/2) {
			return true;
			} else {
			return false;
		}
	}
}
