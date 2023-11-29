package case_study.models.facility;

public class Room extends Facility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room() {
    }

    public Room(String idService, String name, Double area, Double rentalCosts, Integer numberOfPeople, String typeDate, String freeService) {
        super(idService, name, area, rentalCosts, numberOfPeople, typeDate);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
