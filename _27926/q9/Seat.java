package _27926.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) {
        super(id, createdDate, updatedDate,
                airlineName, address, contactEmail,
                flightNumber, destination, departureTime,
                passengerName, passportNumber, nationality);

        if (seatNumber == null || seatNumber.isEmpty()) {
            throw new AirlineDataException("Seat number cannot be empty");
        }
        if (seatType == null ||
                !(seatType.equalsIgnoreCase("Economy")
                        || seatType.equalsIgnoreCase("Business"))) {
            throw new AirlineDataException("Seat type must be Economy/Business");
        }

        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }
}
