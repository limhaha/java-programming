import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the initial velocity of the ball: ");
		int vel;
		vel = keyboard.nextInt();
		int time = 0, count = 0; 
		float height = 0F;
		
		while(true) {
			
			System.out.println("Time: " + time + " Height: " + height );
			
			height = height + (vel - (time * 32));
			time ++;
			
			if(height < 0) {
				System.out.println("Bounce!");
				height = (float) (height * (-0.5));
				vel = (int) (vel * (-0.5));
				count ++;
			}
				if(count == 5)
				break;
		}
		
	}

}
