package _27926.q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String isbn,
                  String memberName, int memberId, String contactNumber) {
        super(id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode,
                title, author, isbn);

        if (memberName == null || memberName.isEmpty()) {
            throw new LibraryDataException("Member name cannot be empty");
        }
        if (memberId <= 0) {
            throw new LibraryDataException("Member ID must be > 0");
        }
        if (contactNumber == null || contactNumber.isEmpty()) {
            throw new LibraryDataException("Contact number cannot be empty");
        }

        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
