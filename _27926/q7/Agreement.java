package _27926.q7;

public class Agreement extends Buyer {
    private String agreementDate;
    private String terms;

    public Agreement(int id, String createdDate, String updatedDate,
                     String agencyName, String location, String phoneNumber,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String contactNumber,
                     String buyerName, String buyerEmail,
                     String agreementDate, String terms) {
        super(id, createdDate, updatedDate,
                agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail);

        if (agreementDate == null || agreementDate.isEmpty()) {
            throw new RealEstateDataException("Agreement date cannot be empty");
        }
        if (terms == null || terms.isEmpty()) {
            throw new RealEstateDataException("Terms cannot be empty");
        }

        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    public String getAgreementDate() {
        return agreementDate;
    }

    public String getTerms() {
        return terms;
    }
}
