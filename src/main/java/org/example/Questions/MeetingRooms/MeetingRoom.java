package org.example.Questions.MeetingRooms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

public class MeetingRoom implements MeetingVenue{
    Integer roomNumber;
    Map<String, ArrayList<Pair<Integer,Integer>>> calendar;

    public MeetingRoom(Integer roomNumber, Map<String,ArrayList<Pair<Integer,Integer>>> calendar){
        this.roomNumber=roomNumber;
        this.calendar=calendar;
    }

    @Override
    public boolean checkAvailability(Integer startTime,Integer endTime,String weekDay){
        ArrayList<Pair<Integer,Integer>> weekDayCalendar=calendar.get(weekDay);
        if(weekDayCalendar==null)return true;
        int siz= weekDayCalendar.size();
        if(endTime<weekDayCalendar.get(0).getKey())return true;
        if(startTime>weekDayCalendar.get(siz-1).getValue())return true;
        for(int i=1;i<siz;i++){
            Integer prevEnd=weekDayCalendar.get(i-1).getValue();
            Integer nowStart= weekDayCalendar.get(i).getKey();
            if(startTime>prevEnd && endTime<nowStart)return true;
        }
        return false;
    }

    @Override
    public void bookTime(Integer startTime,Integer endTime,String weekDay){
        calendar.computeIfAbsent(weekDay, k -> new ArrayList<>());
        calendar.get(weekDay).add(new Pair<>(startTime,endTime));
        calendar.get(weekDay).sort(Comparator.comparing(Pair::getKey));
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }
}
