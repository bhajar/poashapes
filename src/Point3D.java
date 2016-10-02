/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Point3D extends Point2D {
    private double x;
    private double y;
    private double z;

    public Point3D() {
        this(0.0,0.0,0.0);
    }
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void translate(double dx,double dy,double dz){
        x +=dx;
        y +=dy;
        z+=dz;
    }
    public boolean isOrigin(){
        return (x==0 && y==0 && z==0);
    }
    public double distance(final Point3D other){
        double dx = other.x -this.x;
        double dy = other.y -this.y;
        double dz = other.z -this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
