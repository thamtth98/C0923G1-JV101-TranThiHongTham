package ss7_interface_abstract.exercise.colorable;

import java.util.Arrays;

public class ShapeManagement {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Square(10);
        arr[1] = new Rectangle(5, 10);
        arr[2] = new Square(8);
        arr[3] = new Circle(4);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass() == Square.class) {
                Square square = (Square) arr[i];
                square.howToColor();
            } else if (arr[i].getClass() == Circle.class) {
                Circle circle = (Circle) arr[i];
                System.out.println("Area of Circle is: " + circle.getArea());
            } else {
                Rectangle rectangle = (Rectangle) arr[i];
                System.out.println("Area of Rectangle is: " + rectangle.getArea());
            }
        }
    }
}
