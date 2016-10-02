/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Point2D {
    private double x;
    private double y;

    public Point2D() {
        this(0.0,0.0);
    }
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void translate(final double dx, final double dy){
        x +=dx;
        y +=dy;
    }
    public boolean isOrigin(){
        return (x==0 && y==0);
    }
    public double distance(final Point2D other){
        double dx = other.x -this.x;
        double dy = other.y -this.y;
        return Math.sqrt(dx * dx + dy * dy );
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
