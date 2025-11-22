package _27926.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) {
        super(id, createdDate, updatedDate,
                airlineName, address, contactEmail,
                flightNumber, destination, departureTime);

        if (passengerName == null || passengerName.isEmpty()) {
            throw new AirlineDataException("Passenger name cannot be empty");
        }
        if (passportNumber == null || passportNumber.isEmpty()) {
            throw new AirlineDataException("Passport number cannot be empty");
        }
        if (nationality == null || nationality.isEmpty()) {
            throw new AirlineDataException("Nationality cannot be empty");
        }

        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getNationality() {
        return nationality;
    }
}
