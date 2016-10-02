/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Sphere extends Shape3D{
    private double radius;

    public Sphere() {
        this(0.0);
    }

    public Sphere(double radius) {
        this.radius = radius;
    }


    public double volume(){
        return( 4.0 / 3.0 ) * Math.PI * Math.pow( this.radius, 3.0 );
    }

    @Override
    public double surface() {
        return 0;
    }

    @Override
    public Point3D getRefPoint() {
        return null;
    }

    public double getRadius() {
        return radius;
    }
}
