package org.example.BuilderDesignPattern;

public class Student {
    String name;
    Integer age;
    String rollNo;
    String address;
    String college;

    public Student(String name,String rollNo,String address,String college,Integer age){
        this.name=name;
        this.address=address;
        this.age=age;
        this.college=college;
        this.rollNo=rollNo;
    }

    public Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.rollNo=studentBuilder.rollNo;
        this.college=studentBuilder.college;
        this.age=studentBuilder.age;
        this.address=studentBuilder.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo='" + rollNo + '\'' +
                ", address='" + address + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
