import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		System.out.println("Type temperature in Fahrenheit");
		
		float fahren, cels;
		
		Scanner keyboard = new Scanner(System.in);
		
		fahren = keyboard.nextFloat();
		
		cels = 5 * (fahren -  32) / 9;
		
		System.out.println("Celsius : " + cels);
		
	}

}
