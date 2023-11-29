package case_study.models.facility;

public class Villa extends Facility {
    private String roomStandards;
    private Double areaPool;
    private Integer numberOfFloor;

    public Villa(String idService, String name, Double area, Double rentalCosts, Integer numberOfPeople, String typeDate, String roomStandards, Double areaPool, Integer numberOfFloor) {
        super(idService, name, area, rentalCosts, numberOfPeople, typeDate);
        this.roomStandards = roomStandards;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa(String roomStandards, Double areaPool, Integer numberOfFloor) {
        this.roomStandards = roomStandards;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandards='" + roomStandards + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloor=" + numberOfFloor +
                "} " + super.toString();
    }
}
