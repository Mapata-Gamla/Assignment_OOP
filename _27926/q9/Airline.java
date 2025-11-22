package _27926.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);

        if (airlineName == null || airlineName.isEmpty()) {
            throw new AirlineDataException("Airline name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new AirlineDataException("Address cannot be empty");
        }
        if (contactEmail == null || !contactEmail.matches("^.+@.+\\..+$")) {
            throw new AirlineDataException("Invalid contact email");
        }

        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
