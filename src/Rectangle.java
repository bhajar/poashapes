/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle() {
        this(0.0,0.0);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {

        return length;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
public double perimeter(){
    return (2.0*(this.length+this.width));
}
public double surface(){
    return (this.length*this.width);
}
}
