package _27926.q10;

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

            System.out.print("Enter store name: ");
            String storeName = sc.nextLine();

            System.out.print("Enter store address: ");
            String storeAddress = sc.nextLine();

            System.out.print("Enter store email: ");
            String storeEmail = sc.nextLine();

            System.out.print("Enter category name: ");
            String categoryName = sc.nextLine();

            System.out.print("Enter category code: ");
            String categoryCode = sc.nextLine();

            System.out.print("Enter product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter customer contact number: ");
            String contactNumber = sc.nextLine();

            System.out.print("Enter customer address: ");
            String customerAddress = sc.nextLine();

            System.out.print("Enter order date: ");
            String orderDate = sc.nextLine();

            System.out.print("Enter order ID: ");
            String orderId = sc.nextLine();

            System.out.print("Enter payment method: ");
            String paymentMethod = sc.nextLine();

            System.out.print("Enter payment status: ");
            String paymentStatus = sc.nextLine();

            System.out.print("Enter shipping address: ");
            String shippingAddress = sc.nextLine();

            System.out.print("Enter shipping cost: ");
            double shippingCost = sc.nextDouble();
            sc.nextLine();

            double initialTotalAmount = 1.0;

            OrderRecord record = new OrderRecord(
                    id, createdDate, updatedDate,
                    storeName, storeAddress, storeEmail,
                    categoryName, categoryCode,
                    productName, productCode, price,
                    customerName, contactNumber, customerAddress,
                    orderDate, orderId,
                    paymentMethod, paymentStatus,
                    shippingAddress, shippingCost,
                    initialTotalAmount
            );

            double totalAmount = record.calculateTotalAmount();

            System.out.println("\n===== ORDER RECORD (ID: 27884) =====");
            System.out.println("Store: " + record.getStoreName()
                    + " | Address: " + record.getAddress()
                    + " | Email: " + record.getEmail());
            System.out.println("Category: " + record.getCategoryName()
                    + " | Code: " + record.getCategoryCode());
            System.out.println("Product: " + record.getProductName()
                    + " | Code: " + record.getProductCode()
                    + " | Price: " + record.getPrice());
            System.out.println("Customer: " + record.getCustomerName()
                    + " | Contact: " + record.getContactNumber()
                    + " | Address: " + record.getCustomerAddress());
            System.out.println("Order: " + record.getOrderId()
                    + " | Date: " + record.getOrderDate());
            System.out.println("Payment: " + record.getPaymentMethod()
                    + " | Status: " + record.getPaymentStatus());
            System.out.println("Shipping: " + record.getShippingAddress()
                    + " | Cost: " + record.getShippingCost());
            System.out.println("Total Amount (price + shipping): " + totalAmount
                    + " | 27884");

        } catch (ShoppingDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
