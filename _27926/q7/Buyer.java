package _27926.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String email) {
        super(id, createdDate, updatedDate,
                agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber);

        if (buyerName == null || buyerName.isEmpty()) {
            throw new RealEstateDataException("Buyer name cannot be empty");
        }
        if (email == null || !email.matches("^.+@.+\\..+$")) {
            throw new RealEstateDataException("Invalid buyer email");
        }

        this.buyerName = buyerName;
        this.email = email;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getEmail() {
        return email;
    }
}
