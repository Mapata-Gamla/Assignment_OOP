package _27926.q8;

public class Payment extends Fine {
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String isbn,
                   String memberName, int memberId, String contactNumber,
                   String borrowDate, String returnDate,
                   double fineAmount, int daysLate,
                   String paymentDate, String paymentMode) {
        super(id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, memberId, contactNumber,
                borrowDate, returnDate,
                fineAmount, daysLate);

        if (paymentDate == null || paymentDate.isEmpty()) {
            throw new LibraryDataException("Payment date cannot be empty");
        }
        if (paymentMode == null || paymentMode.isEmpty()) {
            throw new LibraryDataException("Payment mode cannot be empty");
        }

        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }
}
