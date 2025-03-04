package org.example.Questions.MeetingRooms;

public interface MeetingVenue {
    boolean checkAvailability(Integer startTime,Integer endTime,String weekDay);
    void bookTime(Integer startTime,Integer endTime,String weekDay);
}
