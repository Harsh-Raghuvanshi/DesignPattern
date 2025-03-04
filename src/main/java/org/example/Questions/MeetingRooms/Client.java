package org.example.Questions.MeetingRooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Client {

//    LLD Meeting Rooms
//
// 1.    Entities —> Meeting Room , Person , Meeting , MeetingRoomManager
// 2.    Components of Entities —>
//            1. Meeting Room   —> roomNumber (unique Identifier)  , calendar Map<string, Map<interger,integer>>
//            2. Person —> name , designation , person_id
//            3. Meeting —> List<String> persons_to_attend_meet , startTime , endTime
// 3. Function
//    1. MeetingRoom —> isRoomAvailable ( startTime, endgame, day) ,
//    2. Person —> normal getters and setters
//    3. Meeting —> add person for meeting , set  startTime , set endTime
//4. MeetingRoomManager —> checkForAnyAvailableRoom
//    1. Will have (List of MeetingRoom)
//    2. BookRoomForMeeting()
//5. Client —> which use this lld

    public static void main(String[] args) {
        Person p1 = new Person("Harsh", "SDE", 1);
        Person p2 = new Person("Ria", "SSE", 2);
        Person p3 = new Person("Abhinav", "EM", 3);
        Meeting meeting = new Meeting(10, 11, new ArrayList<>(Arrays.asList(p1, p2, p3)));

        Map<String, ArrayList<Pair<Integer, Integer>>> cal1 = new HashMap<>();
        Map<String, ArrayList<Pair<Integer, Integer>>> cal2 = new HashMap<>();

        cal1.put("Monday", new ArrayList<>(Arrays.asList(new Pair<>(9, 11), new Pair<>(13, 15), new Pair<>(17, 18))));
        cal2.put("Monday", new ArrayList<>(Arrays.asList(new Pair<>(8, 9), new Pair<>(13, 15), new Pair<>(17, 18))));

        MeetingRoom m1 = new MeetingRoom(201, cal1);
        MeetingRoom m2=new MeetingRoom(202,cal2);

        MeetingRoomManager meetingRoomManager=new MeetingRoomManager(new ArrayList<>(Arrays.asList(m1,m2)));

        meetingRoomManager.isRoomAvailableAtTime(10,11,"Monday");
        meetingRoomManager.bookRoomWithRoomNo(10,11,"Monday",202);
        meetingRoomManager.isRoomAvailableAtTime(10,11,"Monday");
        meetingRoomManager.isRoomAvailableAtTime(10,11,"Tuesday");
        meetingRoomManager.bookRoomWithRoomNo(10,11,"Tuesday",201);
        meetingRoomManager.isRoomAvailableAtTime(10,11,"Tuesday");
    }
}
