package org.example.CreationalDesignPatterns.BuilderDesignPattern;

public class Director {
    public Student constructStudent(StudentBuilder builder){
       return builder.setAddress("delhi").setAge(24).setCollege("dtu").setName("harsh raghuvanshi").setRollNo("72").build();
    }
}
