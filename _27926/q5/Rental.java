package _27926.q5;

public class Rental extends Customer {
    private String rentalDate;
    private String returnDate;
    private int rentalDays;

    public Rental(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber,
                  double dailyRate,
                  String customerName, String licenseNumber,
                  String contactNumber,
                  String rentalDate, String returnDate, int rentalDays) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate,
                customerName, licenseNumber, contactNumber);

        if (rentalDate == null || rentalDate.isEmpty()) {
            throw new RentalDataException("Rental date cannot be empty");
        }
        if (returnDate == null || returnDate.isEmpty()) {
            throw new RentalDataException("Return date cannot be empty");
        }
        if (rentalDays <= 0) {
            throw new RentalDataException("Rental days must be > 0");
        }

        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public String getRentalDate() {
        return rentalDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}
