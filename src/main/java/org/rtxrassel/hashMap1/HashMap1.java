package org.rtxrassel.hashMap1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    static void main(String[] args) {
        Map<Integer,String> info = new HashMap<>();
        info.put(1,"Rassel Hassan");
        info.put(2,"Karimul");
        info.put(3,"Siam");

        info.remove(3);
        System.out.println(info.get(3));

        if (info.containsValue("Karimul")){
            System.out.println(info.size());
        }
        info.size();

        for(Integer key:info.keySet()){
            System.out.println(key);
        }

        for(String value:info.values()){
            System.out.println(value);
        }

        for(Map.Entry<Integer,String> entry:info.entrySet()){
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }
    }
}
