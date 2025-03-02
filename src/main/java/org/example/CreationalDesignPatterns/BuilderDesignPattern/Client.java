package org.example.CreationalDesignPatterns.BuilderDesignPattern;

public class Client {
    public static void main(String[] args){
        Director director=new Director();
        StudentBuilder studentBuilder=new StudentBuilder();
        Student student=director.constructStudent(studentBuilder);
        System.out.println(student);
    }
}
