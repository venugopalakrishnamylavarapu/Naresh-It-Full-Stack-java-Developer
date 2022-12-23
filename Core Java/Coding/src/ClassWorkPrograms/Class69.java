package ClassWorkPrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
 New date time API
 -----------------
->Java 8 has introduced a new date time API which overcomes the drawback which are present 
  the old date time api
->The draw backs which are present in the old date time API are 
	a)It is not thread safe.
	b)it is poorly designed means default date in old date time api starts with 1900,month starts 
	  from 1,Day starts from 0.
	c)it is very difficult to handle time zones in old date time api.
 */
public class Class69 {
	void meth1()
	{
		System.out.println("==>"+ZoneId.getAvailableZoneIds().size());
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
//		System.out.println(LocalTime.now(ZoneId.of("Africa/Tunis")));
//		new Class69().meth1();
	}
}
