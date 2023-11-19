package extraWorkExercises.models;

public class Car extends Traffic{
    private Integer numberSeats;
    private String carType;

    public Car(Integer numberSeats, String carType) {
        this.numberSeats = numberSeats;
        this.carType = carType;
    }

    public Car(String controlPlate, String manufacturerName, String yearOfManufacturer, String owner, Integer numberSeats, String carType) {
        super(controlPlate, manufacturerName, yearOfManufacturer, owner);
        this.numberSeats = numberSeats;
        this.carType = carType;
    }

    public Integer getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(Integer numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car {" +
                "controlPlate='" + super.getControlPlate() + '\'' +
                ", manufacturerName='" + super.getManufacturerName() + '\'' +
                ", yearOfManufacturer='" + super.getYearOfManufacturer()+ '\'' +
                ", owner='" + super.getOwner() + '\'' +
                ", numberSeats=" + numberSeats +
                ", carType='" + carType + '\'' +
                "} ";
    }
}
