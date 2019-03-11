import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		System.out.println("type four-digit integer");
		
		 int n1, n2, n3, n4, num;
		 
		Scanner keyboard = new Scanner(System.in);
		
		num = keyboard.nextInt();
		
		n1 = num / 1000;
		num = num - n1 * 1000;
		n2 = num  / 100;
		num = num - n2 * 100;
		n3 = num / 10;
		num = num - n3 * 10;
		n4 = num;
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
	}

}
