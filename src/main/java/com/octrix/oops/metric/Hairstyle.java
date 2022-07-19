package com.octrix.oops.metric;

public class Hairstyle {
    private String hairStyle;
    private String hairColor;
    private String hairLength;

    public Hairstyle() {
        this.hairColor = "Black";
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairLength() {
        return hairLength;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public static void main(String[] args) {
        Hairstyle hairstyle = new Hairstyle();
        hairstyle.setHairColor("brown");
        hairstyle.setHairStyle("crew cut");
        hairstyle.setHairLength("short");
        System.out.println("The Hairstyle is: "+hairstyle.getHairStyle()+"with the touch of "+hairstyle.getHairColor()+
                " color and is "+hairstyle.getHairLength()+" in length.");

    }
}