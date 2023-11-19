package extraWorkExercises.models;

public class Truck extends Traffic {
    private Double tonnage;

    public Truck() {
    }

    public Truck(Double tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(String controlPlate, String manufacturerName, String yearOfManufacturer, String owner, Double tonnage) {
        super(controlPlate, manufacturerName, yearOfManufacturer, owner);
        this.tonnage = tonnage;
    }


    public Double getTonnage() {
        return tonnage;
    }

    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "controlPlate='" + super.getControlPlate() + '\'' +
                ", manufacturerName='" + super.getManufacturerName() + '\'' +
                ", yearOfManufacturer='" + super.getYearOfManufacturer() + '\'' +
                ", owner='" + super.getOwner() + '\'' +
                ", tonnage=" + tonnage +
                '}';
    }
}
