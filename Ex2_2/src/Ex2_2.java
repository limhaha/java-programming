import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		String s1, s2, s3;
		System.out.println("Enter stirng");
		s1 = keyboard.nextLine();
		int position = s1.indexOf(" ");
		
		s2 = s1.substring(0, position);
		s1 = s1.substring(position+1);
		s3 = s1.substring(0, 1).toUpperCase();
		s1 = s1.substring(1);
		s1 = s1 + " " + s2;
			
		System.out.println(s3 + s1);
		

	}

}
