package ss7_interface_abstract.exercise.resizeable;

public class Circle extends Shape implements Resizable {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "{Circle: " +
                "radius = " + radius +
                ", color = " + color +
                ", area = " + getArea() +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = radius * (1 + percent / 100);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(10, "blue");
        System.out.println(circle);
        circle.resize(2);
        System.out.println(circle);

    }
}


