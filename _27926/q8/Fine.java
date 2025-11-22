package _27926.q8;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String isbn,
                String memberName, int memberId, String contactNumber,
                String borrowDate, String returnDate,
                double fineAmount, int daysLate) {
        super(id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode,
                title, author, isbn,
                memberName, memberId, contactNumber,
                borrowDate, returnDate);

        if (fineAmount < 0) {
            throw new LibraryDataException("Fine amount must be ≥ 0");
        }
        if (daysLate < 0) {
            throw new LibraryDataException("Days late must be ≥ 0");
        }

        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public int getDaysLate() {
        return daysLate;
    }
}
