import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;


    @Before
    public void before(){
        flight = new Flight("flight1", "Barcelona", "Glasgow", "1400", 666);
    }

    @Test
    public void hasName(){
        assertEquals("flight1", flight.getName());
    }

    @Test
    public void hasDestination() {
        assertEquals("Barcelona", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Glasgow", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("1400", flight.getDepartureTime());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(666, flight.getFlightNumber());
    }

    @Test
    public void hasPassengerListEmpty(){
        assertEquals(0, flight.getPassengersList());
    }
}
