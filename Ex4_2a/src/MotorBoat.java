
public class MotorBoat {

	public static final double C = 60.0; // Capacity of fuel tank
	private double f; // Amount of fuel in the tank
	public static final double M = 80.0; // Maximum speed
	private double s; // Current speed
	private double e;// Efficiency of boat's motor

	public void useFuel(int t) {
		System.out.println("Amount of fuel used at maximum speed : " + (e * M * M * t));
		System.out.println("Amount of fuel used at current speed : " + (e * s * s * t));
		}
	
	public double getF() {
		return f;
	}

	public void setF(double f) {
		if(f>C) {
			System.out.println("Error");
			System.exit(0);
		}
		this.f = f;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		if(s>M) {
			System.out.println("Error");
			System.exit(0);
		}
		this.s = s;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public void tdistance(int t) {
		System.out.println("Given time for Travel distance : " + (s * t));
	}
	
	public void sdistance() {
		System.out.println("Current spped and fuel amout for Travel distance : " + f / (e * s));
	}

	}

