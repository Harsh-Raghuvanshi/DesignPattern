package org.example.BuilderDesignPattern;

public class StudentBuilder {
    String name;
    Integer age;
    String rollNo;
    String address;
    String college;

    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }
    public StudentBuilder setAge(Integer age){
        this.age=age;
        return this;
    }
    public StudentBuilder setRollNo(String rollNo){
        this.rollNo=rollNo;
        return this;
    }
    public StudentBuilder setAddress(String address){
        this.address=address;
        return this;
    }
    public StudentBuilder setCollege(String college){
        this.college=college;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
