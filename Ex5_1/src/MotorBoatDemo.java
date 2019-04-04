import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		MotorBoat boat = new MotorBoat();
		
		boat.getF(); 
		boat.setF(50);
		boat.getS();
		boat.setS(40);
		boat.getE();
		boat.setE(0.1);
		
		int t;
		System.out.println("Type time");
		Scanner keyboard = new Scanner(System.in);
		t = keyboard.nextInt();
		
		boat.useFuel(t);
		boat.tdistance(t);
		boat.sdistance();
		
		MotorBoat  b = new MotorBoat();
		b.getF(); 
		b.setF(50);
		b.getS();
		b.setS(40);
		b.getE();
		b.setE(0.1);
		
		System.out.println("They are equal? " + boat.equals(b));
	}

}
