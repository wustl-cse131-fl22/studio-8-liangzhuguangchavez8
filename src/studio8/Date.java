package studio8;

import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
public Date (int month, int day, int year, boolean isHoliday) {
	this.month=month;
	this.year=year;
	this.day=day;
	this.isHoliday=isHoliday;
	
}

    public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public boolean isHoliday() {
	return isHoliday;
}

public void setHoliday(boolean isHoliday) {
	this.isHoliday = isHoliday;
}

public String toString() {
	return getMonth()+" "+getDay()+" "+getYear()+" ";
}



	@Override
public int hashCode() {
	return Objects.hash(day, month, year);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && month == other.month && year == other.year;
}

	public static void main(String[] args) {
		
		Date thisDate=new Date(12, 17, 2022, false);
		System.out.print(thisDate);
		
		Date thatDate = new Date(12, 15, 2022, false);
		
		System.out.print(thatDate.equals(thisDate));

    }

}
