import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		boat.C = 10;
		boat.f = 30;
		boat.M = 80;
		boat.s = 30;
		
		int t;
		System.out.println("Type time");
		Scanner keyboard = new Scanner(System.in);
		t = keyboard.nextInt();
		
		boat.useFuel(t);
		boat.tdistance(t);
		boat.sdistance();

	}

}
