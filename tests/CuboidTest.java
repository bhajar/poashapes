import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class CuboidTest {
    Cuboid c;
    @BeforeMethod
    public void setUp() throws Exception {
    c=new Cuboid(2.0,3.0,4.0);
    }

    @Test
    public void testVolume() throws Exception {
    double volume=2.0*3.0*4.0;
        assertEquals(c.volume(),volume);
    }

    @Test
    public void testSurface() throws Exception {
    double surface=2.0*(2.0+3.0+4.0);
        assertEquals(c.surface(),surface);
    }

}