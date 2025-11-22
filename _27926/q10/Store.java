package _27926.q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email) {
        super(id, createdDate, updatedDate);

        if (storeName == null || storeName.isEmpty()) {
            throw new ShoppingDataException("Store name cannot be empty");
        }
        if (address == null || address.isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty");
        }
        if (email == null || !email.matches("^.+@.+\\..+$")) {
            throw new ShoppingDataException("Invalid store email");
        }

        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
