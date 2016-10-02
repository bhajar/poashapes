import com.apple.eawt.event.MagnificationEvent;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hajarboulhdir on 03/10/2016.
 */
public class SphereTest {
   Sphere s;
    @BeforeMethod
    public void setUp() throws Exception {

   s=new Sphere(5.0);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testVolume() throws Exception {
        double volume=(4.0/3.0)* Math.PI*125.0;
        assertEquals(s.volume(),volume);
    }


}