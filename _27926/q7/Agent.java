package _27926.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String email, String licenseNumber) {
        super(id, createdDate, updatedDate,
                agencyName, location, phoneNumber);

        if (agentName == null || agentName.isEmpty()) {
            throw new RealEstateDataException("Agent name cannot be empty");
        }
        if (email == null || !email.matches("^.+@.+\\..+$")) {
            throw new RealEstateDataException("Invalid email format");
        }
        if (licenseNumber == null || licenseNumber.isEmpty()) {
            throw new RealEstateDataException("License number cannot be empty");
        }

        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getEmail() {
        return email;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
}
