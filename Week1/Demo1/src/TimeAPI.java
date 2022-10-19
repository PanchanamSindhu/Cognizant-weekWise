import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date + " today's date");
		LocalDate specificDate = LocalDate.of(1996, Month.OCTOBER, 18);
		System.out.println("Specific date :" + specificDate);

		LocalDate todayStandardTime = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("current date in ISD :" + todayStandardTime);

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		// to print in a particular format
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		System.out.println("in formatted manner " + formatedDateTime);

		// printing months days and seconds
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : " + month + " day : " + day + " seconds : " + seconds);

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
		Period gap = Period.between(date2, date1);
		System.out.println("gap between dates " + "is a period of " + gap);

		LocalTime time1 = LocalTime.now();
		LocalTime time2 = time1.plusHours(5);
		System.out.println("after adding five hours " + "of duration " + time2);

		Duration durationGap = Duration.between(time2, time1);
		System.out.println("duration gap between time1" + " & time2 is " + durationGap);
		
		/*
		 * A standard set of date periods units. This set of units provide unit-based access to manipulate a date,
		 *  time or date-time. 
		 * The standard set of units can be extended by implementing TemporalUnit .
		 */

		// adding 2 years to the current date
		LocalDate year = date.plus(2, ChronoUnit.YEARS);
		System.out.println("next to next year is " + year);

		// adding 1 month to the current data
		LocalDate nextMonth = date.plus(1, ChronoUnit.MONTHS);
		System.out.println("the next month is " + nextMonth);
		
		

	}

}
