package org.rtxrassel.arrayListPractis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumber {
   public static void main(String[] args) {

//       Scanner input = new Scanner(System.in);
//       int N = input.nextInt();

       List<Integer> addEvenNumber = new ArrayList<>();
       List<Integer> addOddNumber = new ArrayList<>();
       List<Integer> oddnumber = new ArrayList<>();
//       addOddNumber.add(1);
//       addOddNumber.add(2);
//       addOddNumber.add(3);
//       addOddNumber.add(4);
//       addOddNumber.add(5);
//       addOddNumber.add(6);
//       addOddNumber.add(7);
//       addOddNumber.add(8);
//       addOddNumber.add(9);
//       addOddNumber.add(10);

       for (int i=1;i<=10;i++){
           addOddNumber.add(i);
       }

       for (Integer s: addOddNumber){
           if (s%2==0){
               addEvenNumber.add(s);
           }else {
               oddnumber.add(s);
           }
       }



       System.out.println("Even Number");
       for (Integer b: addEvenNumber){
           System.out.print(b+",");
       }
       System.out.println("\n");

       System.out.println("Odd Number");
       for (Integer o: oddnumber){
           System.out.print(o +",");
       }










   }
}
