package com.octrix.oops.objects;

import java.util.*;

public class Pencil {
    private int sharpnessLevel;
    private String pencilColor;

    public Pencil(){
        sharpnessLevel = 5;
        pencilColor = "orange";
    }

    public Pencil(int sharp, String color) {
        sharpnessLevel = sharp;
        pencilColor = color;
    }

    public int sharpen () {
        sharpnessLevel = 5;
        return sharpnessLevel;
    }

    public int getSharpness() {
        return sharpnessLevel;
    }

    public String getColor() {
        return pencilColor;
    }

    public String write() {
        if(sharpnessLevel > 0) {
            sharpnessLevel--;
            return "Voila! You have written a few lines.";
        }
        else {
            return "Your pencil is too dull to write. Sharpen it and try writing again!";
        }
    }

    public String toString(){
        return ("You have a sharpness of " + sharpnessLevel + ". It is " + pencilColor + "in color.");
    }

}