package com.ss.jb.five;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class AsgnmntFour {
//			1. Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
//			The LocalDate class -> LocalDateTime birthday = LocalDateTime.of(1996, 05, 21, 03, 50, 49, 890);
	public void setBirthday() {
		
		LocalDateTime birthday = LocalDateTime.of(1996, 05, 21, 03, 50, 49, 890);
		System.out.println("My Birthday is " + birthday);
		
	}

//			2. Given a random date, how would you find the date of the previous Thursday?
	public void findPrevThursday(LocalDateTime randomDate) {
		LocalDateTime prevThursday = randomDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
		System.out.println("The previous Thursday was: " + prevThursday);
	}
//			3. What is the difference between a ZoneId and a ZoneOffset?
//			ZoneID represents time-zones, Offsets extends ZoneID and represents with GMT/UTC. if a country has diff offsets for summer/winter
	public boolean zoneDiff() {
		System.out.println("This is ZoneId: " + ZoneId.of("US/Eastern"));
		
		System.out.println("This is ZoneOffset: " + ZoneId.of("US/Eastern").getRules().getOffset(LocalDateTime.now()));
		
		return true;
	}
//			4. How would you convert an Instant to a ZonedDateTime? How would you convert a ZonedDateTime to an Instant?
	public boolean convertZoneDateTime() {
		
		//instant -> ZonedDateTime
		Instant instant = Instant.now();
		System.out.println(instant.toString());
		ZonedDateTime now = instant.atZone(ZoneId.of("US/Eastern"));
		System.out.println(now);
		
		//ZonedDateTime -> instant
		LocalDateTime date = LocalDateTime.now();
		ZonedDateTime current = date.atZone(ZoneId.of("US/Eastern"));
		System.out.println("\nZoneDateTime: " + current);
		System.out.println(current.toInstant());
		return true;
	}
//			5. Write an example that, for a given year, reports the length of each month within that year.
	public boolean monthLength(Year year) {
		for (int i = 1; i<=12;i++) {
			System.out.println(year.atMonth(i) + ": " + year.atMonth(i).lengthOfMonth());
		}

		return false;
	}
//			6. Write an example that, for a given month of the current year, lists all of the Mondays in that month.
	public boolean mondays(YearMonth month) {
		ArrayList<LocalDate> mondayList= new ArrayList<>();
		//for (LocalDate date = month.atDay(1).with(DayOfWeek.MONDAY); date.;date = date.plusWeeks(1)) {
		for (int i = 1;i<=month.lengthOfMonth();i++) {
			LocalDate date = month.atDay(i);
			if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
			mondayList.add(date);
			}
		}
		
		System.out.println("List of Mondays of ");
		mondayList.forEach((d) -> System.out.println(d));
		return true;
	}
//			7. Write an example that tests whether a given date occurs on Friday the 13th.
	public boolean FridayThirteen(LocalDate date) {
		return  date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13 ? true : false;
		
		//return false;
	}
	
	public static void main(String[] args) {

		AsgnmntFour obj = new AsgnmntFour();
		System.out.println("1)");
		obj.setBirthday(); //1
		
		System.out.println("2)");
		obj.findPrevThursday(LocalDateTime.now()); //2
		
		System.out.println("3)");
		obj.zoneDiff(); //3
		
		System.out.println("4)");
		obj.convertZoneDateTime(); //4
		
		System.out.println("5)");
		obj.monthLength(Year.of(2020)); //5
		
		System.out.println("6)");
		obj.mondays(YearMonth.now()); //6
		
		System.out.println("7)");
		System.out.println(obj.FridayThirteen(LocalDate.now())); //7
		System.out.println(obj.FridayThirteen(LocalDate.of(2020, 11, 13))); //7
		
	}
}
