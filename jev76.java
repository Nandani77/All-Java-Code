package allJava;

import java.util.Calendar;
import java.util.TimeZone;

public class jev76 {
    public static void main(String[] args) {

      /*  Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());*/

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC+5:30"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());




    }
}