package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarSec10Aula100 {

	public static void main(String[] args) throws ParseException {
/*		
		// SOMANDO UMA UNIDADE DE TEMPO
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		
		System.out.println(sdf.format(d)); // 25/06/2018 12:42:07
		
		Calendar cal = Calendar.getInstance(); 
        cal.setTime(d); 
        cal.add(Calendar.HOUR_OF_DAY, 4);  // somar 4 horas
        d = cal.getTime();
		
        System.out.println(sdf.format(d)); // 25/06/2018 16:42:07
        // FIM - SOMANDO UMA UNIDADE DE TEMPO
*/
		// OBTENDO UMA UNIDADE DE TEMPO
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); 
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);    // buscar os minutos 
		int month   = 1 + cal.get(Calendar.MONTH); // buscar o mes(tem que somar 1 pq no Calender o janeiro começa no mes 0)

		System.out.println("Minutes: " + minutes); // Minutes: 42
		System.out.println("Month: " + month);     // Month: 6
		// FIM - OBTENDO UMA UNIDADE DE TEMPO
		
	}

}
