package ss6_inheritance.exercise.point2D_point3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x = " + super.getX() +
                ", y = " + super.getY() +
                ", z = " + z +
                '}';
    }

    public float[] getXYZ() {
        return new float[]{super.getX(), super.getY(), this.getZ()};
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 3, 4);
        System.out.println(point3D);
        Point2D point2D = new Point2D(4, 2);
        System.out.println(point2D);
    }
}
