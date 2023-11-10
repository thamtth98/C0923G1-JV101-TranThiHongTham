package ss6_inheritance.exercise.point2D_point3D;


public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.getX(), this.getY()};
    }


    @Override
    public String toString() {
        return "Point2D{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D);
    }
}
