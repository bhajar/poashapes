/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Cone extends Shape3D {
    private double height;
    private double radius;
    public double volume(){
        return (Math.PI * Math.pow(this.radius,2.0) * (this.height / 3.0) );
    }
    public double surface(){
    return (Math.PI * this.radius * (this.height + this.radius));
    }

    @Override
    public Point3D getRefPoint() {
        return null;
    }
}
