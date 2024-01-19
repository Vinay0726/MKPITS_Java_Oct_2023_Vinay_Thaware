package com.mkpits.localdate;

import java.time.LocalDateTime;

public class LocalDateTimeClass {
	//LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
	//To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:
	public static void main(String[] args) {
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);

	}

}
