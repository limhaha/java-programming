import java.util.Scanner;
public class Movie {
	
	private String name;
	private String rating;
	private int rateOne;
	private int rateTwo;
	private int rateThree;
	private int rateFour;
	private int rateFive;
	
	public String getN() {
		return this.name;
	}
	
	public void setN(String n) {
		this.name = n;
	}
	
	public String getR() {
		return this.rating;
	}
	
	public void setR(String r) {
		this.rating = r;
	}
	
	public void addRating() {
		
		while (true) {
			System.out.println("Type rating(1 ~ 5) : " + "\n" + "if you type other number, program will be ended");
			Scanner keyboard = new Scanner(System.in);
		int c = keyboard.nextInt();
		
		if (c == 1)
			this.rateOne ++;
		else if (c == 2)
			this.rateTwo ++;
		else if (c == 3)
			this.rateThree ++;
		else if (c == 4)
			this.rateFour ++;
		else if (c == 5)
			this.rateFive ++;
		
		else {
			System.out.println("Finish");
			break;
		}
	}
	}
	
		public float getAverage() {
			float avg = (1 * this.rateOne + 2 * this.rateTwo + 3 * this.rateThree + 4 * this.rateFour + 5 * this.rateFive) / 
					(float)(this.rateOne + this.rateTwo + this.rateThree + this.rateFour + this.rateFive);
			return avg;
		}
		public boolean equals(Movie m) {
		      return(this.name.equals(m.name) && this.rating.equals(m.rating) && this.rateOne == m.rateOne && 
		    		  this.rateTwo == m.rateTwo && this.rateThree == m.rateThree && this.rateFour == m.rateFour && this.rateFive == m.rateFive);
		   }

	

}
