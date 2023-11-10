package ss6_inheritance.exercise.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double Volume(){
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = " + super.getRadius() +
                ", color = " + super.getColor() +
                ", height = " + height +
                ", volume = " + Volume() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,"Blue",4);
        System.out.println(cylinder);
    }
}
