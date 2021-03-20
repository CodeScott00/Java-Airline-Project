import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Passenger passenger1;
    Plane plane;


    @Before
    public void before(){
        flight = new Flight("flight1", "Barcelona", "Glasgow", "1400", "666");
        passenger = new Passenger("Mr Wilbur White", 1);
        passenger1 = new Passenger("Mr Orville White", 1);
        plane = new Plane("British Airways", PlaneType.BOEING747);
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
        assertEquals("666", flight.getFlightNumber());
    }

    @Test
    public void hasPassengerListEmpty(){
        assertEquals(0, flight.getPassengersList());
    }

    @Test
    public void returnNumberOfSeatsLeft(){
        assertEquals(366, flight.getNumberOfSeats());

    }

    @Test
    public void canAddPassengersToPassengerList(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger1);
        assertEquals(2, flight.getPassengersList());
    }

    @Test
    public void canRemoveCapacityFrom747(){
        if(flight.getPassengersList() <= PlaneType.BOEING707.getCapacity()){
            PlaneType.BOEING747.getCapacity() -= flight.getPassengersList();
        }
    }

//    @Test
//    public void checkNumberOfSeatsRemainingMinus2(){
//        flight.addPassengerToPassengersList(passenger);
//        flight.addPassengerToPassengersList(passenger1);
////        PlaneType.BOEING747.values(CAPACITY) - flight.passengerList
//        assertEquals(364, flight.getNumberOfSeats());
//    }
//
//    @Test
//    public void canAddPassengerToPassengersList(){
//        flight.addPassengerToPassengersList(passenger);
//        assertEquals(1,flight.getPassengersList());

    }




