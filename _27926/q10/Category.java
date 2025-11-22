package _27926.q10;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate,
                storeName, address, email);

        if (categoryName == null || categoryName.isEmpty()) {
            throw new ShoppingDataException("Category name cannot be empty");
        }
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("Category code must be at least 3 characters");
        }

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }
}
