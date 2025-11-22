package _27926.q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(int id, String createdDate, String updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, String departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) {
        super(id, createdDate, updatedDate,
                airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality,
                seatNumber, seatType);

        if (ticketNumber == null || ticketNumber.isEmpty()) {
            throw new AirlineDataException("Ticket number cannot be empty");
        }
        if (price <= 0) {
            throw new AirlineDataException("Price must be > 0");
        }

        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }
}
