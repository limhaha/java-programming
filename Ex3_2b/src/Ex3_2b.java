import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		System.out.println("Enter integers");
		Scanner keyboard = new Scanner(System.in);
		
		int a=0, b=0, c=0, d=0, f=0, i, k=0;
		i = 0;
		while (i>=0) {
			i = keyboard.nextInt();
			if (i <= 0) break;
			if (i > 100) continue;
			
			if((90<=i) && (i<=100))
				a += 1;
			if((80<=i) && (i<=89))
				b += 1;
			if((70<=i) && (i<=79))
				c += 1;
			if((60<=i) && (i<=69))
				d += 1;
			if((0<=i) && (i<=59))
				f += 1;
			k = k+1;
		}
		System.out.println("A count: " + a);
		System.out.println("B count: " + b);
		System.out.println("C count: " + c);
		System.out.println("D count: " + d);
		System.out.println("F count: " + f);
		System.out.println("total count: " + k);
	}

}
