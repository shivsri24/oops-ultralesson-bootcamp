package com.octrix.oops.objects;

public class Box {

    private double length;
    private double breadth;
    private double height;
    private double weight;

    public Box() {
        length=breadth=height=1.0;
    }

    public Box(double length,double breadth,double height, double weight) {
        length=length;
        breadth=breadth;
        height=height;
        weight=weight;
    }

    public void calculateBoxVolume() {
        System.out.println("Volume of the Box is: "+(length*breadth*height));
    }

    public void showBoxWeight() {
        System.out.println("Weight of the Box is : "+(weight));
    }
}
