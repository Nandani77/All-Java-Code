package allJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class jev79 {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY__H:m");
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);
        System.out.println(myDate);
    }
}
