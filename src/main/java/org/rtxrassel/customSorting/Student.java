package org.rtxrassel.customSorting;


import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

    private String name;
    private int roll;
    private double gpa;

    public Student(String name,int roll,double gpa){
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Student o) {
        return Double.compare(this.roll,o.roll);
    }

    @Override
    public String toString(){
        return "name:"+name+"\nRoll: "+roll +"\nGPA: "+gpa +"\n====== \n";
    }



    static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Rassel Hassan",56,4.50);
        Student s2 = new Student("Akbar",236,1.50);
        Student s4 = new Student("Hassan",2,3.13);
        students.add(s1);
        students.add(s2);
        students.add(s4);

        Collections.sort(students);
        System.out.println(students);

    }
}
