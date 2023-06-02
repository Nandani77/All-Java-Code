package allJava;

import java.util.HashSet;

public class jev74 {
    public  static  void main(String[] args){
        HashSet<Integer> myHashSet = new HashSet<>(6,0.5f);
        myHashSet.add(32);
        myHashSet.add(43);
        myHashSet.add(54);
        myHashSet.add(36);
        myHashSet.add(32);
        System.out.println(myHashSet);

    }
}
