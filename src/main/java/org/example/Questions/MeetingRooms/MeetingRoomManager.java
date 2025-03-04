package org.example.Questions.MeetingRooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MeetingRoomManager {
    List<MeetingRoom> meetingRoomList;

    public MeetingRoomManager(List<MeetingRoom> meetingRoomList) {
        this.meetingRoomList = meetingRoomList;
    }

    public void isRoomAvailableAtTime(Integer starTime, Integer endTime, String weekDay){
        List<Integer> availableRooms=new ArrayList<>();
        for(MeetingRoom meetingRoom:meetingRoomList){
            if(meetingRoom.checkAvailability(starTime,endTime,weekDay)){
                availableRooms.add(meetingRoom.getRoomNumber());
            }
        }

        if(availableRooms.isEmpty()){
            System.out.println("No available rooms sorry !!!");
            return;
        }
        System.out.println("Rooms IDs which are available ");
        for(Integer i:availableRooms){
            System.out.print(i+" , ");
        }
        System.out.println();
    }

    public void bookRoomWithRoomNo(Integer starTime,Integer endTime,String weekDay,Integer roomNumber){
        Optional<MeetingRoom> meetingRoom=meetingRoomList.stream().filter(x->x.getRoomNumber().equals(roomNumber)).findFirst();
        if(meetingRoom.isEmpty()){
            System.out.println("Invalid Room Number");
            return;
        }
        MeetingRoom room=meetingRoom.get();
        room.bookTime(starTime,endTime,weekDay);
        System.out.println("Booked successfully !!!");
    }
}
