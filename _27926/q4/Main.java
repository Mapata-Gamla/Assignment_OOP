package _27926.q4;

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

            System.out.print("Enter hotel name: ");
            String hotelName = sc.nextLine();

            System.out.print("Enter hotel address: ");
            String hotelAddress = sc.nextLine();

            System.out.print("Enter hotel phone (10 digits): ");
            String hotelPhone = sc.nextLine();

            System.out.print("Enter hotel email: ");
            String hotelEmail = sc.nextLine();

            System.out.print("Enter room number: ");
            String roomNumber = sc.nextLine();

            System.out.print("Enter room type: ");
            String roomType = sc.nextLine();

            System.out.print("Enter price per night: ");
            double pricePerNight = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter customer email: ");
            String customerEmail = sc.nextLine();

            System.out.print("Enter customer contact number (10 digits): ");
            String customerContact = sc.nextLine();

            System.out.print("Enter booking date: ");
            String bookingDate = sc.nextLine();

            System.out.print("Enter check-in date: ");
            String checkInDate = sc.nextLine();

            System.out.print("Enter check-out date: ");
            String checkOutDate = sc.nextLine();

            System.out.print("Enter service name: ");
            String serviceName = sc.nextLine();

            System.out.print("Enter service cost: ");
            double serviceCost = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter payment method: ");
            String paymentMethod = sc.nextLine();

            System.out.print("Enter payment date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter room charge: ");
            double roomCharge = sc.nextDouble();

            System.out.print("Enter service charge: ");
            double serviceCharge = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter rating (1-5): ");
            int rating = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter comments: ");
            String comments = sc.nextLine();

            ReservationRecord record = new ReservationRecord(
                    id, createdDate, updatedDate,
                    hotelName, hotelAddress, hotelPhone, hotelEmail,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, customerContact,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge,
                    rating, comments
            );

            double totalBill = record.generateBill();

            System.out.println("\n===== RESERVATION RECORD (ID: 27884) =====");
            System.out.println("Hotel: " + record.getHotelName()
                    + " | Address: " + record.getAddress());
            System.out.println("Room: " + record.getRoomNumber()
                    + " | Type: " + record.getRoomType()
                    + " | Price/Night: " + record.getPricePerNight());
            System.out.println("Customer: " + record.getCustomerName()
                    + " | Email: " + record.getCustomerEmail()
                    + " | Contact: " + record.getContactNumber());
            System.out.println("Booking: " + record.getBookingDate()
                    + " | Check-in: " + record.getCheckInDate()
                    + " | Check-out: " + record.getCheckOutDate());
            System.out.println("Service: " + record.getServiceName()
                    + " | Cost: " + record.getServiceCost());
            System.out.println("Payment: " + record.getPaymentMethod()
                    + " | Date: " + record.getPaymentDate());
            System.out.println("Room Charge: " + record.getRoomCharge());
            System.out.println("Service Charge: " + record.getServiceCharge());
            System.out.println("Total Bill: " + record.getTotalBill()
                    + " | Rating: " + record.getRating()
                    + " | Comments: " + record.getComments()
                    + " | 27884");

        } catch (ReservationDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
