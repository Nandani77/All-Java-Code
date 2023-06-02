package allJava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class jev80 {
    public static  void main(String[] args ){
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for(Object o: ar){
            System.out.println(o);
        }

        HashSet<Integer> s = new HashSet();
        s.add(5);

        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":" +c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND) );

    }
}
