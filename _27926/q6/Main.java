package _27926.q6;

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

            System.out.print("Enter bank name: ");
            String bankName = sc.nextLine();

            System.out.print("Enter branch code: ");
            String branchCode = sc.nextLine();

            System.out.print("Enter bank address: ");
            String address = sc.nextLine();

            System.out.print("Enter account number: ");
            String accountNumber = sc.nextLine();

            System.out.print("Enter account type: ");
            String accountType = sc.nextLine();

            System.out.print("Enter balance: ");
            double balance = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            System.out.print("Enter customer email: ");
            String email = sc.nextLine();

            System.out.print("Enter customer phone (10 digits): ");
            String phone = sc.nextLine();

            System.out.print("Enter transaction ID: ");
            String transactionId = sc.nextLine();

            System.out.print("Enter transaction type: ");
            String transactionType = sc.nextLine();

            System.out.print("Enter transaction amount: ");
            double amount = sc.nextDouble();

            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter deposit date: ");
            String depositDate = sc.nextLine();

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter withdrawal date: ");
            String withdrawalDate = sc.nextLine();

            System.out.print("Enter loan amount: ");
            double loanAmount = sc.nextDouble();

            System.out.print("Enter interest rate: ");
            double interestRate = sc.nextDouble();

            System.out.print("Enter loan duration: ");
            double duration = sc.nextDouble();

            System.out.print("Enter payment amount: ");
            double paymentAmount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter payment date: ");
            String paymentDate = sc.nextLine();

            AccountRecord record = new AccountRecord(
                    id, createdDate, updatedDate,
                    bankName, branchCode, address,
                    accountNumber, accountType, balance,
                    customerName, email, phone,
                    transactionId, transactionType, amount,
                    depositAmount, depositDate,
                    withdrawalAmount, withdrawalDate,
                    loanAmount, interestRate, duration,
                    paymentAmount, paymentDate
            );

            double interest = record.calculateInterest();

            System.out.println("\n===== ACCOUNT RECORD (ID: 27884) =====");
            System.out.println("Bank: " + record.getBankName()
                    + " | Branch Code: " + record.getBranchCode()
                    + " | Address: " + record.getAddress());
            System.out.println("Account: " + record.getAccountNumber()
                    + " | Type: " + record.getAccountType()
                    + " | Balance: " + record.getBalance());
            System.out.println("Customer: " + record.getCustomerName()
                    + " | Email: " + record.getEmail()
                    + " | Phone: " + record.getPhoneNumber());
            System.out.println("Transaction: " + record.getTransactionId()
                    + " | Type: " + record.getTransactionType()
                    + " | Amount: " + record.getAmount());
            System.out.println("Deposit: " + record.getDepositAmount()
                    + " on " + record.getDepositDate());
            System.out.println("Withdrawal: " + record.getWithdrawalAmount()
                    + " on " + record.getWithdrawalDate());
            System.out.println("Loan: " + record.getLoanAmount()
                    + " | Rate: " + record.getInterestRate()
                    + " | Duration: " + record.getDuration());
            System.out.println("Payment: " + record.getPaymentAmount()
                    + " on " + record.getPaymentDate());
            System.out.println("Calculated Interest: " + interest
                    + " | 27884");

        } catch (BankDataException ex) {
            System.out.println("Data error (27884): " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error (27884): " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
