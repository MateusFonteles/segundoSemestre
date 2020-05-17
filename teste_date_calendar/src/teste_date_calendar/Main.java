package teste_date_calendar;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		
	 Date today = new Date();
	 Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 240));

	System.out.println(today);
	System.out.println(tomorrow);
		
	}

}
