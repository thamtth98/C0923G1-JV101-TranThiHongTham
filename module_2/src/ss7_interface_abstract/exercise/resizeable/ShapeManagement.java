package ss7_interface_abstract.exercise.resizeable;

import java.util.Arrays;

public class ShapeManagement {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(10, "blue");
        arr[1] = new Rectangle(5, 10);
        arr[2] = new Square(10);
        System.out.println(Arrays.toString(arr));
        double temp = 100 * (Math.random()) + 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass() == Circle.class) {
                Circle circle = (Circle) arr[i];
                circle.resize(temp);
            }
            if (arr[i].getClass() == Rectangle.class) {
                Rectangle rectangle = (Rectangle) arr[i];
                rectangle.resize(temp);
            }
            if (arr[i].getClass() == Square.class) {
                Square square = (Square) arr[i];
                square.resize(temp);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
