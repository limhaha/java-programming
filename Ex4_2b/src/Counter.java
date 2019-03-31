
public class Counter {
	
	private int count;
	
	public void reset() {
		count = 0;
	}
	
	public void increase() {
		count ++;
	}
	
	public void decrease() {
		if(count > 0)
		count--;
		else
		System.out.println("Negative");
	}
	
	public int current() {
		return count;
	}

}
