package allJava;

import java.util.ArrayDeque;

public class jev73 {
    public static  void main(String[] args){
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(2);
        ad1.add(43);
        ad1.add(23);
        ad1.add(54);
        ad1.add(32);
        ad1.addFirst(233);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
