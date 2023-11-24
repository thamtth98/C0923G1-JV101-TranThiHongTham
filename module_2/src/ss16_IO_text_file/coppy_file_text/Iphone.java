package ss16_IO_text_file.coppy_file_text;

public class Iphone {
    private int id;
    private String name;
    private double price;

    public Iphone(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Iphone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return "Iphone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
