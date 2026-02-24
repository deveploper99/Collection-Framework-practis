package org.rtxrassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Sorting {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(8,12,7,4,3,5,3,6,2,9));
        numbers.add(1);
        numbers.add(67);
        numbers.add(45);
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("the sorting Numbers: "+numbers);


        numbers.sort((a,b) -> a-b);
        System.out.println("lambda"+numbers);


        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()){
            int index = iterator.previousIndex();
            int index1 = iterator.nextIndex();
            Integer s = iterator.next();
            if (s.equals(45)){
                iterator.set(100);
            }

        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
