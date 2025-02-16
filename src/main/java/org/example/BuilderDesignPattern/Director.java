package org.example.BuilderDesignPattern;

public class Director {
    public static void main(String[] args){
        StudentBuilder studentBuilder=new StudentBuilder();
        Student student=studentBuilder.setAddress("delhi").setAge(24).setCollege("dtu").setName("harsh raghuvanshi").setRollNo("72").build();
        System.out.println(student);
        StudentBuilder studentBuilder1=new StudentBuilder();
        Student student1=studentBuilder1.setAddress("delhi").setAge(24).setCollege("dtu").build();
        System.out.println(student1);
    }
}
