import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class RectangleTest {
    Rectangle r;
    @BeforeMethod
    public void setUp() throws Exception {
    r=new Rectangle(3.0,4.0);
    }

    @Test
    public void testPerimeter() throws Exception {
    double perimeter=2.0*(3.0+4.0);
        assertEquals(r.perimeter(),perimeter);
    }

    @Test
    public void testSurface() throws Exception {
    double surface=3.0*4.0;
        assertEquals(r.surface(),surface);
    }

}