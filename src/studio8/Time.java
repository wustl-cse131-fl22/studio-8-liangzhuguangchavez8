package studio8;

import java.util.Objects;

public class Time {
	private int minutes;
	private int hours;
	private boolean isTwoFour;
	
	public Time (int minutes, int hours, boolean isTwoFour) {
		this.minutes=minutes;
		this.hours=hours;
		this.isTwoFour=isTwoFour;
		
	}
	
		

	public int getMinutes() {
		return minutes;
	}



	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}



	public int getHours() {
		
		return this.hours;
	}



	public void setHours(int hours) {
		this.hours = hours;
	}



	public boolean isTwoFour() {
		return isTwoFour;
	}



	public void setTwoFour(boolean isTwoFour) {
		this.isTwoFour = isTwoFour;
	}

	public String toString() {
		return getMinutes()+" "+getHours()+" ";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(minutes, hours);
	}



	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode())
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes;
	}



	public static void main(String[] args) {
		
		Time thisTime= new Time (45, 13, false);
		
		System.out.print(thisTime);
		
		Time thatTime = new Time (45, 13, true);
		
		
		
		System.out.print(thatTime.equals(thisTime));
			
    }

}