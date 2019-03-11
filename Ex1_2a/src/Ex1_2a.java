import java.util.Scanner;

public class Ex1_2a {

	public static void main(String[] args) {
		System.out.println("Type your bitrh year");
		
		int n1;
		
		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		
		System.out.println("Your age is");
		System.out.println(2019 - n1);
		
		keyboard.close();
	

	}

}
