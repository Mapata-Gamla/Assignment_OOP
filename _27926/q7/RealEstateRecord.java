package _27926.q7;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, String createdDate, String updatedDate,
                            String agencyName, String location, String phoneNumber,
                            String agentName, String agentEmail, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String contactNumber,
                            String buyerName, String buyerEmail,
                            String agreementDate, String terms,
                            double paymentAmount, String paymentDate,
                            double commissionRate, double commissionAmount) {
        super(id, createdDate, updatedDate,
                agencyName, location, phoneNumber,
                agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price,
                sellerName, contactNumber,
                buyerName, buyerEmail,
                agreementDate, terms,
                paymentAmount, paymentDate,
                commissionRate, commissionAmount);
    }

    public double calculateCommission() {
        double value = (getPrice() * getCommissionRate()) / 100.0;
        setCommissionAmount(value);
        return value;
    }
}
