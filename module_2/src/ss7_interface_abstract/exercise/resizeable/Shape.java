package ss7_interface_abstract.exercise.resizeable;

public abstract class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, "blue");
        System.out.println(circle);
        circle.resize(2);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle);
        rectangle.resize(2);
        System.out.println(rectangle);

    }
}

