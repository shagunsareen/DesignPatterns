package sareen.shagun.machineCoding.conferenceRooms;

public class Booking {
    private String buildingName;
    private String floorName;
    private String roomId;
    private String timeSlot;

    public Booking(String buildingName, String floorName, String roomId, String timeSlot) {
        this.buildingName = buildingName;
        this.floorName = floorName;
        this.roomId = roomId;
        this.timeSlot = timeSlot;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return timeSlot + " " + floorName + " " + buildingName + " " + roomId;
    }
}
