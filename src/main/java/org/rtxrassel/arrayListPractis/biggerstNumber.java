package org.rtxrassel.arrayListPractis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class biggerstNumber {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }
        int max = number.get(0);
        int min = number.get(0);

        if (!number.isEmpty()) {
            for (Integer s : number) {
                if (s >= max) {
                    max = s;
                }

                if (s <= min) {
                    min = s;
                }
            }
        }


//      int max = Collections.max(number);
//      int min = Collections.min(number);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (Integer m : number) {
            if (m > largest) {
                secondLargest = largest;
                largest = m;
            } else if (m>secondLargest && m !=largest) {
                secondLargest = m;
                
            }
        }


        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);
    }
}