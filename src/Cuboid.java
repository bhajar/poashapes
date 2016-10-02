/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Cuboid extends Shape3D {
    public Cuboid() {
    this(0.0,0.0,0.0);
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {

        return width;
    }

    public double getLength() {

        return length;
    }

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
