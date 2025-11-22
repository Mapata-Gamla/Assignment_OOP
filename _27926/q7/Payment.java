package _27926.q7;

public class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) {
        super(id, createdDate, updatedDate,
                agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail,
                agreementDate, terms);

        if (paymentAmount <= 0) {
            throw new RealEstateDataException("Payment amount must be > 0");
        }
        if (paymentDate == null || paymentDate.isEmpty()) {
            throw new RealEstateDataException("Payment date cannot be empty");
        }

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
}
