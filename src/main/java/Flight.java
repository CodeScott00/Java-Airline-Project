import java.util.ArrayList;

public class Flight {

    private String name;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int flightNumber;
    private ArrayList<Passenger>passengersList;

    public Flight(String name, String destination, String departureAirport, String departureTime, int flightNumber) {
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

    public int getFlightNumber(){
        return flightNumber;
    }

    public int getPassengersList(){
        return passengersList.size();
    }
}
