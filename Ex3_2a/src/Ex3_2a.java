import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		System.out.println("Enter integers");
		Scanner keyboard = new Scanner(System.in);
		
		int max, min, i, k;
		double sum, avg;
		k = 0;
		sum = 0;
		max = 0;
		min = 0;
		i = 0;
		while (i>=0) {
			i = keyboard.nextInt();
			if (i <= 0) break;
			if (max < i)
				max = i;
			
			if(min == 0)
				min = i;
			if (min > i)
				min = i;
			sum += i;
			k = k+1;
		} 
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum/k);

	}

}
