/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Cuboid extends Shape3D {
    private double length;
    private double width;
    private double height;
    public double volume(){
    return (this.length * this.width * this.height);
    }
    public double surface(){
    return (2*(this.height+ this.width + this.length ));
    }

    @Override
    public Point3D getRefPoint() {
        return null;
    }
}
