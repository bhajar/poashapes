import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class SquareTest {
    Square s;
    @BeforeMethod
    public void setUp() throws Exception {
    s=new Square(4.0,4.0);
    }

    @Test
    public void testPerimeter() throws Exception {
    double perimeter=2.0*(4.0+4.0);
        assertEquals(s.perimeter(),perimeter);
    }

    @Test
    public void testSurface() throws Exception {
    double surface=4.0*4.0;
        assertEquals(s.surface(),surface);
    }

}