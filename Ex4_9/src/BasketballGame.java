import java.util.Scanner;

public class BasketballGame {

	private String firstTeam;
	private String secondTeam;
	private int s1;
	private int s2;
	private int status;
	Scanner keyboard = new Scanner(System.in);

	public void setTeam1() {
		String name;
		System.out.println("Enter the name of the first team: ");
		name = keyboard.nextLine();
		this.firstTeam = name;
	}

	public void setTeam2() {
		String name;
		System.out.println("Enter the name of second team: ");
		name = keyboard.nextLine();
		this.secondTeam = name;
	}

	public String getTeam1() {
		return this.firstTeam;
	}

	public String getTeam2() {
		return this.secondTeam;
	}

	public void changeStatus(int status) {
		System.out.println("Enter the status of game 1. finished 2. in progress: ");
		status = keyboard.nextInt();
	}

	public void checkStatus() {
		if (status == 1)
			System.exit(0);
	}

	public void onePoint(String t) {
		if (t.equals(this.firstTeam))
			this.s1++;
		if (t.equals(this.secondTeam))
			this.s2++;
	}

	public void twoPoint(String t) {
		if (t.equals(this.firstTeam))
			this.s1 = this.s1 + 2;
		if (t.equals(this.secondTeam))
			this.s2 = this.s2 + 2;
	}

	public void threePoint(String t) {
		if (t.equals(this.firstTeam))
			this.s1 = this.s1 + 3;
		if (t.equals(this.secondTeam))
			this.s2 = this.s2 + 3;
	}

	public String winnig() {
		String a = null;

		if (s1 > s2)
			a = this.firstTeam + " is winnig now";

		if (s1 == s2)
			a = "Draw";

		if (s1 < s2)
			a = this.secondTeam + " is winnig now";

		return a;
	}

	public void showScore() {
		System.out.println(this.firstTeam + " " + s1 + " : " + this.secondTeam + " " + s2 + "\nTeam " + this.winnig());
	}
}