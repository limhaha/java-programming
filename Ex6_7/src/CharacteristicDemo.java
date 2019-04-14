import java.util.Scanner;

public class CharacteristicDemo {

	public static void main(String[] args) {
		Characteristic c1 = new Characteristic();
		Characteristic c2 = new Characteristic();
		
		c1.setDescription("person1");
		c1.setRating();
		
		c2.setDescription("person2");
		c2.setRating();
		
		System.out.println(c1.getCompatability(c2));
		System.out.println(c1.getCompatibilityMeasure(c2));
	}

}
