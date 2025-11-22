package _27926.q8;

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

            System.out.print("Enter library name: ");
            String libraryName = sc.nextLine();

            System.out.print("Enter library location: ");
            String location = sc.nextLine();

            System.out.print("Enter library phone (10 digits): ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter section name: ");
            String sectionName = sc.nextLine();

            System.out.print("Enter section code: ");
            String sectionCode = sc.nextLine();

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter book author: ");
            String author = sc.nextLine();

            System.out.print("Enter book ISBN: ");
            String isbn = sc.nextLine();

            System.out.print("Enter member name: ");
            String memberName = sc.nextLine();

            System.out.print("Enter member ID (>0): ");
            int memberId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter member contact number: ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter borrow date: ");
            String borrowDate = sc.nextLine();

            System.out.print("Enter return date: ");
            String returnDate = sc.nextLine();

            System.out.print("Enter fine amount per day: ");
            double fineAmount = sc.nextDouble();

            System.out.print("Enter days late: ");
            int daysLate = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter payment date: ");
            String paymentDate = sc.nextLine();

            System.out.print("Enter payment mode: ");
            String paymentMode = sc.nextLine();

            double initialTotalFine = 1.0;

            LibraryRecord record = new LibraryRecord(
                    id, createdDate, updatedDate,
                    libraryName, location, phoneNumber,
                    sectionName, sectionCode,
                    title, author, isbn,
                    memberName, memberId, contactNumber,
                    borrowDate, returnDate,
                    fineAmount, daysLate,
                    paymentDate, paymentMode,
                    initialTotalFine
            );

            double totalFine = record.calculateFine();

            System.out.println("\n===== LIBRARY RECORD (ID: 27884) =====");
            System.out.println("Library: " + record.getLibraryName()
                    + " | Location: " + record.getLocation()
                    + " | Phone: " + record.getPhoneNumber());
            System.out.println("Section: " + record.getSectionName()
                    + " | Code: " + record.getSectionCode());
            System.out.println("Book: " + record.getTitle()
                    + " | Author: " + record.getAuthor()
                    + " | ISBN: " + record.getIsbn());
            System.out.println("Member: " + record.getMemberName()
                    + " | ID: " + record.getMemberId()
                    + " | Contact: " + record.getContactNumber());
            System.out.println("Borrow: " + record.getBorrowDate()
                    + " → " + record.getReturnDate());
            System.out.println("Fine per day: " + record.getFineAmount()
                    + " | Days late: " + record.getDaysLate());
            System.out.println("Payment: " + record.getPaymentDate()
                    + " | Mode: " + record.getPaymentMode());
            System.out.println("Total Fine: " + totalFine
                    + " | 27884");

        } catch (LibraryDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
