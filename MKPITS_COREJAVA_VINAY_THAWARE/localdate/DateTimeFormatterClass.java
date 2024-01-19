package com.mkpits.localdate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClass {
	//DateTimeFormatter	Formatter for displaying and parsing date-time objects
	//The "T" in the example above is used to separate the date from the time. You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
	//The following example will remove both the "T" and nanoseconds from the date-time:
	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("Before Date & Time :"+datetime);
	    DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
	    DateTimeFormatter format1=DateTimeFormatter.ofPattern("E,MMM dd yyy HH:mm:ss");
	    DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    //we have to convert into string
	    String formattedDate=datetime.format(format);
	    String formattedDate1=datetime.format(format1);
	    String formattedDate2=datetime.format(format2);
	  
	    System.out.println("After Date & Time:"+formattedDate);
	    System.out.println("After Date & Time:"+formattedDate1);
	    System.out.println("After Date & Time:"+formattedDate2);
	    
	   


	}

}
