package _27926.q10;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate,
                    String storeName, String address, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress,
                    String orderDate, String orderId,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) {
        super(id, createdDate, updatedDate,
                storeName, address, email,
                categoryName, categoryCode,
                productName, productCode, price,
                customerName, contactNumber, customerAddress,
                orderDate, orderId,
                paymentMethod, paymentStatus);

        if (shippingAddress == null || shippingAddress.isEmpty()) {
            throw new ShoppingDataException("Shipping address cannot be empty");
        }
        if (shippingCost < 0) {
            throw new ShoppingDataException("Shipping cost must be ≥ 0");
        }

        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double getShippingCost() {
        return shippingCost;
    }
}
