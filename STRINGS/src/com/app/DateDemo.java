package com.app;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d = new Date();//date is class reprasens a specific instance of time
		System.out.println("Today date is: " + d);
		
		Calendar c = Calendar.getInstance(); // calender does not create object because Calender is abstract class
		int date = c.get(Calendar.DATE);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("Date is: " + date + "/" + (++month) + "/" + year);
		System.out.println("Date is:::: " + date + "/" + month + "/" + year);
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("TIME IS:" + hour + ":" + minute + ":" + second);

	}

}
