package org.rtxrassel.arrayListPractis;

public class Student {
    private String name;
    private int roll;
    private float gpa;
    private String semister;

    public Student(String name,int roll,float gpa,String semister){
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;
        this.semister = semister;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
    public float getGpa(){
        return gpa;
    }
    public String getSemister(){
        return semister;
    }



}
