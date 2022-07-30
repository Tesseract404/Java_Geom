package com.arnob.geometry;

public class Cylinder extends Circlee {
    private double height= 1.0;

    public Cylinder( ) {
        this.height = 2.0;
    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radious, double height) {
        super(radious);
        this.height = height;
    }

    public Cylinder(double radious, double height, String color) {
        super(radious, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radious=" + radious +
                ", color='" + color + '\'' +
                '}';
    }
    public double getVolume() {
        double Vol=(2*(Math.PI)*radious*radious*height);
        return Vol;
    }
}
