package allJava;

import java.util.ArrayList;
import java.util.*;

public class jev71 {
    public static void main(String[] args){
       ArrayList<Integer> l1 = new ArrayList<>();
       ArrayList<Integer>l2 = new ArrayList<>(5);
       l2.add(32);
       l2.add(34);
       l2.add(54);
       l2.add(88);
       l2.add(67);

       l1.add(6);
       l1.add(7);
       l1.add(8);
       l1.add(0,9);
       l1.add(0,3);
       l1.addAll(0,l2);
       //l1.clear();
       l1.set(1,299);
       System.out.println(l1.contains(89));
       System.out.println(l1.indexOf(32));

       for (int i=0; i<l1.size();i++){
           System.out.print(l1.get(i));
          System.out.print(" ,");
       }
       //array
        //String
        //linkedlist
        //stack
        //sorting all

    }
}
