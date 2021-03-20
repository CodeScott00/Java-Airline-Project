import java.util.ArrayList;

public class Flight {

    private String name;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private String flightNumber;
    private ArrayList<Passenger>passengersList;

    public Flight(String name, String destination, String departureAirport, String departureTime, String flightNumber) {
        this.name = name;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.flightNumber = flightNumber;
        this.passengersList = new ArrayList<Passenger>();
    }

    public String getName(){
        return name;
}
    public String getDestination(){
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public int getPassengersList(){
        return passengersList.size();
    }

    public int getNumberOfSeats() {
            return PlaneType.BOEING747.getCapacity();
    }

    public void addPassenger(Passenger passenger) {
        this.passengersList.add(passenger);
    }

//    public void addPassengerToPassengersList(Passenger passenger) {
//        if(this.passengersList <= PlaneType.BOEING747.getCapacity() ) {
//            this.passengersList.add(passenger);
//        }

    }

