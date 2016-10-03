/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class Square extends Rectangle {
    private double length;
    private double width;

    public Square() {
        this(0.0,0.0);
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {

        return length;
    }

    public Square(double length, double width) {
        if(length==width){
        this.length = length;
        this.width = width;}
    }
    public double perimeter(){
        return (2.0*(this.length+this.width));
    }
    public double surface(){
        return (this.length*this.width);
    }
}
