package _27926.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber,
                   double dailyRate) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber,
                branchName, locationCode);

        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new RentalDataException("Vehicle type cannot be empty");
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            throw new RentalDataException("Registration number cannot be empty");
        }
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be > 0");
        }

        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}
