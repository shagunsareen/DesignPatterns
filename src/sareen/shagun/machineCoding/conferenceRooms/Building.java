package sareen.shagun.machineCoding.conferenceRooms;

import java.util.HashMap;
import java.util.Map;

public class Building {
    String buildingName;

    Map<String, Floor> floors = new HashMap<>();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    public void addFloor(String floorName){
        floors.putIfAbsent(floorName.toLowerCase(), new Floor(floorName));
        System.out.println("Added floor " + floorName + " to building " + buildingName);
    }

    public void addConfRoom(String floorName, String confRoomId) {
        if(!floors.containsKey(floorName)){
            System.out.println("Floor " + floorName + " does not exist in building " + buildingName);
        }else{
            floors.get(floorName).addConfRoom(confRoomId);
        }
    }

    public void bookRoom(String floorName, String confRoomId, String slot) {
        if(!floors.containsKey(floorName)){
            System.out.println("Floor " + floorName + " does not exist in building " + buildingName);
        }else{
            floors.get(floorName).bookRoom(buildingName, confRoomId, slot);
        }
    }

    public void cancelBooking(String floorName, String confRoomId, String slot) {
        if(!floors.containsKey(floorName)){
            System.out.println("Floor " + floorName + " does not exist in building " + buildingName);
        }else{
            floors.get(floorName).cancelBooking(buildingName, confRoomId, slot);
        }
    }

    public void listBookings(String floorName) {
        if(!floors.containsKey(floorName)){
            System.out.println("Floor " + floorName + " does not exist in building " + buildingName);
        }else{
            floors.get(floorName).listBookings();
        }
    }

    public void searchRoom(String floorName, String slot) {
        if(!floors.containsKey(floorName)){
            System.out.println("Floor " + floorName + " does not exist in building " + buildingName);
        }else{
            floors.get(floorName).searchRoom(slot);
        }
    }
}
