package sareen.shagun.machineCoding.conferenceRooms;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    String floorName;

    Map<String, ConferenceRoom> confRooms = new HashMap<>();

    public Floor(String floorName) {
        this.floorName = floorName;
    }

    public void addConfRoom(String confRoomId) {
        confRooms.putIfAbsent(confRoomId, new ConferenceRoom(confRoomId));
        System.out.println("Added conference room " + confRoomId + " to floor " + floorName);
    }

    public void bookRoom(String buildingName, String confRoomId, String slot) {
        if(!confRooms.containsKey(confRoomId)){
            System.out.println("ConfRoom " + confRoomId + " does not exist on the floor " + floorName);
        }else{
            confRooms.get(confRoomId).bookSlot(buildingName, slot, floorName);
        }
    }

    public void cancelBooking(String buildingName, String confRoomId, String slot) {
        if(!confRooms.containsKey(confRoomId)){
            System.out.println("ConfRoom " + confRoomId + " does not exist on the floor " + floorName);
        }else{
            confRooms.get(confRoomId).cancelSlot(buildingName, slot, floorName);
        }
    }

    public void listBookings() {
        for(ConferenceRoom conferenceRoom : confRooms.values()){
             conferenceRoom.listBookings();
        }
    }

    public void searchRoom(String slot) {
        for(ConferenceRoom conferenceRoom : confRooms.values()){
            if(conferenceRoom.isSlotAvailable(slot)){
                System.out.println("Slot is available : "+slot+ "  in conference room : "+ conferenceRoom);
            }
        }

        System.out.println("Slot : "+slot+ "is not available");
    }
}
