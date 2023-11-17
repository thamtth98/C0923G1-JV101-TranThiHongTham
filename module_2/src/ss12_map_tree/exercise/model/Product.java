package ss12_map_tree.exercise.model;

public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer quality;

    public Product() {
    }

    public Product(Integer id, String name, Integer price, Integer quality) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quality = quality;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quality=" + quality +
                '}';
    }
}

