package PaqueteCreado;

import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		System.out.println("el mes es: " + cal.getDisplayName(Calendar.MONTH, Calendar.MONTH, null));
	}

}
