package objects;

public class GeometricShapes {
    private String shapeType;
    private int shapeSides;
    private double shapeArea;
    private double shapePerimeter;
    private boolean isShapeGeometric;

    public GeometricShapes(String shapeType, int shapeSides, double shapeArea, double shapePerimeter, boolean isShapeGeometric){
        this.shapeType = shapeType;
        this.shapeSides = shapeSides;
        this.shapeArea = shapeArea;
        this.shapePerimeter = shapePerimeter;
        this.isShapeGeometric = isShapeGeometric;
    }

    public void showShapeDetails(){
        if(isShapeGeometric){
            System.out.println("The Type of the shape is: " + shapeType);
            System.out.println("Total area of the shape is: " + shapeArea);
            System.out.println("Total perimeter of the shape is: " + shapePerimeter);
            System.out.println("Number of sides of the shape is: " + shapeSides);
        }
        else{
            System.out.println("The input shape isn't Geometric Shape, please retry.");
        }

    }
}
