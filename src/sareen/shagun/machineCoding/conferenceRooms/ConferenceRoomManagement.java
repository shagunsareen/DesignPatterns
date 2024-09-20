package sareen.shagun.machineCoding.conferenceRooms;

import java.util.HashMap;
import java.util.Map;

public class ConferenceRoomManagement {
    Map<String, Building> buildings = new HashMap<>();

    public void addBuilding(String buildingName){
        buildings.put(buildingName, new Building(buildingName));
        System.out.println("Added building " + buildingName + " into the system.");
    }


    public void addFloor(String buildingName, String floorName) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).addFloor(floorName);
        }
    }

    public void addConfRoom(String buildingName, String floorName, String confRoomId) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).addConfRoom(floorName, confRoomId);
        }
    }

    public void bookRoom(String slot, String buildingName, String floorName, String confRoomId) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).bookRoom(floorName, confRoomId, slot);
        }
    }

    public void cancelBooking(String slot, String buildingName, String floorName, String confRoomId) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).cancelBooking(floorName, confRoomId, slot);
        }
    }

    public void listBookings(String buildingName, String floorName) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).listBookings(floorName);
        }
    }

    public void searchRoom(String slot, String buildingName, String floorName) {
        if(!buildings.containsKey(buildingName)){
            System.out.println("Building " + buildingName + " does not exist.");
        }else{
            buildings.get(buildingName).searchRoom(floorName, slot);
        }
    }
}
