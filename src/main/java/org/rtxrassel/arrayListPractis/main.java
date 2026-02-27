package org.rtxrassel.arrayListPractis;

import java.util.ArrayList;
import java.util.List;

public class main {
  public static void main(String[] args) {
        List<Student> studentsInfo = new ArrayList<>();

        Student s1 = new Student("Rassel Hassan",1,4.45f,"7th");
        Student s2 = new Student("Hassan",2,2.4f,"1st");
        Student s3 = new Student("Karimul",3,5.00f,"8st");
        studentsInfo.add(s1);
        studentsInfo.add(s2);
        studentsInfo.add(s3);

        studentsInfo.get(2).setName("Riya Moni");
      System.out.println(studentsInfo.size());

        boolean found = false;
        for (Student s :studentsInfo){
            if (s.getName().equals("Riya Moni")){
                found = true;
                break;
            }
        }

      if (found){
          System.out.println("yes");
      }



        for (Student s:studentsInfo){
            System.out.println(s.getName());
        }
    }
}
