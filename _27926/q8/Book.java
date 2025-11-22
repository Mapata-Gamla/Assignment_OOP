package _27926.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String isbn;

    public Book(int id, String createdDate, String updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String isbn) {
        super(id, createdDate, updatedDate,
                libraryName, location, phoneNumber,
                sectionName, sectionCode);

        if (title == null || title.isEmpty()) {
            throw new LibraryDataException("Title cannot be empty");
        }
        if (author == null || author.isEmpty()) {
            throw new LibraryDataException("Author cannot be empty");
        }
        if (isbn == null || isbn.length() < 10) {
            throw new LibraryDataException("ISBN must be at least 10 characters");
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
