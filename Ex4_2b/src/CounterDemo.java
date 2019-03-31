import java.util.Scanner;

public class CounterDemo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Counter count = new Counter();
		
		
		while(true) {
			System.out.println("\nSelect\n1: reset  2: Increase  3: Decrease  4: Get value  5: End program");
			
			int i = keyboard.nextInt();
			if ( i == 5)
				break;
		switch (i) {
			case 1 : 
				count.reset();
				break;
			
			case 2 :
				count.increase();
				break;
				
			case 3 :
				count.decrease();
				break;
				
			case 4 : 
				System.out.println("Current Value : " + count.current() +"\n");
				break;
			
		}
		}
		

	}

}
