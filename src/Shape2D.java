/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public abstract class Shape2D extends Shape implements Translatable2D{
    public  Point2D refPoint;
    public abstract double perimeter();

    public Point2D getRefPoint() {
        return refPoint;
    }
}
