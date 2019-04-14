
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
	
	public String getTime24() {
		return String.format("%02d%02d",this.hour,this.minute);
	}
	
	public String getTime12() {
		String t = null;
		if(this.hour>12)
			t = String.format("%d:%02d PM", this.hour - 12, this.minute);
		if(this.hour < 12)
			t = String.format("%d:%020d AM", this.hour, this.minute);
			
			return t;
	}
	}
