import java.util.Scanner;

public class Ex2_3a {

	public static void main(String[] args) {
		System.out.println("Type price of item");
		Scanner keyboard = new Scanner(System.in);
		
		int item, change, quater, dime, nickel;
		
		item = keyboard.nextInt();
		change = 100 - item;
		quater = change / 25;
		
		change = change - quater * 25;
		dime = (change % 25) / 10;
		
		change = change - dime * 10;
		nickel = change / 5;
		
		System.out.println("for an item of " + item +" cents," + " the change is " + (100 - item)
				+" cents, which is given by " + quater +" quarters, "+ dime + " dimes, " +" and " + nickel +" nickels");
		
		
	}

}
