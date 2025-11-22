package _27926.q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, String createdDate, String updatedDate,
                String hotelName, String address,
                String phoneNumber, String email,
                String roomNumber, String roomType,
                double pricePerNight) {
        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email);

        if (roomNumber == null || roomNumber.isEmpty()) {
            throw new ReservationDataException("Room number cannot be empty");
        }
        if (roomType == null || roomType.isEmpty()) {
            throw new ReservationDataException("Room type cannot be empty");
        }
        if (pricePerNight <= 0) {
            throw new ReservationDataException("Price per night must be > 0");
        }

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }
}
