import java.util.Scanner;

public class Ex3_1a {

	public static void main(String[] args) {
		System.out.println("Enter check amount");
		
		int check;
		
		Scanner keyboard = new Scanner(System.in);
		check = keyboard.nextInt();
		
		if (check < 10)
			System.out.println("charge is $1");
		else if (check < 100)
			System.out.println("charge is $" + (check * 0.1));
		else if (check < 1000)
			System.out.println("charge is $" + (5 + check * 0.05));
		else if (check >= 1000)
			System.out.println("charge is $" + (40 + check * 0.01));

	}

}
