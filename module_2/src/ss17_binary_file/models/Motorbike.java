package ss17_binary_file.models;

import java.io.Serializable;

public class Motorbike implements Serializable {
    private String id;
    private String name;
    private double price;
    private String manufacture;
    private String describe;

    public Motorbike(String id, String name, double price, String manufacture, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacture = manufacture;
        this.describe = describe;
    }

    public Motorbike() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }


}
