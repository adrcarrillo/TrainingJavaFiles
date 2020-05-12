package ch05C;

public class Apple {
	float mass;
	private float diameter = 1.0f; //Private variables needs methods getter stetter
	int x, y;

	static float gravAccel = 9.8f;
	static final float EARTH_ACCEL = 9.8f; // Constant value, it can't be changed at runtime.
	static int SMALL = 0, MEDIUM = 1, LARGE = 2;

	public void printDetails(){
		System.out.println("mass: "+mass);
		System.out.println("diameter: " +diameter);
		System.out.println("position: (" + x + "," + y +")");
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

	public void setDiameter(float newDiameter){
			this.diameter = newDiameter;
	}

	public float getDiameter(){
		return diameter;
	}

	float getWeight(){
		return mass*gravAccel;
	}

	public void moveTo(int x, int y) { // Shadowing variables x and y
		System.out.println("Moving apple to "+x+", "+y+"\n");

		this.x = x;
		if (y > this.diameter/2){
			this.y = y;
			System.out.println("y > diameter/2\n");
		} else {
			this.y = (int)(this.diameter/2);
			System.out.println("y < diameter/2\n");
		}

	}
}
