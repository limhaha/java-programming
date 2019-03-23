import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int size;
		String s1 = "*";
		System.out.println("Size of Triangle?(1~50)");
		
		size = keyboard.nextInt();
				
		int i, k;
		for(i=0; i < size; i++) {
			
			for(k=0; k<i+1; k++)
				System.out.print(s1);
			System.out.print("\n");
		}
		for(i=0; i < size-1; i++) {
			
			for(k=0; k< (size -1 - i); k++)
				System.out.print(s1);
			System.out.print("\n");
		}
	}

}
