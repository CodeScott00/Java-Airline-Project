import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Mr Aaron Bean", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Mr Aaron Bean", passenger.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }
}
