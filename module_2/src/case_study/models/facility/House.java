package case_study.models.facility;

public class House extends Facility {
    private String roomHouse;
    private Integer numberOfFloorHouse;

    public House(String idService, String name, Double area, Double rentalCosts, Integer numberOfPeople, String typeDate, String roomHouse, Integer numberOfFloorHouse) {
        super(idService, name, area, rentalCosts, numberOfPeople, typeDate);
        this.roomHouse = roomHouse;
        this.numberOfFloorHouse = numberOfFloorHouse;
    }

    public House(String roomHouse, Integer numberOfFloorHouse) {
        this.roomHouse = roomHouse;
        this.numberOfFloorHouse = numberOfFloorHouse;
    }

    public House() {
    }

    public String getRoomHouse() {
        return roomHouse;
    }

    public void setRoomHouse(String roomHouse) {
        this.roomHouse = roomHouse;
    }

    public Integer getNumberOfFloorHouse() {
        return numberOfFloorHouse;
    }

    public void setNumberOfFloorHouse(Integer numberOfFloorHouse) {
        this.numberOfFloorHouse = numberOfFloorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomHouse='" + roomHouse + '\'' +
                ", numberOfFloorHouse=" + numberOfFloorHouse +
                "} " + super.toString();
    }
}
