package ss5_getter_setter_accsess_modifier.exercise.access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}



