package _27926.q8;

public final class LibraryRecord extends Record {

    public LibraryRecord(int id, String createdDate, String updatedDate,
                         String libraryName, String location, String phoneNumber,
                         String sectionName, String sectionCode,
                         String title, String author, String isbn,
                         String memberName, int memberId, String contactNumber,
                         String borrowDate, String returnDate,
                         double fineAmount, int daysLate,
                         String paymentDate, String paymentMode,
                         double totalFine) {
        super(id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, memberId, contactNumber,
                borrowDate, returnDate,
                fineAmount, daysLate,
                paymentDate, paymentMode,
                totalFine);
    }

    public double calculateFine() {
        double value = getFineAmount() * getDaysLate();
        setTotalFine(value);
        return value;
    }
}
