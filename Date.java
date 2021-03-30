public class Date {
	private int month; 
	private int day; 
	private int year; 

	public Date(int theDay, int theMonth, int theYear) {
		month = checkMonth(theMonth); 
		year = theYear;
		day = checkDay(theDay); 
	} 
	private static int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12) // validate month
			return testMonth;
		else
			return 1; 
	} 
	private int checkDay(int testDay) {

		if (testDay > 0 && testDay <= daysPerMonth(month, year))
			return testDay;

		if (month == 2 && testDay == 29 && Date.isLeap(year))
			return testDay;
		return 1;
	} 

	public static boolean isLeap(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	public static int daysPerMonth(int month, int year){
		month=checkMonth(month);
		switch (month) {
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return isLeap(year)?29:28;
		default:
			return 31;
		}
	}

	public String toString() {
		return String.format("%02d/%02d/%d", day, month, year);
	}


}
