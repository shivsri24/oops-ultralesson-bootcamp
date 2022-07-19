package com.octrix.oops.metric;

public class AppleChart {
    private String appleTaste;
    private String appleSize;
    private String appleColor;
    private String appleType;

    public String getAppleTaste() {
        return appleTaste;
    }

    public void setAppleTaste(String appleTaste) {
        this.appleTaste = appleTaste;
    }

    public String getAppleSize() {
        return appleSize;
    }

    public void setAppleSize(String appleSize) {
        this.appleSize = appleSize;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }


    public static void main(String[] args) {
        AppleChart appleChart = new AppleChart(); // Default Constructor
        appleChart.setAppleColor("light Red");
        appleChart.setAppleSize("medium");
        appleChart.setAppleTaste("sweet");
        appleChart.setAppleType("gala");
        System.out.println("The apple is "+appleChart.getAppleColor()+" in color and is of "+appleChart.getAppleSize()+
                " size. It is "+appleChart.getAppleTaste()+" in taste and the apple we are talking about is called "+
                appleChart.getAppleType());

    }
}
