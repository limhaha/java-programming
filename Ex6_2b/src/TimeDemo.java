
public class TimeDemo {

	public static void main(String[] args) {
		
		Time time = new Time();
		
		time.setTime(15, 25);
		
		System.out.println(time.getTime24());
		System.out.println(time.getTime12());

	}

}
