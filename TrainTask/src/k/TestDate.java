package k;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		DateFormat date1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(date1.format(date));
		DateFormat date2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(date2.format(date));
		DateFormat date3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(date3.format(date));
		DateFormat date4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(date4.format(date));
		
		System.out.println("---------------------------------");
		
		String dateString = "2019-4-4";
		date =  date4.parse(dateString);
		System.out.println(date);
		
		System.out.println("---------------------------------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("GyyyyƒÍ,MM‘¬,dd»’");
		System.out.println(simpleDateFormat.format(date));
		
		
		
	}
}
