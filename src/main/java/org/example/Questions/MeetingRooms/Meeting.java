package org.example.Questions.MeetingRooms;

import java.util.List;

public class Meeting {
    Integer startTime;
    Integer endTime;
    List<Person> personToAttend;

    public Meeting(Integer startTime, Integer endTime, List<Person> personToAttend) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.personToAttend = personToAttend;
    }

}
