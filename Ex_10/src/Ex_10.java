import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		
		while(true) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("1.Running Program\n2.exit");
		num = keyboard.nextInt();
		if(num == 1) {
	
		float balance, rate;
		float anual, month, day, Frate;
		System.out.println("Balance?");
		balance = keyboard.nextInt();
		System.out.println("Interest rate?");
		rate = keyboard.nextInt();
		
		anual = balance;
		month = balance;
		day = balance;
		Frate = rate / 100;
		int i;
		
		for(i=0; i<10; i++)
			anual = anual + (anual * Frate);
		for(i=0; i<120; i++)
			month = month + (month * (Frate / 12));
		for(i=0; i<3650; i++)
			day = day + (day * (Frate / 365));
		
		System.out.println("Anually: " + anual);
		System.out.println("Monthy: " + month);
		System.out.println("Daily: " + day);
		}
		
		if (num == 2) {
			System.out.println("End program");
			break;
	}
		}
	}
}
