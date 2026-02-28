package org.rtxrassel.arrayListPractis;

import java.util.ArrayList;
import java.util.List;

public class Sum {

   public static void main(String[] args) {
       List<Integer> number = new ArrayList<>();
       int evenSum =0;
       int oddSum =0;
       for (int i=1; i<=10;i++){
           number.add(i);
       }

       for (Integer n: number){
           if (n%2==0){
               evenSum +=n;
           }else {
               oddSum +=n;
           }
       }
       System.out.println("Even Sum = " + evenSum);
       System.out.println("Odd Sum = " + oddSum);
   }
}
