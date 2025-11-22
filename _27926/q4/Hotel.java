package _27926.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address,
                 String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (hotelName == null || hotelName.isEmpty()) {
            throw new ReservationDataException("Hotel name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new ReservationDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new ReservationDataException("Phone must be 10 digits");
        }
        if (email == null || !email.matches("^.+@.+\\..+$")) {
            throw new ReservationDataException("Invalid email format");
        }

        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
