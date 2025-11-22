package _27926.q4;

public final class ReservationRecord extends Feedback {

    public ReservationRecord(int id, String createdDate, String updatedDate,
                             String hotelName, String address,
                             String phoneNumber, String email,
                             String roomNumber, String roomType,
                             double pricePerNight,
                             String customerName, String customerEmail,
                             String contactNumber,
                             String bookingDate, String checkInDate, String checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments) {
        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments);
    }

    public double generateBill() {
        double total = getRoomCharge() + getServiceCharge();
        setTotalBill(total);
        return total;
    }
}
