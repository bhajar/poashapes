import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class ConeTest {
    Cone c;
    @BeforeMethod
    public void setUp() throws Exception {
    c=new Cone(2.0,3.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }


    @Test
    public void testVolume() throws Exception {
        double volume=Math.PI*Math.pow(3.0,2.0) * (2.0 / 3.0);
        assertEquals(c.volume(),volume);

    }

    @Test
    public void testSurface() throws Exception {
    double surface=Math.PI * 3.0 * (2.0 + 3.0);
        assertEquals(c.surface(),surface);
    }

}