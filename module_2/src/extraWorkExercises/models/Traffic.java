package extraWorkExercises.models;

public class Traffic {
    private String controlPlate;
    private String manufacturerName;
    private String yearOfManufacturer;
    private String owner;

    public Traffic() {
    }

    public Traffic(String controlPlate, String manufacturerName, String yearOfManufacturer, String owner) {
        this.controlPlate = controlPlate;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacturer = yearOfManufacturer;
        this.owner = owner;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(String yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "controlPlate='" + controlPlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", yearOfManufacturer='" + yearOfManufacturer + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
