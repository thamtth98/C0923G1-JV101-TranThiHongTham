package case_study.models.facility;

public class Facility {
    private String idService;
    private String name;
    private Double area;
    private Double rentalCosts;
    private Integer numberOfPeople;
    private String typeDate;

    public Facility(String idService, String name, Double area, Double rentalCosts, Integer numberOfPeople, String typeDate) {
        this.idService = idService;
        this.name = name;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.typeDate = typeDate;
    }

    public Facility() {
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(Double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeDate() {
        return typeDate;
    }

    public void setTypeDate(String typeDate) {
        this.typeDate = typeDate;
    }

    @Override
    public String toString() {
        return "Resort{" +
                "id='" + idService + '\'' +
                ", name='" + name + '\'' +
                ", are=" + area +
                ", rentalCosts=" + rentalCosts +
                ", numberOfPeople=" + numberOfPeople +
                ", typeDate=" + typeDate +
                '}';
    }
}
