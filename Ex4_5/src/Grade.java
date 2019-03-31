import java.util.Scanner;

public class Grade {
	Scanner keyboard = new Scanner(System.in);
	private int a, b, c, d, f;
	
	public void count() {
		System.out.println("Number of 'A' grades ?");
		this.a = keyboard.nextInt();
		
		System.out.println("Number of 'B' grades ?");
		this.b = keyboard.nextInt();
		
		System.out.println("Number of 'C' grades ?");
		this.c = keyboard.nextInt();
		
		System.out.println("Number of 'D' grades ?");
		this.d = keyboard.nextInt();
		
		System.out.println("Number of 'F' grades ?");
		this.f = keyboard.nextInt();
		
		}
	
		public int total() { 
			int total = (a + b + c + d + f);
			return total;
		}
		
		public float percentA() {
		float percentA = a / (float)(a + b + c + d + f) * 100;
		return percentA;
		}
		
		public float percentB() {
			float percentB = b / (float)(a + b + c + d + f) * 100;
			return percentB;
			}
		
		public float percentC() {
			float percentC = c / (float)(a + b + c + d + f) * 100;
			return percentC;
			}
		
		public float percentD() {
			float percentD = d / (float)(a + b + c + d + f) * 100;
			return percentD;
			}
		
		public float percentF() {
			float percentF = f / (float)(a + b + c + d + f) * 100;
			return percentF;
			}
		
		public void graph() {
			System.out.println("\n<GRAPH>");
			System.out.println("0    10   20   30   40    50   60   70   80   90   100");
			System.out.println("|    |    |    |    |     |    |     |    |    |    |");
			
			for(int i=0; i < (Math.round(percentA()) / 2); i++) {
				System.out.print("*");
			}
				System.out.print(" A\n");
			
			
			for(int i=0; i < (Math.round(percentB()) / 2); i++) {
				System.out.print("*");
			}
			System.out.print(" B\n");
			
			for(int i=0; i < (Math.round(percentC()) / 2); i++) {
				System.out.print("*");
			}
			System.out.print(" C\n");
			
			for(int i=0; i < (Math.round(percentD()) / 2); i++) {
				System.out.print("*");
			}
			System.out.print(" D\n");
			
			for(int i=0; i < (Math.round(percentF()) / 2); i++) {
				System.out.print("*");
			}
			System.out.print(" F");
			
		}

			
	
	 }

