package org.rtxrassel.hashset;

import java.util.HashSet;

public class HashSetP {
    static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Rassel Hassan");
        names.add("Karimul");
        names.add("Rassel Hassan");
        names.add(null);

        HashSet<String> name2 = new HashSet<>();
        name2.add("dkfjdk");
        name2.add("kfjdjf");

        boolean result = names.add("Rassel Hassann");
        System.out.println(result);

        names.remove(null);

         name2.addAll(names);


        if (names.contains("Karimul")){
            System.out.println("yes");
        }
        //names.clear();

        for(String s :name2){
            System.out.println(s);
        }

    }
}
