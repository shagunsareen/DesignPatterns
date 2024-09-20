package sareen.shagun.machineCoding.conferenceRooms;

public class Main {

    public static void main(String[] args) {
        ConferenceRoomManagement system = new ConferenceRoomManagement();
        system.addBuilding("flipkart1");
        system.addFloor("flipkart1", "firstFloor");
        system.addConfRoom("flipkart1", "firstFloor", "c1");

        system.bookRoom("1:5", "flipkart1", "firstfloor", "c1");
        system.bookRoom("1:5", "flipkart1", "firstfloor", "c2");

        system.cancelBooking("1:5", "flipkart1", "firstfloor", "c1");
        system.listBookings("flipkart1", "firstfloor");

        system.searchRoom("2:3", "flipkart1", "firstfloor");
    }
}
