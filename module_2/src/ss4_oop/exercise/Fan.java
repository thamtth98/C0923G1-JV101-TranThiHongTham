package ss4_oop.exercise;

public class Fan {
    private int speed;
    private double radius;
    private boolean turnOn;
    private String color;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    public Fan(int speed, double radius, boolean turnOn, String color) {
        this.speed = speed;
        this.radius = radius;
        this.turnOn = turnOn;
        this.color = color;
    }

    public Fan() {
        this.speed = 1;
        this.radius = 5;
        this.turnOn = false;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean turnOn() {
        return true;
    }

    @Override
    public String toString() {
        if (turnOn) {
            return "Fan: Fan is on" +
                    " {speed = " + speed +
                    ", radius = " + radius +
                    ", turnOn = " + turnOn +
                    ", color = " + color +
                    '}';
        } else {
            return "Fan: Fan is off" +
                    ", radius = " + radius +
                    ", color = " + color;
        }

    }

    public static void main(String[] args) {
        Fan firstFan = new Fan(3, 10, true, "yellow");
        Fan secondFan = new Fan(2, 5, false, "blue");
        System.out.println(firstFan);
        System.out.println(secondFan);
    }
}
