package com.BinhAn;

public class classFan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST  = 3;
    private static final int RADIUS = 238;
    private int speed=SLOW;
    private boolean on;
    private double radius;
    private String color;
    public classFan(){
    }


    public classFan(int speed, boolean on, double radius,String color){
        this.speed=speed;
        this.on=on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    @Override
    public String toString() {
        if (this.on) {
            return "classFan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan is off{" +
                    "radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }
    }
}
