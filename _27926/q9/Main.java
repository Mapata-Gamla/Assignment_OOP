package _27926.q9;

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

            System.out.print("Enter airline name: ");
            String airlineName = sc.nextLine();

            System.out.print("Enter airline address: ");
            String address = sc.nextLine();

            System.out.print("Enter airline contact email: ");
            String contactEmail = sc.nextLine();

            System.out.print("Enter flight number: ");
            String flightNumber = sc.nextLine();

            System.out.print("Enter destination: ");
            String destination = sc.nextLine();

            System.out.print("Enter departure time: ");
            String departureTime = sc.nextLine();

            System.out.print("Enter passenger name: ");
            String passengerName = sc.nextLine();

            System.out.print("Enter passport number: ");
            String passportNumber = sc.nextLine();

            System.out.print("Enter nationality: ");
            String nationality = sc.nextLine();

            System.out.print("Enter seat number: ");
            String seatNumber = sc.nextLine();

            System.out.print("Enter seat type (Economy/Business): ");
            String seatType = sc.nextLine();

            System.out.print("Enter ticket number: ");
            String ticketNumber = sc.nextLine();

            System.out.print("Enter ticket price: ");
            double price = sc.nextDouble();

            System.out.print("Enter baggage weight: ");
            double baggageWeight = sc.nextDouble();

            System.out.print("Enter baggage fee: ");
            double baggageFee = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter payment date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter payment mode: ");
            String paymentMode = sc.nextLine();

            double initialTotalFare = 1.0;

            TicketRecord record = new TicketRecord(
                    id, createdDate, updatedDate,
                    airlineName, address, contactEmail,
                    flightNumber, destination, departureTime,
                    passengerName, passportNumber, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode,
                    initialTotalFare
            );

            double totalFare = record.generateInvoice();

            System.out.println("\n===== TICKET RECORD (ID: 27884) =====");
            System.out.println("Airline: " + record.getAirlineName()
                    + " | Address: " + record.getAddress()
                    + " | Contact: " + record.getContactEmail());
            System.out.println("Flight: " + record.getFlightNumber()
                    + " | Destination: " + record.getDestination()
                    + " | Departure: " + record.getDepartureTime());
            System.out.println("Passenger: " + record.getPassengerName()
                    + " | Passport: " + record.getPassportNumber()
                    + " | Nationality: " + record.getNationality());
            System.out.println("Seat: " + record.getSeatNumber()
                    + " | Type: " + record.getSeatType());
            System.out.println("Ticket: " + record.getTicketNumber()
                    + " | Price: " + record.getPrice());
            System.out.println("Baggage: " + record.getBaggageWeight()
                    + "kg | Fee: " + record.getBaggageFee());
            System.out.println("Payment: " + record.getPaymentDate()
                    + " | Mode: " + record.getPaymentMode());
            System.out.println("Total Fare (price + baggageFee): " + totalFare
                    + " | 27884");

        } catch (AirlineDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
