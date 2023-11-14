package ss7_interface_abstract.exercise.resizeable;

public class Square extends Rectangle implements Resizable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "{Square: side = "
                + getSide()+
                ", area = " + super.getArea()+
                "}";
    }


}

