package _27926.q4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address,
                   String phoneNumber, String email,
                   String roomNumber, String roomType,
                   double pricePerNight,
                   String customerName, String customerEmail,
                   String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) {
        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber);

        if (bookingDate == null || bookingDate.isEmpty()) {
            throw new ReservationDataException("Booking date cannot be empty");
        }
        if (checkInDate == null || checkInDate.isEmpty()) {
            throw new ReservationDataException("Check-in date cannot be empty");
        }
        if (checkOutDate == null || checkOutDate.isEmpty()) {
            throw new ReservationDataException("Check-out date cannot be empty");
        }

        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }
}
