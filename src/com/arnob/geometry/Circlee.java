package com.arnob.geometry;

public class Circlee {
    public double radious =  1.0;
    String color ="red";

    public Circlee(){
        this.radious = 1.0;
        this.color = "red";
    }

    public Circlee(double radious) {
        this.radious = radious;
        this.color = "red";
    }

    public Circlee(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circlee{" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                '}';
    }
    public double getarea() {
         double area=(2*radious*(Math.PI));
        return area;
    }
}
