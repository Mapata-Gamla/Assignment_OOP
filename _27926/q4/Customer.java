package _27926.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address,
                    String phoneNumber, String email,
                    String roomNumber, String roomType,
                    double pricePerNight,
                    String customerName, String customerEmail,
                    String contactNumber) {
        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight);

        if (customerName == null || customerName.isEmpty()) {
            throw new ReservationDataException("Customer name cannot be empty");
        }
        if (customerEmail == null || !customerEmail.matches("^.+@.+\\..+$")) {
            throw new ReservationDataException("Invalid customer email");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new ReservationDataException("Contact number must be 10 digits");
        }

        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
