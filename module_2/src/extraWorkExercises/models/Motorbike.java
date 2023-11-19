package extraWorkExercises.models;

public class Motorbike extends Traffic {
    private Double capacity;

    public Motorbike() {
    }

    public Motorbike(Double capacity) {
        this.capacity = capacity;
    }

    public Motorbike(String controlPlate, String manufacturerName, String yearOfManufacturer, String owner, Double capacity) {
        super(controlPlate,manufacturerName,yearOfManufacturer,owner);
        this.capacity = capacity;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike {" +
                "controlPlate='" + super.getControlPlate() + '\'' +
                ", manufacturerName='" + super.getManufacturerName() + '\'' +
                ", yearOfManufacturer='" + super.getYearOfManufacturer() + '\'' +
                ", owner='" + super.getOwner() + '\'' +
                ", capacity='" + capacity + '\'' +
                "} ";
    }
}
