

public class TimeDemo {

	public static void main(String[] args) {
		Time time = new Time();
		
		time.getHour();
		time.getMinute();
		time.setTime2(3, 35, true);
		System.out.println(time.isValid(35, 67));
	}

}
