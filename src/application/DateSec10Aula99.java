package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

// https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
// Um objeto Date internamente armazena:
// •	O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
// •	GMT: Greenwich Mean Time (time zone)
// •	UTC: Coordinated Universal Time (time standard)

// SimpleDateFormat
// •	https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
// •	Define formatos para conversão entre Date e String
// •	dd/MM/yyyy -> 23/07/2018
// •	dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07

// Padrão ISO 8601 e classe Instant
// •	Formato: yyyy-MM-ddTHH:mm:ssZ
// •	Exemplo: "2018-06-25T15:42:07Z"
// •	Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

public class DateSec10Aula99 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();                           // Tue May 26 12:39:57 BRT 2020
		Date x2 = new Date(System.currentTimeMillis()); // Tue May 26 12:39:57 BRT 2020
		Date x3 = new Date(0L);                         // Wed Dec 31 21:00:00 BRT 1969
		Date x4 = new Date(1000L * 60L * 60L * 5L);     // Thu Jan 01 02:00:00 BRT 1970

		Date y1 = sdf1.parse("25/06/2018");                         // Mon Jun 25 00:00:00 BRT 2018
		Date y2 = sdf2.parse("25/06/2018 15:42:07");                // Mon Jun 25 15:42:07 BRT 2018
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Mon Jun 25 12:42:07 BRT 2018

		System.out.println("x1: " + x1); 
		System.out.println("x2: " + x2); 
		System.out.println("x3: " + x3); 
		System.out.println("x4: " + x4); 
		System.out.println("y1: " + y1); 
		System.out.println("y2: " + y2); 
		System.out.println("y3: " + y3); 
		System.out.println("	");
		System.out.println("x1: " + sdf2.format(x1)); // x1: 26/05/2020 12:39:57
		System.out.println("x2: " + sdf2.format(x2)); // x2: 26/05/2020 12:39:57
		System.out.println("x3: " + sdf2.format(x3)); // x3: 31/12/1969 21:00:00
		System.out.println("x4: " + sdf2.format(x4)); // x4: 01/01/1970 02:00:00
		System.out.println("y1: " + sdf2.format(y1)); // y1: 25/06/2018 00:00:00 
		System.out.println("y2: " + sdf2.format(y2)); // y2: 25/06/2018 15:42:07
		System.out.println("y3: " + sdf2.format(y3)); // y3: 25/06/2018 12:42:07
		System.out.println("	");
		System.out.println("x1: " + sdf3.format(x1)); // x1: 26/05/2020 15:39:57
		System.out.println("x2: " + sdf3.format(x2)); // x2: 26/05/2020 15:39:57 
		System.out.println("x3: " + sdf3.format(x3)); // x3: 01/01/1970 00:00:00
		System.out.println("x4: " + sdf3.format(x4)); // x4: 01/01/1970 05:00:00
		System.out.println("y1: " + sdf3.format(y1)); // y1: 25/06/2018 03:00:00
		System.out.println("y2: " + sdf3.format(y2)); // y2: 25/06/2018 18:42:07

	}

}