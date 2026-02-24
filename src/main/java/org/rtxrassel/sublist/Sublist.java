package org.rtxrassel.sublist;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Sublist {
    static void main() {

        ArrayList<String> big = new ArrayList<>();
        big.add("A");
        big.add("B");
        big.add("C");
        big.add("D");
        big.add("E");

        List<String> sub = new ArrayList<>(big.subList(1,4));
        big.add("F");

        sub.add(1,"XXX");
        //System.out.println(sub.get(1));
        for(String s:big){
            System.out.println(s);
        }




//
    }
}
