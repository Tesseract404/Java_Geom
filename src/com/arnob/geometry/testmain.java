package com.arnob.geometry;

public class testmain {
    public static void main(String[] args) {
        Circlee c1= new Circlee();
        System.out.println(c1+ "> Area:"+ c1.getarea());
        Circlee c2 = new Circlee();
        System.out.println(">Area:"+ c2.getarea());

        Cylinder cy1 = new Cylinder();
        System.out.println(">Volume:"+cy1.getVolume());
        Cylinder cy2 = new Cylinder(4.0);
        System.out.println(cy2 + " ==> Volume: " + cy2.getVolume());
        Cylinder cy3 = new Cylinder(4.0, 2.0);
        System.out.println(cy3 + " ==> Volume: " + cy3.getVolume());
        Cylinder cy4 = new Cylinder(4.0, 2.0, "violet");
        System.out.println(cy4 + " ==> Volume: " + cy4.getVolume());
    }
}
