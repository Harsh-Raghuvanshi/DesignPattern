package org.example.BehaviouralDesignPattern.MomentoDesignPattern.Memento;

public class Memento {
    String name;
    Integer age;
    String gender;

    public Memento(String name, Integer age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
