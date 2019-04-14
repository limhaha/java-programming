
public class Time {
	private int hour, minute;
	
	Time(){
		hour = 0; hour = 0;
		}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		System.out.println("Time " + hour + " : " + minute);
	}
	
	public void setTime2(int hour2, int minute2, boolean isPM) {
		if(isPM == true) {
			hour2 = hour2 + 12;
		setTime(hour2, minute2);
		}
		else
			this.setTime(hour2, minute2);
	}
	
	public boolean isValid(int hour, int minute) {
		if ( (hour>0) && (hour<24) && (minute>0) && (minute <60)) {
			return true;	
			}
		else
			return false;
	}

	}
