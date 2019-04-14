import java.util.Scanner;
public class Characteristic {
	
	private String description;
	private int rating;
	
	private String getDescription() {
		return description;
	}
	
	private int getRating(){
		return rating;
	}
	
	public void setRating() {
		System.out.println("Type " + this.description + "'s rating");
		Scanner keyboard = new Scanner(System.in);
		int k = keyboard.nextInt();
			this.rating = k;
	}
	
	public void setDescription(String descrip) {
		this.description = descrip;
	}
	
	public double getCompatability(Characteristic otherRating) {
		if (description.equals(otherRating.getDescription()) == true)
		return 0;
		
		else
		return rating;
	}
	
	public double getCompatibilityMeasure(Characteristic otherRating) {
		int r1 = rating;
		int r2 = otherRating.getRating();
		
		if(r1 == 0 || r2 == 0) {
			return 0.0;
		}
		else
			return 1 - ((r1 - r2) * (r1 - r2)) / 81;
	}

}
