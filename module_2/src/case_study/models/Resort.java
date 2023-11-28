package case_study.models;

import java.util.Date;

public class Resort {
    private String idService;
    private String name;
    private Double area;
    private Double rentalCosts;
    private Integer numberOfPeople;
    private Date typeDate;

    public Resort(String idService, String name, Double area, Double rentalCosts, Integer numberOfPeople, Date typeDate) {
        this.idService = idService;
        this.name = name;
        this.area = area;
        this.rentalCosts = rentalCosts;
        this.numberOfPeople = numberOfPeople;
        this.typeDate = typeDate;
    }

    public Resort() {
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

    public Date getTypeDate() {
        return typeDate;
    }

    public void setTypeDate(Date typeDate) {
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
