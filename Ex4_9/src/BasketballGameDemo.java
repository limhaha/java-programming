import java.util.Scanner;

public class BasketballGameDemo {

	public static void main(String[] args) {

		BasketballGame game = new BasketballGame();

		game.setTeam1();
		game.setTeam2();
		
		System.out.println("If you want to finish the game ->" + " Enter : 'finish'.");

		while (true) {

			System.out.println("Which team get the score?: " + game.getTeam1() + " or " + game.getTeam2());

			Scanner keyboard = new Scanner(System.in);
			String team = keyboard.next();
			if (team.equals("finish")) {
				System.out.println("End Game");
				System.exit(0);
			}

			if (team.equals(game.getTeam1())) {
				System.out.println("How many point team gets? : ");
				int score = keyboard.nextInt();
				if (score == 1)
					game.onePoint(game.getTeam1());
				if (score == 2)
					game.twoPoint(game.getTeam1());
				if (score == 3)
					game.threePoint(game.getTeam1());
			}

			if (team.equals(game.getTeam2())) {
				System.out.println("How many point team gets? : ");
				int score = keyboard.nextInt();
				if (score == 1)
					game.onePoint(game.getTeam2());
				if (score == 2)
					game.twoPoint(game.getTeam2());
				if (score == 3)
					game.threePoint(game.getTeam2());
			}

			game.showScore();
		}
	}

}
