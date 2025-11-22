package _27926.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) {
        super(id, createdDate, updatedDate, bankName, branchCode, address);

        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new BankDataException("Account number cannot be empty");
        }
        if (accountType == null || accountType.isEmpty()) {
            throw new BankDataException("Account type cannot be empty");
        }
        if (balance < 0) {
            throw new BankDataException("Balance must be ≥ 0");
        }

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new BankDataException("Balance must be ≥ 0");
        }
        this.balance = balance;
    }
}
