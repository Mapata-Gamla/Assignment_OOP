package _27926.q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, String createdDate, String updatedDate,
                String hotelName, String address,
                String phoneNumber, String email,
                String roomNumber, String roomType,
                double pricePerNight,
                String customerName, String customerEmail,
                String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) {
        super(id, createdDate, updatedDate,
                hotelName, address, phoneNumber, email,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, contactNumber,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate);

        if (roomCharge <= 0 || serviceCharge <= 0) {
            throw new ReservationDataException("Room and service charges must be > 0");
        }

        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = 0;
    }

    public double getRoomCharge() {
        return roomCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        if (totalBill <= 0) {
            throw new ReservationDataException("Total bill must be > 0");
        }
        this.totalBill = totalBill;
    }
}
