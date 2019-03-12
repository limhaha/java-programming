import java.util.Scanner;


public class Ex2_3b {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Type radius (inches)");
	
	float radius, depth, radiusFeet;
	double V;
	radius = keyboard.nextFloat();
	
	System.out.println("Type depth (in feet)");
	depth = keyboard.nextFloat();
	
	radiusFeet = radius / 12;
	V = Math.PI * radiusFeet * radiusFeet * depth;
	V = V * 7.48;
	
	System.out.println("a " + depth + "-foot well with a radius of " + radius + " inches holds about "
			+ Math.round(V) + " gallons of water");
	}

}
