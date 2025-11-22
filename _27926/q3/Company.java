package _27926.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address,
                   String phoneNumber, String email) {
        super(id, createdDate, updatedDate);

        if (companyName == null || companyName.isEmpty()) {
            throw new PayrollDataException("Company name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new PayrollDataException("Address cannot be empty");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Phone must be 10 digits");
        }
        if (email == null || !email.matches("^.+@.+\\..+$")) {
            throw new PayrollDataException("Invalid email format");
        }

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
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
