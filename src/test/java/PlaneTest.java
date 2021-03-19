import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane("British Airways", PlaneType.BOEING747);
    }

    @Test
    public void hasName(){
        assertEquals("British Airways", plane.getName());
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeTypeHasCapacity(){
        assertEquals(366, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void planeTypeHasWeight(){
        assertEquals(183500, PlaneType.BOEING747.getWeight());
    }
}
