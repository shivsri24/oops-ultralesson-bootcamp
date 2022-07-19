package objects;

public class Point {

    private final double x;
    private final double y;
    private final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void locate(){
        System.out.println("Location on the 2D graph is: (" + x + "," + y + ")");
        System.out.println("Location on the 3D graph is: (" + x + "," + y + "," + z +")");

    }
}