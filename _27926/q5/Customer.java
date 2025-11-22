package _27926.q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber,
                    double dailyRate,
                    String customerName, String licenseNumber,
                    String contactNumber) {
        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber,
                branchName, locationCode,
                vehicleType, registrationNumber, dailyRate);

        if (customerName == null || customerName.isEmpty()) {
            throw new RentalDataException("Customer name cannot be empty");
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RentalDataException("License number cannot be empty");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new RentalDataException("Contact number must be 10 digits");
        }

        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
