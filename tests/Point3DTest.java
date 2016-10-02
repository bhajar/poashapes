import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 02/10/2016.
 */
public class Point3DTest {
    Point3D p;
    @BeforeMethod
    public void setUp() throws Exception {
    p=new Point3D(0.0,0.0,0.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testTranslate() throws Exception {
        p.translate(2, 3, 4);
        assertEquals(p.getX(), 2.0);
        assertEquals(p.getY(), 3.0);
        assertEquals(p.getZ(), 4.0);
    }

    @Test
    public void testIsOrigin() throws Exception {
        assertEquals(p.isOrigin(),true);
    }

    @Test
    public void testDistance() throws Exception {
        p=new Point3D(2.0,2.0,3.0);
        assertEquals(p.distance(p),Math.sqrt(8.0));
    }



}