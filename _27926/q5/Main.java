package _27926.q5;

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

            System.out.print("Enter company name: ");
            String companyName = sc.nextLine();

            System.out.print("Enter company address: ");
            String companyAddress = sc.nextLine();

            System.out.print("Enter company phone (10 digits): ");
            String companyPhone = sc.nextLine();

            System.out.print("Enter branch name: ");
            String branchName = sc.nextLine();

            System.out.print("Enter branch location code: ");
            String locationCode = sc.nextLine();

            System.out.print("Enter vehicle type: ");
            String vehicleType = sc.nextLine();

            System.out.print("Enter vehicle registration number: ");
            String registrationNumber = sc.nextLine();

            System.out.print("Enter daily rate: ");
            double dailyRate = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter license number: ");
            String licenseNumber = sc.nextLine();

            System.out.print("Enter customer contact number (10 digits): ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter rental date: ");
            String rentalDate = sc.nextLine();

            System.out.print("Enter return date: ");
            String returnDate = sc.nextLine();

            System.out.print("Enter rental days: ");
            int rentalDays = sc.nextInt();

            System.out.print("Enter rental charge: ");
            double rentalCharge = sc.nextDouble();

            System.out.print("Enter penalty charge: ");
            double penaltyCharge = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter payment mode: ");
            String paymentMode = sc.nextLine();

            System.out.print("Enter transaction ID: ");
            String transactionId = sc.nextLine();

            RentalRecord record = new RentalRecord(
                    id, createdDate, updatedDate,
                    companyName, companyAddress, companyPhone,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, licenseNumber, contactNumber,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId
            );

            double total = record.calculateTotalCharge();

            System.out.println("\n===== VEHICLE RENTAL RECORD (ID: 27884) =====");
            System.out.println("Company: " + record.getCompanyName()
                    + " | Address: " + record.getAddress()
                    + " | Phone: " + record.getPhoneNumber());
            System.out.println("Branch: " + record.getBranchName()
                    + " | Location Code: " + record.getLocationCode());
            System.out.println("Vehicle: " + record.getVehicleType()
                    + " | Reg#: " + record.getRegistrationNumber()
                    + " | Daily Rate: " + record.getDailyRate());
            System.out.println("Customer: " + record.getCustomerName()
                    + " | License: " + record.getLicenseNumber()
                    + " | Contact: " + record.getContactNumber());
            System.out.println("Rental: " + record.getRentalDate()
                    + " → " + record.getReturnDate()
                    + " | Days: " + record.getRentalDays());
            System.out.println("Rental Charge: " + record.getRentalCharge());
            System.out.println("Penalty Charge: " + record.getPenaltyCharge());
            System.out.println("Total Charge: " + record.getTotalCharge()
                    + " | 27884");

        } catch (RentalDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
