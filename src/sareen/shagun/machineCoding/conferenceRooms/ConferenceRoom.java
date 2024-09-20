package sareen.shagun.machineCoding.conferenceRooms;

import java.util.*;

public class ConferenceRoom {
    String confRoomId;
    List<Booking> bookings = new ArrayList<>();

    public ConferenceRoom(String confRoomId) {
        this.confRoomId = confRoomId;
    }

    public void bookSlot(String buildingName, String timeSlot, String floorName) {
        for (Booking booking : bookings) {
            if (booking.getTimeSlot().equals(timeSlot)) {
                System.out.println("Conference room : "+ confRoomId + " is already booked at same time slot : "+ timeSlot);
            }
        }
        // If not booked, add the booking
        bookings.add(new Booking(buildingName, floorName, confRoomId, timeSlot));
        System.out.println("Booking confirmed for : "+ timeSlot + " for conference room : "+ confRoomId);
    }

    public void cancelSlot(String buildingName, String timeSlot, String floorName) {

        Iterator<Booking> iterator = bookings.iterator();
        while(iterator.hasNext()){
            Booking booking = iterator.next();

            // Check if this booking matches the slot, building, floor, and room ID
            if (booking.getTimeSlot().equals(timeSlot) &&
                    booking.getBuildingName().equalsIgnoreCase(buildingName) &&
                    booking.getFloorName().equalsIgnoreCase(floorName) &&
                    booking.getRoomId().equalsIgnoreCase(confRoomId)) {

                // If found, remove the booking and return true
                iterator.remove();
                System.out.println("Booking cancelled for : "+ timeSlot + " for conference room : "+ confRoomId);
            }
        }
        System.out.println("Booking not found for : "+ timeSlot + " for conference room : "+ confRoomId);
    }

    public void listBookings() {
        for(Booking booking : bookings){
            System.out.println(booking);
        }
    }

    public boolean isSlotAvailable(String slot) {
        for(Booking booking : bookings){
            if(booking.getTimeSlot().equalsIgnoreCase(slot)){
                return true;
            }
        }
        return false;
    }
}
