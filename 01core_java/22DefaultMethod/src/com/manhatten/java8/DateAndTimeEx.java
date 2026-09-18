package com.manhatten.java8;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeEx {

	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		System.out.println(dt.getDayOfWeek());
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getDayOfYear());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
	}

}
