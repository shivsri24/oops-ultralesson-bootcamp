package com.octrix.oops.objects;

public class RectangleDimensions {
    private static int length = 6;
    private static int breadth = 14;

    public RectangleDimensions(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void increaseDimension(int lengthToAdd, int breadthToAdd){
        length += lengthToAdd;
        breadth += breadthToAdd;
        System.out.println("The new dimensions of the rectangle are: Length=> "+length+" Breadth=> "+breadth);
    }

}