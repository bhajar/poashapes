/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Sphere extends Shape3D{
    private double radius;
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
}
