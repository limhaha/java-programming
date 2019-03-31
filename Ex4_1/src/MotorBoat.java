
public class MotorBoat {

	public double C; // Capacity of fuel tank
	public double f; // Amount of fuel in the tank
	public double M; // Maximum speed
	public double s; // Current speed
	public double e = 0.1; // Efficiency of boat's motor

	public void useFuel(int t) {
		System.out.println("Amount of fuel used at maximum speed : " + (e * M * M * t));
		System.out.println("Amount of fuel used at current speed : " + (e * s * s * t));
		}
	
	public void tdistance(int t) {
		System.out.println("Given time for Travel distance : " + (s * t));
	}
	
	public void sdistance() {
		System.out.println("Current spped and fuel amout for Travel distance : " + f / (e * s));
	}

	}

