package objects;

public class Line {
    private double length;

    public Line(double length){
        this.length = length;
    }

    public void getLength(){
        System.out.println("Length of the line is: "+ length);
    }

    public void draw(double lengthToAdd){
        length += lengthToAdd;
    }

}