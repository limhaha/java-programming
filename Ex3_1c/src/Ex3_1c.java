import java.util.Scanner;

public class Ex3_1c {

	public static void main(String[] args) {
		System.out.println("Enter grade");
		
		Scanner keyboard = new Scanner(System.in);
		
		char grade;
		
		grade = keyboard.next().charAt(0);
		
		switch (grade) {
		case 'A' :
			System.out.println("grade value is 4.0");
			break;
		case 'B' :
			System.out.println("grade value is 3.0");
			break;
		case 'C' :
			System.out.println("grade value is 2.0");
			break;
		case 'D' :
			System.out.println("grade value is 1.0");
			break;
		case 'a' :
			System.out.println("grade value is 4.0");
			break;
		case 'b' :
			System.out.println("grade value is 3.0");
			break;
		case 'c' :
			System.out.println("grade value is 2.0");
			break;
		case 'd' :
			System.out.println("grade value is 1.0");
			break;
		default:
			System.out.println("grade value is 0.0");
			break;
		}

	}

}
