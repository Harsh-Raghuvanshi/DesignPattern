package org.example.Questions.MeetingRooms;

public class Person {
    String name;
    String designation;
    Integer id;

    public Person(String name, String designation, Integer id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
