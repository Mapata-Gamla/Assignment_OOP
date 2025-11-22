package _27926.q7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter entity ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter created date: ");
            String createdDate = sc.nextLine();

            System.out.print("Enter updated date: ");
            String updatedDate = sc.nextLine();

            System.out.print("Enter agency name: ");
            String agencyName = sc.nextLine();

            System.out.print("Enter agency location: ");
            String location = sc.nextLine();

            System.out.print("Enter agency phone (10 digits): ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter agent name: ");
            String agentName = sc.nextLine();

            System.out.print("Enter agent email: ");
            String agentEmail = sc.nextLine();

            System.out.print("Enter agent license number: ");
            String licenseNumber = sc.nextLine();

            System.out.print("Enter property code: ");
            String propertyCode = sc.nextLine();

            System.out.print("Enter property type: ");
            String propertyType = sc.nextLine();

            System.out.print("Enter property price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter seller name: ");
            String sellerName = sc.nextLine();

            System.out.print("Enter seller contact number: ");
            String sellerContact = sc.nextLine();

            System.out.print("Enter buyer name: ");
            String buyerName = sc.nextLine();

            System.out.print("Enter buyer email: ");
            String buyerEmail = sc.nextLine();

            System.out.print("Enter agreement date: ");
            String agreementDate = sc.nextLine();

            System.out.print("Enter agreement terms: ");
            String terms = sc.nextLine();

            System.out.print("Enter payment amount: ");
            double paymentAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter payment date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter commission rate: ");
            double commissionRate = sc.nextDouble();
            sc.nextLine();

            double initialCommissionAmount = 0.0;

            RealEstateRecord record = new RealEstateRecord(
                    id, createdDate, updatedDate,
                    agencyName, location, phoneNumber,
                    agentName, agentEmail, licenseNumber,
                    propertyCode, propertyType, price,
                    sellerName, sellerContact,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate, initialCommissionAmount
            );

            double commission = record.calculateCommission();

            System.out.println("\n===== REAL ESTATE RECORD (ID: 27884) =====");
            System.out.println("Agency: " + record.getAgencyName()
                    + " | Location: " + record.getLocation()
                    + " | Phone: " + record.getPhoneNumber());
            System.out.println("Agent: " + record.getAgentName()
                    + " | Email: " + record.getEmail()
                    + " | License: " + record.getLicenseNumber());
            System.out.println("Property: " + record.getPropertyCode()
                    + " | Type: " + record.getPropertyType()
                    + " | Price: " + record.getPrice());
            System.out.println("Seller: " + record.getSellerName()
                    + " | Contact: " + record.getContactNumber());
            System.out.println("Buyer: " + record.getBuyerName()
                    + " | Email: " + record.getEmail());
            System.out.println("Agreement: " + record.getAgreementDate()
                    + " | Terms: " + record.getTerms());
            System.out.println("Payment: " + record.getPaymentAmount()
                    + " on " + record.getPaymentDate());
            System.out.println("Commission Rate: " + record.getCommissionRate()
                    + " | Commission Amount: " + record.getCommissionAmount());
            System.out.println("Record Owner ID: 27884");

        } catch (RealEstateDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
